package com.kodilla.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class RequestQueue implements Observable{

    private final List<Observer> observers;
    private final List<String> requests;
    private final String name;


    public RequestQueue(String name) {
      observers=new ArrayList<>();
        requests = new ArrayList<>();
        this.name = name;
    }

    public void addRequest(String request){
        requests.add(request);
        notifyObserver();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getRequests() {
        return requests;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    } {

    }
}
