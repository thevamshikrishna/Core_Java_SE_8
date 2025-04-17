package pl.vm.javaguild.designpatterns.pattern.creational.singleton.model;

/**
 * Implementation of Singleton to eagerly create instance, rather than lazily.
 * If application always creates and uses an instance of the Singleton, or the overhead
 * of creation and runtime aspects of Singleton isn't onerous, it may be implemented this way.
 */
public class CMO {
    private static CMO instance = new CMO();
    private final String information;

    private CMO() {
        this.information = "Chief Marketing Officer";
    }

    public static CMO getInstance() {
        return instance;
    }
}