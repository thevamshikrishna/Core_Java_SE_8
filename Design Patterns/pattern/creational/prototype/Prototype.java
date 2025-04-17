package pl.vm.javaguild.designpatterns.pattern.creational.prototype;

import pl.vm.javaguild.designpatterns.pattern.creational.prototype.exception.CloneNotSupportedRuntimeException;

/**
 * Main definition of prototype design pattern.
 * It provides cloning logic via {@link Prototype#clone()} ()}
 *
 * @param <T> generic type to be cloned
 */
public abstract class Prototype<T> implements Cloneable {

    /**
     * Create <b>shallow copy</b> of this object.
     * <p>
     * It should be overridden, whenever special logic should be added.
     *
     * @return copy of this
     */
    public T copy() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedRuntimeException("Cannot copy current object: " + this, e);
        }
    }
}
