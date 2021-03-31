package com.company;

import java.util.ArrayList;

public class Films {

    private String nameOfMovie;
    private String nameOfDirector;
    private int yearOfProduction;
    private ArrayList<Actor> actors = new ArrayList<>();

    public Films(String nameOfMovie, String nameOfDirector, int yearOfProduction)
    {
        this.nameOfDirector = nameOfDirector;
        this.nameOfMovie = nameOfMovie;
        this.yearOfProduction = yearOfProduction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public void addActor(Actor actor)
    {
        this.actors.add(actor);
    }

    public void printActors()
    {
        for(int i = 0; i < this.actors.size(); i++)
        {
            System.out.print(actors.get(i).getFirstName() + ", " + actors.get(i).getLastName() + ", " + actors.get(i).getGender() + ", " + actors.get(i).getYearOfBirth() + ", " + actors.get(i).getNumOfAward() + "\n");
        }
    }

    public int printActresses()
    {
        int count = 0;

        for(int i = 0; i < this.actors.size(); i++)
        {
           if(actors.get(i).getGender() == Gender.FEMALE)
           {
               count++;
           }
        }

        return count;
    }

    public String whenArrives(int yearOfProduction)
    {
        if(yearOfProduction > 2021)
        {
            return "The movie will came after this year!";
        }else if(yearOfProduction == 2021)
        {
            return "The movie came or will came this year!";
        }else
        {
            return "The movie is already out!";
        }
    }

    public Actor oldestActor()
    {
        Actor min = actors.get(0);

        for(int i = 1; i < this.actors.size(); i++)
        {
            if(actors.get(i).getYearOfBirth() <= min.getYearOfBirth())
            {
                if(actors.get(i).getYearOfBirth() == min.getYearOfBirth() && actors.get(i).getId().charAt(actors.get(i).getId().length() - 1) < min.getId().charAt(min.getId().length() - 1));
                {
                    min = actors.get(i);
                }

                min = actors.get(i);


            }
        }

        return min;

    }

    public int zeroAwards()
    {
        int count = 0;

        for(int i = 0; i < this.actors.size(); i++)
        {
            if(actors.get(i).getNumOfAward() == 0)
            {
                count++;
            }
        }

        return count;
    }

    @Override

    public String toString()
    {
        return "Name of the movie: " + getNameOfMovie() + "\n" +
                "Name of the direcotr: " + getNameOfDirector() + "\n" +
                "Year of procution is: " + getYearOfProduction() + "\n"+
                "The actors are: \n" + actors;

    }

}
