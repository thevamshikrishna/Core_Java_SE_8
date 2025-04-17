package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.Producer;

public class DellLaptop extends Laptop {

    public DellLaptop(LaptopComponentFactory componentFactory) {
        this.producer = Producer.DELL;
        motherboard = componentFactory.createMotherBoard();
        graphicCard = componentFactory.createGraphicCard();
        processor = componentFactory.createProcessor();
        this.modelName = processor.getQualityLevel().toString() + " Dell laptop model";
    }
}