package pl.vm.javaguild.designpatterns.pattern.creational.singleton.model;

/**
 * Simplest implementation of Singleton, it works well
 * in a single-threaded environment. Not thread-safe
 */
public class CFO {
    private static CFO instance;
    private final String information;

    private CFO() {
        this.information = "Chief Financial Officer";
    }

    public static CFO getInstance() {
        if (instance == null) {
            instance = new CFO();
        }
        return instance;
    }
}