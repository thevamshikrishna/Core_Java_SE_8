package pl.vm.javaguild.designpatterns.pattern.creational.prototype.model;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Player extends Person<Player> {

    private final SportDiscipline sportDiscipline;

    public Player(String name, final SportDiscipline position) {
        super(name);
        this.sportDiscipline = position;
    }

    public Player(final Player player) {
        super(player.name);
        this.sportDiscipline = player.sportDiscipline;
    }

    @Override
    void showInfo() {
        log.info(
                """
                        --- Player info ---
                        Name:       {}
                        Discipline: {}
                        """,
                name,
                sportDiscipline
        );
    }
}
