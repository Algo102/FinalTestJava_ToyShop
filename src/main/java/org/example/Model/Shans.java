package org.example.Model;

import java.util.HashMap;

public class Lottery {
    public Lottery() {
    }
    public HashMap<String,String> getPrize(String[] namesOfAwards, String[] people){

        HashMap<String,String> winners = new HashMap<>();
        for (int i = 0; i < people.length-1; i++) {
            winners.put(people[i],namesOfAwards[i]);
        }
        System.out.println(winners.toString());
        return winners;
    }
}
