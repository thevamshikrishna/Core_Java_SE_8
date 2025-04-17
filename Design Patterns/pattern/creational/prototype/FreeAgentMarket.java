package pl.vm.javaguild.designpatterns.pattern.creational.prototype;

import pl.vm.javaguild.designpatterns.pattern.creational.prototype.model.Coach;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.model.Player;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.model.Team;

/**
 * Main factory for creating objects and their copies
 */
public interface FreeAgentMarket {

    /**
     * Create complete copy {@link Player}
     *
     * @return copy of player
     */
    Player createPlayer();

    /**
     * Create complete copy {@link Player} with updated name
     *
     * @return copy of player
     */
    Player createPlayer(String name);

    /**
     * Create complete copy {@link Coach}
     *
     * @return copy of coach
     */
    Coach createCoach();

    /**
     * Create complete copy {@link Coach} with updated name
     *
     * @return copy of player
     */
    Coach createCoach(String name);

    /**
     * Create complete copy {@link Team}
     *
     * @return copy of team
     */
    Team createTeam();

    /**
     * Create complete copy {@link Team} with updated name
     *
     * @return copy of team
     */
    Team createTeam(String name);
}
