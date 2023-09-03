package org.example.Model;

import java.util.HashMap;

public class Shans {
    public Shans() {
    }
    public HashMap<String,String> getPrize(String[] namesPlayers, String[] people){

        HashMap<String,String> player = new HashMap<>();
        for (int i = 0; i < people.length-1; i++) {
            player.put(people[i],namesPlayers[i]);
        }
        System.out.println(player.toString());
        return player;
    }
}
