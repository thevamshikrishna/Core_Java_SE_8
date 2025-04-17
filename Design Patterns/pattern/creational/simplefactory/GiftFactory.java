package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory;

import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.Gift;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.GiftType;

import java.util.Optional;

/**
 * Base factory definition for creating different types of {@link Gift}
 */
@FunctionalInterface
public interface GiftFactory {

    /**
     * Creates {@link Gift} based given {@link GiftType}
     *
     * @param giftType as a determiner of specific type
     * @return optional of created gift, empty if not created based on type
     */
    Optional<Gift> create(GiftType giftType);
}
