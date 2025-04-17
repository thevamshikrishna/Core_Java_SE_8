package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.Producer;

public class SamsungLaptop extends Laptop {

    public SamsungLaptop(LaptopComponentFactory componentFactory) {
        this.producer = Producer.SAMSUNG;
        this.motherboard = componentFactory.createMotherBoard();
        this.graphicCard = componentFactory.createGraphicCard();
        this.processor = componentFactory.createProcessor();
        this.modelName = processor.getQualityLevel().toString() + " Samsung laptop model";
    }
}