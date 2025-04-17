package pl.vm.javaguild.designpatterns.pattern.creational.prototype.model;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Coach extends Person<Coach> {

    private final CoachingStrategy coachingStrategy;

    public Coach(String name, final CoachingStrategy coachingStrategy) {
        super(name);
        this.coachingStrategy = coachingStrategy;
    }

    public Coach(final Coach coach) {
        super(coach.name);
        this.coachingStrategy = coach.coachingStrategy;
    }

    @Override
    void showInfo() {
        log.info(
                """
                        --- Coach info ---
                        Name:     {}
                        Strategy: {}
                        """,
                name,
                coachingStrategy
        );
    }
}
