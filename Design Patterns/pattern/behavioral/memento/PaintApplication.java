package pl.vm.javaguild.designpatterns.pattern.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaintApplication {

    public static void main(String[] args) {
        Canvas myCanvas = new Canvas();
        Caretaker caretaker = new Caretaker(myCanvas);

        // Draw and fill actions
        myCanvas.draw("Circle");
        caretaker.save(); // Save state
        myCanvas.fill("Red");
        caretaker.save(); // Save state
        myCanvas.draw("Triangle");

        log.info("Canvas after all operations:" + myCanvas);
        // Undo changes
        caretaker.undo(); // Undo the draw triangle
        log.info("Canvas after undo draw triangle:" + myCanvas);
        caretaker.undo(); // Undo the fill red
        log.info("Canvas after undo fill red:" + myCanvas);
    }
}