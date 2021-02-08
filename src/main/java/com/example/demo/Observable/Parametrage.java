package com.example.demo.Observable;

import com.example.demo.Figures.Figure;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {

    List<Figure> Observers = new ArrayList<Figure>();

    public int Episseur ;
    public int ClrConteur;
    public int ClrRemplissage;

    public void AddObserver(Figure figure) {
        Observers.add(figure);
    }

    public void RemoveObserver(Figure figure) {
        Observers.remove(figure);
    }

    public void NotifyObservers() {
        for (Figure figure : Observers )
            figure.Update(this);
    }

    public void setEpisseur(int episseur) {
        Episseur = episseur;
        this.NotifyObservers();
    }

    public void setClrConteur(int clrConteur) {
        ClrConteur = clrConteur;
        this.NotifyObservers();
    }

    public void setClrRemplissage(int clrRemplissage) {
        ClrRemplissage = clrRemplissage;
        this.NotifyObservers();
    }

    public int getEpisseur() {
        return Episseur;
    }

    public int getClrConteur() {
        return ClrConteur;
    }

    public int getClrRemplissage() {
        return ClrRemplissage;
    }
}
