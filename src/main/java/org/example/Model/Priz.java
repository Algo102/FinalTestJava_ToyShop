package org.example.Model;

import java.util.ArrayList;
import java.util.Collections;

public class Priz {
    private ArrayList<Toy> prizList = new ArrayList<Toy>();
    public Priz() {
    }

    public ArrayList<Toy> getPrizList() {
        return prizList;
    }

    @Override
    public String toString() {
        return "Priz{" +
                "prizList=" + prizList +
                '}';
    }


    public ArrayList<Toy> create(ArrayList<Toy> toys, String[] humans){
        int sumOfFrequencyes=0;
        for (Toy toy:toys) {
            sumOfFrequencyes+= toy.getFrequency();
        }
        for (Toy toy:toys) {
            double countToy = Math.round(((toy.getFrequency()*100)/sumOfFrequencyes)*humans.length/100);
            for (int i = 0; i < countToy; i++) {
                prizList.add(toy);
            }
        }
        return prizList;
    }
    public String[] namesToys(){
        String[] namesToys = new String[prizList.size()];
        for (int i = 0; i < namesToys.length; i++) {
            Collections.shuffle(prizList);
            namesToys[i] = prizList.get(0).getName();
            prizList.remove(0);
        }
        return  namesToys;
    }
}
