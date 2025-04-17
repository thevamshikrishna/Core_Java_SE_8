package pl.vm.javaguild.designpatterns.pattern.creational.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.Prototype;

@Getter
@AllArgsConstructor
public abstract class Person<T> extends Prototype<T> {

    @Setter
    protected String name;

    abstract void showInfo();
}
