package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.processor;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop.Laptop;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

/**
 * Interface Processor is a component that Laptop consists of
 * @see Laptop
 */
public interface Processor {

    /**
     *
     * @return qualityLevel of processor
     */
    QualityLevel getQualityLevel();

    /**
     *
     * @return name of processor
     */
    String getName();

    /**
     *
     * @return description of processor
     */
    String getDescription();
}