package pl.vm.javaguild.designpatterns.pattern.behavioral.memento;

import java.util.LinkedList;
import java.util.List;

class Caretaker {
	private final List<CanvasMemento> saveStates = new LinkedList<>();
	private final Canvas canvas;

	public Caretaker(Canvas canvas) {
		this.canvas = canvas;
	}

	// Saving state of the originator
	public void save() {
		if (saveStates.size() == 10) {
			saveStates.remove(0); // ensure only 10 states are kept
		}
		saveStates.add(canvas.save());
	}

	// Restoring state
	public void undo() {
		if (!saveStates.isEmpty()) {
			CanvasMemento memento = saveStates.remove(saveStates.size() - 1);
			canvas.undoToLastSave(memento);
		}
	}
}