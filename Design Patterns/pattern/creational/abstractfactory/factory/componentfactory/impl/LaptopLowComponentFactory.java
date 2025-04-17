package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.impl.WeakGraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.impl.WeakMotherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.impl.WeakProcessor;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

public class LaptopLowComponentFactory implements LaptopComponentFactory {
    @Override
    public Processor createProcessor() {
        return new WeakProcessor();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new WeakGraphicCard();
    }

    @Override
    public Motherboard createMotherBoard() {
        return new WeakMotherboard();
    }
}
