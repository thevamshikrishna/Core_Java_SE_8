package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

/**
 *  The abstract factory for creating components for laptop
 *  Subclasses produce concrete implementations
 */
public interface LaptopComponentFactory {

    /**
     *
     * @return processor
     */
    Processor createProcessor();

    /**
     *
     * @return graphic card
     */
    GraphicCard createGraphicCard();

    /**
     *
     * @return motherboard
     */
    Motherboard createMotherBoard();
}