package pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.model;

import pl.vm.javaguild.designpatterns.pattern.behavioral.visitor.BuildingPartVisitor;

public class House implements BuildingPart {
		BuildingPart[] parts;

		public House() {
			parts = new BuildingPart[] { new Kitchen(), new LivingRoom(), new Bathroom() };
		}

		public void accept(BuildingPartVisitor visitor) {
			for (BuildingPart part : parts) {
				part.accept(visitor);
			}
			visitor.visit(this);
		}
	}