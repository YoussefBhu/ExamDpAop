package com.example.demo.Figures;


import com.example.demo.Dessins.Dessin;
import com.example.demo.Observable.Observable;
import org.springframework.stereotype.Component;

import java.io.Serializable;


public abstract class Figure implements Serializable {

    public Figure(Dessin dessin, int episseur, int clrConteur, int clrRemplissage) {
        this.dessin = dessin;
        Episseur = episseur;
        ClrConteur = clrConteur;
        ClrRemplissage = clrRemplissage;
    }

    public Dessin dessin;
    public int Episseur ;
    public int ClrConteur;
    public int ClrRemplissage;
    public abstract double Surface();
    public abstract double Perimetre();
    public abstract void dessiner();
    public abstract void Update(Observable observable);
}
