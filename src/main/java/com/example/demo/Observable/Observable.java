package com.example.demo.Observable;


import com.example.demo.Figures.Figure;

public interface Observable {
    public void AddObserver(Figure figure) ;
    public void RemoveObserver(Figure figure);
    public void NotifyObservers();
}
