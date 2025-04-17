package pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model;

import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.BuildingPartVisitor;

interface BuildingPart {

    void accept(BuildingPartVisitor visitor);
}