package pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model;

import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.BuildingPartVisitor;

public class Kitchen implements BuildingPart {

    public void accept(BuildingPartVisitor visitor) {
        visitor.visit(this);
    }
}