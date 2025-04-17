package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.motherboard;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop.Laptop;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

/**
 * Interface GraphicCard is a component that Laptop consists of
 *
 * @author Wojciech Dudziak
 * @since 06-12-2022
 * @see Laptop
 */
public interface Motherboard {

    /**
     *
     * @return qualityLevel of motherboard
     */
    QualityLevel getQualityLevel();

    /**
     *
     * @return name of motherboard
     */
    String getName();

    /**
     *
     * @return description of motherboard
     */
    String getDescription();
}