package com.lambdaschool.solution;

public class MyApplication implements Processor {
    // We create Athlete here. AthleteCreation is the type of the variable
    private AthleteCreation myAthlete;

    // constructor takes the AthleteCreation type object as a parameter
    public MyApplication(AthleteCreation myAthlete)
    {
        this.myAthlete = myAthlete
    }

    @Override
    public void displayAthlete
    {
        // implements specific displayAthlete() method from each different Athlete subclass
        myAthlete.displayAthlete()
    }
}
