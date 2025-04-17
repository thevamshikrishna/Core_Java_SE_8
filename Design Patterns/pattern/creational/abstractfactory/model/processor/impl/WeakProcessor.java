package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor.Processor;

public class WeakProcessor implements Processor {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.LOW;
    }

    @Override
    public String getName() {
        return "Intel Pentium Gold G6500";
    }

    @Override
    public String getDescription() {
        return "cool processor for playing Mario";
    }
}