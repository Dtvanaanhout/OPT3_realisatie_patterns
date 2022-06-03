package com.example.demo;

import java.util.Observer;

interface Observable {
    void addObserver(Observer o);
    void notifyObservers();
}