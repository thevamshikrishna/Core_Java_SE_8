package pl.vm.javaguild.designpatterns.pattern.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.Bathroom;
import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.House;
import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.Kitchen;
import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model.LivingRoom;

@Slf4j
class BuildingInspector implements BuildingPartVisitor {

    public void visit(Kitchen kitchen) {
        log.info("Inspecting the quality of kitchen appliances and safety.");
    }

    public void visit(LivingRoom livingRoom) {
        log.info("Checking living room space and ventilation.");
    }

    public void visit(Bathroom bathroom) {
        log.info("Inspecting plumbing and hygiene conditions in the bathroom.");
    }

    public void visit(House house) {
        log.info("Performing overall structural integrity check of the house.");
    }
}