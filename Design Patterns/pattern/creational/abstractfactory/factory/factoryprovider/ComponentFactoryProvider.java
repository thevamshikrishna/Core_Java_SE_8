package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.factoryprovider;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl.LaptopHighComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl.LaptopLowComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl.LaptopMediumComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;

import static java.util.Objects.requireNonNull;

/**
 * Class that returns implementations of ComponentFactory, depending on chosen QualityLevel
 * @see QualityLevel
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ComponentFactoryProvider {

    public static LaptopComponentFactory getComponentFactory(QualityLevel qualityLevel) {
        requireNonNull(qualityLevel);

        return switch (qualityLevel) {
            case LOW -> new LaptopLowComponentFactory();
            case MEDIUM -> new LaptopMediumComponentFactory();
            case HIGH -> new LaptopHighComponentFactory();
        };
    }
}