package pl.vm.javaguild.designpatterns.pattern.behavioral.memento;

class Canvas {
	private String content = "";

	public void draw(String shape) {
		content += " draw:" + shape;
	}

	public void fill(String color) {
		content += " fill:" + color;
	}

	// Creates a new Memento with a new state
	public CanvasMemento save() {
		return new CanvasMemento(content);
	}

	// Restores the state from the Memento
	public void undoToLastSave(Object obj) {
		CanvasMemento memento = (CanvasMemento) obj;
		content = memento.getState();
	}

	@Override
	public String toString() {
		return content;
	}
}