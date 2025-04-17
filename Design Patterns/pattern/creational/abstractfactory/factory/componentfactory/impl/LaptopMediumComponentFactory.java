package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.impl.RegularGraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.impl.RegularMotherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.impl.RegularProcessor;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

public class LaptopMediumComponentFactory implements LaptopComponentFactory {
    @Override
    public Processor createProcessor() {
        return new RegularProcessor();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new RegularGraphicCard();
    }

    @Override
    public Motherboard createMotherBoard() {
        return new RegularMotherboard();
    }
}