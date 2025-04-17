package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop;

import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.Producer;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

@Slf4j
public abstract class Laptop {

    String modelName;
    Producer producer;

    Processor processor;
    GraphicCard graphicCard;
    Motherboard motherboard;

    public void mountComponents() {
        log.info("Mounting processor:" + processor.getName() + ", graphic card: " + graphicCard.getName() + ", motherboard:" +  motherboard.getName());
    }

    public void box() {
        log.info("Boxing laptop " + modelName);
    }

    public void deliver() {
        log.info("Delivering laptop " + modelName + " to client");
    }
}