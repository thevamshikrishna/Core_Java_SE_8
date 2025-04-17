package pl.vm.javaguild.designpatterns.pattern.creational.prototype.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.Prototype;

import java.util.List;

@Slf4j
@Getter
public class Team extends Prototype<Team> {

    private final Coach coach;
    private final List<Player> players;
    @Setter
    private String name;

    public Team(final Team team) {
        this.name = team.getName();
        this.coach = new Coach(team.getCoach());
        this.players = team.getPlayers().stream().map(Player::new).toList();
    }

    public Team(final Coach coach, final List<Player> players, final String name) {
        this.coach = coach;
        this.players = players;
        this.name = name;
    }

    @Override
    public Team copy() {
        return new Team(this);
    }

    void showInfo() {
        log.info(
                """
                                                
                        --- Team info ---
                        Name:              {}
                        Coach              {}
                        Number of players: {}
                        """,
                name,
                coach.getName(),
                players.size()
        );
    }
}
