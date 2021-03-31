package com.company;

public class Actor {
    private final String id;
    private String firstName, lastName;
    private final Gender gender;
    private final int yearOfBirth;
    private int numOfAward;
    private static int numOfActors = 0;

    public Actor(String first, String last, Gender gender, int yearOfBirth)
    {
        this.numOfAward = 0;
        this.firstName = first;
        this.lastName = last;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.id = createID();
    }

    public String createID()
    {
        String result = "";

        numOfActors++;

        result += this.firstName.charAt(0);
        result += this.lastName.charAt(0);
        result += String.valueOf(numOfActors);


        return result;
    }

    public Gender getGender() {
        return gender;
    }

    public int getNumOfAward() {
        return numOfAward;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public  String getFirstName() {
        return this.firstName;
    }

    public String getId() {
        return id;
    }

    public  String getLastName() {
        return this.lastName;
    }

    public void setNumOfAward() {
        this.numOfAward = this.numOfAward + 1;
    }

    public static int getNumOfActors() {
        return numOfActors;
    }

    @Override

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        if(this.gender == Gender.FEMALE)
        {
            result.append("The name of the actress is: " + getFirstName() + ' ' + getLastName() + " Year of birth is: " + this.yearOfBirth + " Her id is: " + this.id + " She won " + this.numOfAward + " awards!\n");
        }else
        {
            result.append("The name of the actor is: " + getFirstName() + ' ' + getLastName() + " Year of birth is: " + this.yearOfBirth + " His id is: " + this.id + " He won " + this.numOfAward + " awards!\n");
        }

        return result.toString();
    }
}
