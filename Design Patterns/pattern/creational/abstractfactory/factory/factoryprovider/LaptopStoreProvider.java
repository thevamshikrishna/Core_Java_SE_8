package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.factoryprovider;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.laptopstore.impl.DellLaptopStore;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.laptopstore.LaptopStore;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.laptopstore.impl.LenovoLaptopStore;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.laptopstore.impl.SamsungLaptopStore;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.Producer;

import static java.util.Objects.requireNonNull;

/**
 * Class that returns implementations of LaptopStore, depending on chosen Producer
 * @see Producer
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LaptopStoreProvider {

    public static LaptopStore getLaptopStore(Producer producer) {
        requireNonNull(producer);

        return switch (producer) {
            case DELL -> new DellLaptopStore();
            case SAMSUNG -> new SamsungLaptopStore();
            case LENOVO -> new LenovoLaptopStore();
        };
    }
}