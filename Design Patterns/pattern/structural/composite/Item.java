package pl.vm.javaguild.designpatterns.pattern.structural.composite;

/**
 * Main <b>component</b> of composite pattern.
 */
public interface Item {

    /**
     * @return name of item.
     */
    String getName();

    /**
     * @return power of item.
     */
    Long getPower();

    /**
     * Add item to composite.
     */
    void add(Item item);

    /**
     * Removes item from composite.
     */
    void remove(Item item);
}
