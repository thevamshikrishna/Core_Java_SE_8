package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.impl.PowerfulGraphicCard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.Motherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard.impl.PowerfulMotherboard;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.impl.PowerfulProcessor;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

public class LaptopHighComponentFactory implements LaptopComponentFactory {
    @Override
    public Processor createProcessor() {
        return new PowerfulProcessor();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new PowerfulGraphicCard();
    }

    @Override
    public Motherboard createMotherBoard() {
        return new PowerfulMotherboard();
    }
}
