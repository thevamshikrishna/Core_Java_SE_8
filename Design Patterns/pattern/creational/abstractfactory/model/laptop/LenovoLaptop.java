package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.Producer;

public class LenovoLaptop extends Laptop {

    public LenovoLaptop(LaptopComponentFactory componentFactory) {
        this.producer = Producer.LENOVO;
        motherboard = componentFactory.createMotherBoard();
        graphicCard = componentFactory.createGraphicCard();
        processor = componentFactory.createProcessor();
        this.modelName = processor.getQualityLevel().toString() + " Lenovo laptop model";
    }
}