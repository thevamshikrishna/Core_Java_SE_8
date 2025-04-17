package pl.vm.javaguild.designpatterns.pattern.creational.singleton.model;

/**
 * Serialization and thread-safety guaranteed by this singleton implementation
 */

public enum CEO {
    INSTANCE("Chief Executive Officer");
    private final String information;

    private CEO(String information) {
        this.information = information;
    }

    public CEO getInstance() {
        return INSTANCE;
    }
}