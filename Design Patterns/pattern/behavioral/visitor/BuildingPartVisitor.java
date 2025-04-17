package pl.vm.javaguild.designpatterns.pattern.behavioral.visitor;

import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.Bathroom;
import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.House;
import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.Kitchen;
import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.LivingRoom;

public interface BuildingPartVisitor {

    void visit(Kitchen kitchen);

    void visit(LivingRoom livingRoom);

    void visit(Bathroom bathroom);

    void visit(House house);
}