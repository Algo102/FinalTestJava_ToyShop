package org.example.View;

import org.example.Model.Priz;
import org.example.Model.Shans;
import org.example.Model.Save;
import org.example.Model.Toy;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public View() {
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько видов игрушек в лотерее: ");
        int quantityToy = sc.nextInt();
        ArrayList<Toy> assortment = new ArrayList<>();
        for (int i = 0; i < quantityToy; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите название игрушки и вероятность ее выпадения (от 1 до 10 через пробел)");
            String toyShans = sc1.nextLine();
            String[] allToys = toyShans.split(" ");
            Toy toy = new Toy(allToys[0],Integer.parseInt(allToys[1]));
            assortment.add(toy);
        }

        System.out.println("Сколько игроков в розыгрыше");
        int quantityHuman = sc.nextInt();
        String[] human = new String[quantityHuman];
        for (int i = 0; i < human.length; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите имя игрока: ");
            human[i] = sc2.nextLine();
        }

        Priz priz = new Priz();
        priz.create(assortment,human);

        Shans shans = new Shans();
        Save save = new Save();
        save.save(shans.getPrize(priz.namesToys(),human));
    }
}
