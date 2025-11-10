package org.javaturk.ipj.ch08;

public class FootballPlayer {
    int no;
    String name;
    boolean inPlay;
    int minutes;
    int numberOfGoals;

    void play(int minutesToPlay) {
        minutes = minutes + minutesToPlay;
        inPlay = true;

    }

    void score() {
        numberOfGoals++;
    }

    void playOver() {
        if (inPlay == false) {
            IO.println("\n \r");
            IO.println(name + " zaten oyunda DEĞİL");
            return;
        }
        inPlay = false;

    }


    void printInfo() {
        IO.println("\n \r");
        System.out.printf("%-30s= %s", "\n Oyuncu No", no);
        System.out.printf("%-30s= %s", "\n OOyuncunun adı:", name);
        System.out.printf("%-30s= %s", "\n Oyuncu oyunda mı", inPlay);
        System.out.printf("%-30s= %s", "\n Oyuncunun oynadığı süre", minutes);
        System.out.printf("%-30s= %s", "\n Oyuncunun attığı gol", numberOfGoals);


    }
}
