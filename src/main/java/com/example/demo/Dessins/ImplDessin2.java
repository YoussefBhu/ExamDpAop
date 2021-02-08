package com.example.demo.Dessins;


import com.example.demo.AspectT.Log;

public class ImplDessin2 implements Dessin {
    public void Traiter() { System.out.println("ImplDessin2 : traitement"); }

    public void Supprimer() { System.out.println("ImplDessin2 : Supprimer"); }

    public void Ajouter() { System.out.println("ImplDessin2 : Ajouter"); }

    public void afficher() { System.out.println("ImplDessin2 : Afficher"); }

    public void serialiser() { System.out.println("ImplDessin2 : serialiser"); }
}
