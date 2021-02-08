package com.example.demo.Figures;


import com.example.demo.AspectT.Log;
import com.example.demo.Dessins.Dessin;
import com.example.demo.Observable.Observable;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public class Circle extends Figure implements Serializable {

    private Point centre ;
    private double R ;

    public Circle(Dessin dessin, int episseur, int clrConteur, int clrRemplissage, Point centre, Double R) {
        super(dessin, episseur, clrConteur, clrRemplissage);
        this.centre = centre;
        this.R = R;
    }

    public double Surface() {
        return Math.PI * Math.pow(R,2);
    }

    public double Perimetre() { return 2*Math.PI*R; }

    @Log
    public void dessiner() { this.dessin.Traiter(); }

    public void Update(Observable observable) {
        System.out.println("Parametre changé");
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setR(double r) {
        R = r;
    }

    public Point getCentre() {
        return centre;
    }

    public double getR() {
        return R;
    }
}
