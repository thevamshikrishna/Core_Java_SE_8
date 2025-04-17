package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

public class PowerfulProcessor implements Processor {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.HIGH;
    }

    @Override
    public String getName() {
        return "Intel Core i7-13700KF ";
    }

    @Override
    public String getDescription() {
        return "Very powerful processor for gaming";
    }
}