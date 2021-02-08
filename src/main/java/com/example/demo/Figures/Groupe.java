package com.example.demo.Figures;

import com.example.demo.AspectT.Log;
import com.example.demo.AspectT.Secured;
import com.example.demo.Dessins.Dessin;
import com.example.demo.Observable.Observable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Groupe extends Figure implements Serializable {

    List<Figure> figures ;
    public Groupe(Dessin dessin, int episseur, int clrConteur, int clrRemplissage) {
        super(dessin, episseur, clrConteur, clrRemplissage);
        this.figures = new ArrayList<Figure>();
    }

    public double Surface() {
        return 0;
    }

    public double Perimetre() {
        return 0;
    }

    public void dessiner() {
        this.dessin.Traiter();
        for(Figure f : figures)
            f.dessiner();
    }

    public void Update(Observable observable) {
        System.out.println("Paramétre changé");
        for(Figure f : figures)
            f.Update(observable);
    }
    //@Log
    @Secured(roles = {"ADMIN"})
    public void AddFigure(Figure figure){
        this.figures.add(figure);
    }

    public void RemoveFigure(Figure figure){
        this.figures.remove(figure);
    }

    public List<Figure> getFigures() {
        return figures;
    }
}
