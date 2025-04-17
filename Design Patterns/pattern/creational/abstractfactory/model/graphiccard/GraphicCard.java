package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop.Laptop;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

/**
 * Interface GraphicCard is a component that Laptop consists of
 *
 * @author Wojciech Dudziak
 * @since 06-12-2022
 * @see Laptop
 */
public interface GraphicCard {

    /**
     *
     * @return qualityLevel of graphic card
     */
    QualityLevel getQualityLevel();

    /**
     *
     * @return name of graphic card
     */
    String getName();

    /**
     *
     * @return description of graphic card
     */
    String getDescription();
}
