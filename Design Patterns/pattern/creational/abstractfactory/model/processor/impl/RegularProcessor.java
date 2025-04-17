package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

public class RegularProcessor implements Processor {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.MEDIUM;
    }

    @Override
    public String getName() {
        return "Intel Core i5-12400F";
    }

    @Override
    public String getDescription() {
        return "good processor with good performance and good price";
    }
}