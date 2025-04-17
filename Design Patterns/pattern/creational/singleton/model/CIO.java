package pl.vm.javaguild.designpatterns.pattern.creational.singleton.model;

/**
 * Approach called "double-check locking". It helps to reduce the use of
 * synchronization in getInstance(). It prevents race condition between multiple threads,
 * that could try to get singleton instance at the same moment, creating more than one
 * instance at a time.
 */

public class CIO {
    /**
     * the volatile keyword ensures that multiple threads handle the unique instance variable
     * correctly when it is being initialized to the Singleton instance. It prevents cache incoherence issues.
     * In fact, the Java memory model allows the publication of partially initialized objects
     * and this may lead in turn to subtle bugs.
     * By using volatile we ensure that updates to variables propagate predictably to other threads,
     * we should apply the volatile modifier to those variables
     */
    private static volatile CIO instance;
    private final String information;

    private CIO() {
        this.information = "Chief Information Officer";
    }

    public static CIO getInstance() {
        if (instance == null) {
            synchronized (CIO.class) {
                if (instance == null) {
                    instance = new CIO();
                }
            }
        }
        return instance;
    }
}