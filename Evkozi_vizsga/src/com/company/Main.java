package com.company;

public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Brad", "Pit", Gender.MALE, 1963);
        Actor actor2 = new Actor("Jhonny", "Depp", Gender.MALE, 1963);
       Actor actor3 = new Actor("Angelina", "Jolie", Gender.FEMALE, 1975);

        System.out.println(actor1);
        System.out.println(actor2);
       System.out.println(actor3);

        actor2.setNumOfAward();
        actor3.setNumOfAward();
         actor3.setNumOfAward();

        System.out.println();

        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);

        Films film1 = new Films("Pirates of the caribbean", "Gore Verbinski", 2003);

        film1.addActor( new Actor("Jhonny", "Depp", Gender.MALE, 1963));
        film1.addActor( new Actor("Orlando" , "Bloom", Gender.MALE, 1980));
        film1.addActor( new Actor("Kiera", "Knightley", Gender.FEMALE, 1980));

        System.out.println(film1);

        film1.printActors();

        System.out.println(film1.printActresses());

        System.out.println(film1.whenArrives(film1.getYearOfProduction()));

        System.out.println(film1.zeroAwards());

        System.out.println(film1.oldestActor());



    }
}
