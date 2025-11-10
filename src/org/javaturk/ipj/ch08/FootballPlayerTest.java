package org.javaturk.ipj.ch08;

public class FootballPlayerTest {
    void main() {
        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex de solusa";
        alex.minutes = 0;
        alex.numberOfGoals = 0;
        alex.inPlay = false;


        alex.play(45);
        alex.score();
        alex.playOver();
        alex.printInfo();


        FootballPlayer ronaldo = new FootballPlayer();

        ronaldo.no = 7;
        ronaldo.name = "Christina Ronaldo";
        ronaldo.minutes = 0;
        ronaldo.numberOfGoals = 0;
        ronaldo.inPlay = false;

        ronaldo.play(100);
        ronaldo.score();
        ronaldo.score();
        ronaldo.score();
        ronaldo.play(60);
        ronaldo.score();
        ronaldo.playOver();
        ronaldo.printInfo();


    }


}
