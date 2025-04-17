package pl.vm.javaguild.designpatterns.pattern.creational.singleton.model;

/**
 * Implementation of Singleton with keyword "synchronized", ensures thread-safety,
 * by forcing every thread to wait its turn before it can enter the method. No two threads
 * may enter the method simultaneously.
 * Using it on constructor might affect the performance significantly. When invoked often, should consider
 * using techniques: "lazy initialization" or "double-checked locking".
 */
public class CTO {

    private static CTO instance;
    private final String information;

    private CTO() {
        this.information = "Chief Financial Officer";
    }

    public static synchronized CTO getInstance() {
        if (instance == null) {
            instance = new CTO();
        }
        return instance;
    }
}