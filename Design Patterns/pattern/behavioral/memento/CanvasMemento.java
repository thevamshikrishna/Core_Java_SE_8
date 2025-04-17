package pl.vm.javaguild.designpatterns.pattern.behavioral.memento;

class CanvasMemento {
	private final String canvasState;

	public CanvasMemento(String state) {
		this.canvasState = state;
	}

	public String getState() {
		return canvasState;
	}
}