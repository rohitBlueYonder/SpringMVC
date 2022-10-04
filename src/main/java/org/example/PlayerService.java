package org.example;

import java.util.Arrays;
import java.util.List;

public class PlayerService {

    private List<Player> players = Arrays.asList(
            new Player(1,"Rohit","India",25),
            new Player(2,"Jitu","India",25),
            new Player(3,"Appu","India",25),
            new Player(4,"Kallu","India",25)
    );

    public Player getPlayerByName(String name){
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
    }

    public Player getPlayerById(int id){
        return players.stream().filter(p->p.getId() == id).findFirst().get();
    }
}

