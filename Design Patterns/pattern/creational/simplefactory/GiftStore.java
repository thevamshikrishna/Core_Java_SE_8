package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory;

import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.Gift;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.GiftType;

/**
 * Main business logic component for interacting with simple factory design pattern.
 */
public interface GiftStore {

    /**
     * Buys {@link Gift} based in given {@link GiftType}
     *
     * @param giftType
     * @return wanted gift
     */
    Gift buyGift(GiftType giftType);

    /**
     * Gets currently assigned {@link GiftFactory}
     *
     * @return assigned gift factory
     */
    GiftFactory getFactory();
}
