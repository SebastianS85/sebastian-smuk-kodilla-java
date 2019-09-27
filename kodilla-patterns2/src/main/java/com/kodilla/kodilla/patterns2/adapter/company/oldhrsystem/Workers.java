package com.kodilla.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String [] [] workers={
            {"67003456","John ","Smith"},
            {"63424256","Ivone ","Novak"},
            {"68687435","Jessie","Pinkman"},
            {"64534543","Walter","White"},
            {"67046664","Clara","Lanson"}};
    private double [] salaries ={
            4500,
            5000,
            3300,
            4700,
            5200
    };

    public String getWorkers(int n){
        if(n>salaries.length){
            return "";}
        return workers[n] [0] +", "+workers[n][1]+", "+workers[n][2]+", "+ salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
