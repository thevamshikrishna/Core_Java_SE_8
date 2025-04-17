package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.exception;

import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.GiftType;

public class GiftNotCreatedException extends RuntimeException {

    public GiftNotCreatedException(GiftType giftType) {
        super("Gift with type " + giftType + " could not be created.");
    }
}
