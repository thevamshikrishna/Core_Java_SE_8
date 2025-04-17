package pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.adapter;

import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.GiftFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.FlyAndAdmire5;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.FreshCutGrassX;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.Gift;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.GiftType;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.HanSoloShip;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.MoveWithMePro;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.WaterByGio;
import pl.vm.javaguild.designpatterns.pattern.creational.simplefactory.model.XPlayOne;

import java.util.Optional;

import static java.util.Objects.requireNonNull;

public record GiftFactoryAdapter() implements GiftFactory {

    @Override
    public Optional<Gift> create(GiftType giftType) {

        requireNonNull(giftType);

        Gift gift = switch (giftType) {
            case CONSOLE -> new XPlayOne();
            case DRONE -> new FlyAndAdmire5();
            case FRAGRANCE -> new WaterByGio();
            case BRICKS -> new HanSoloShip();
            case HOUSEHOLD_TOOLS -> new FreshCutGrassX();
            case SPORT_ACCESSORIES -> new MoveWithMePro();
            default -> null;
        };

        return Optional.ofNullable(gift);
    }
}
