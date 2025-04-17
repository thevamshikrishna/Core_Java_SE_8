package pl.vm.javaguild.designpatterns.pattern.creational.prototype.adapter;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.FreeAgentMarket;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.model.Coach;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.model.Player;
import pl.vm.javaguild.designpatterns.pattern.creational.prototype.model.Team;

import static lombok.AccessLevel.PRIVATE;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
public class FreeAgentMarketAdapter implements FreeAgentMarket {

    Player basePlayer;
    Coach baseCoach;
    Team baseTeam;

    @Override
    public Player createPlayer() {
        return basePlayer.copy();
    }

    @Override
    public Player createPlayer(String name) {
        Player player = basePlayer.copy();
        player.setName(name);
        return player;
    }

    @Override
    public Coach createCoach() {
        return baseCoach.copy();
    }

    @Override
    public Coach createCoach(String name) {
        Coach coach = baseCoach.copy();
        coach.setName(name);
        return coach;
    }

    @Override
    public Team createTeam() {
        return baseTeam.copy();
    }

    @Override
    public Team createTeam(String name) {
        Team team = baseTeam.copy();
        team.setName(name);
        return team;
    }
}
