package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.laptopstore.impl;

import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.laptopstore.LaptopStore;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop.DellLaptop;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop.Laptop;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

import static pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.factoryprovider.ComponentFactoryProvider.getComponentFactory;

@Slf4j
public class DellLaptopStore extends LaptopStore {

    @Override
    protected Laptop createLaptop(QualityLevel qualityLevel) {
        log.info("Building laptop in DellLaptopStore of {} quality.", qualityLevel);
        LaptopComponentFactory componentFactory = getComponentFactory(qualityLevel);

        return new DellLaptop(componentFactory);
    }
}