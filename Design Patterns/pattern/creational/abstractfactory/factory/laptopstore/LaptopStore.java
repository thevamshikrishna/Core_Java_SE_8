package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.laptopstore;

import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.QualityLevel;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.laptop.Laptop;

/**
 * Class representing Factory Method, simulates ordering laptop of different quality
 */
public abstract class LaptopStore {

    /** perform a series of actions on {@link Laptop}
     * created based on given {@link QualityLevel}
     *
     * @param qualityLevel
     * @return Laptop
     */
    public Laptop orderLaptop(QualityLevel qualityLevel) {
        Laptop laptop = createLaptop(qualityLevel);
        laptop.mountComponents();
        laptop.box();
        laptop.deliver();

        return laptop;
    }

    /**
     * Subclasses will override this method in order to create specific Laptop objects
     * example of factory method
     * @return Laptop
     */
    protected abstract Laptop createLaptop(QualityLevel qualityLevel);
}