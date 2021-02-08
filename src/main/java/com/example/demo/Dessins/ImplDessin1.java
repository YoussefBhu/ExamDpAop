package com.example.demo.Dessins;


import com.example.demo.AspectT.Log;

public class ImplDessin1 implements Dessin{
    public void Traiter() {
        System.out.println("ImplDessin1 : traitement");
    }

    public void Supprimer() {
        System.out.println("ImplDessin1 : supprimer");
    }

    public void Ajouter() {
        System.out.println("ImplDessin1 : ajouter");
    }

    public void afficher() {
        System.out.println("ImplDessin1 : afficher");
    }

    public void serialiser() {
        System.out.println("ImplDessin1 : serialiser");
    }
}
