package com.hz;

public class HasQuarter implements State{

    GumballMachine gumballmachine;

    public HasQuarter(GumballMachine machine) {
        gumballmachine = machine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
    }

}
