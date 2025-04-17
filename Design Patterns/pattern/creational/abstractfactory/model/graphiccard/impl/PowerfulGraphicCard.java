package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.impl;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.graphiccard.GraphicCard;

public class PowerfulGraphicCard implements GraphicCard {

    @Override
    public QualityLevel getQualityLevel() {
        return QualityLevel.HIGH;
    }

    @Override
    public String getName() {
        return "GeForce RTX 3080 GamingPro 12GB GDDR6X";
    }

    @Override
    public String getDescription() {
        return "Very expensive and powerful graphic cards for newest games";
    }
}