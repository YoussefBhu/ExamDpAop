package com.example.demo.Figures;

import com.example.demo.AspectT.Log;
import com.example.demo.Dessins.Dessin;
import com.example.demo.Observable.Observable;

public class Triangle extends Figure {

    private Point csg ; //coin supérieur gauche
    private double L ;
    private double H ;

    public Triangle(Dessin dessin, int episseur, int clrConteur, int clrRemplissage, Point csg , double L , double H) {
        super(dessin, episseur, clrConteur, clrRemplissage);
        this.L = L ;
        this.H = H ;
    }

    public double Surface() { return L*H; }

    public double Perimetre() { return 2*(L+H); }

    public void dessiner() { this.dessin.Traiter(); }

    public void Update(Observable observable) {
        System.out.println("Paramétre Changé");
    }

    public Point getCsg() {
        return csg;
    }

    public double getL() {
        return L;
    }

    public double getH() {
        return H;
    }

    public void setCsg(Point csg) {
        this.csg = csg;
    }

    public void setL(double l) {
        L = l;
    }

    public void setH(double h) {
        H = h;
    }
}
