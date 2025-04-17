package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.adapter;

import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.GiftFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.GiftStore;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.exception.GiftNotCreatedException;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.Gift;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.GiftType;

public record GiftStoreAdapter(GiftFactory giftFactory) implements GiftStore {

    @Override
    public Gift buyGift(GiftType giftType) {
        return giftFactory.create(giftType)
                .orElseThrow(() -> new GiftNotCreatedException(giftType));
    }

    @Override
    public GiftFactory getFactory() {
        return giftFactory;
    }
}
