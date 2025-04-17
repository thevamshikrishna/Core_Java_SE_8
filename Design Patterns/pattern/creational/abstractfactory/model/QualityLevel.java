package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model;


/**
 * Enum class representing quality of laptop components
 */
public enum QualityLevel {

    LOW("cheapest option"),
    MEDIUM("regular option"),
    HIGH("expensive option");

    public final String option;

    QualityLevel(String option) {
        this.option = option;
    }
}
