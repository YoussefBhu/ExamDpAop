package com.example.demo;

import com.example.demo.Context.ApplicationContext;
import com.example.demo.Dessins.ImplDessin1;
import com.example.demo.Dessins.ImplDessin2;
import com.example.demo.Figures.Circle;
import com.example.demo.Figures.Groupe;
import com.example.demo.Figures.Point;
import com.example.demo.Figures.Triangle;
import com.example.demo.Observable.Parametrage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.*;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext.Auth("Admin","hello",new String[]{"USER"});
        Triangle t1 = new Triangle(new ImplDessin1(), 1, 3, 0, new Point(4,5), 10, 3);
        Circle c1 = new Circle (new ImplDessin2(), 0, 3, 0, new Point(4,5), 9.0);
        Groupe groupe = new Groupe(new ImplDessin2(), 2, 7, 2);
        groupe.AddFigure(t1);
        groupe.AddFigure(c1);
        Parametrage p = new Parametrage();
        p.AddObserver(groupe);
        p.setEpisseur(20);
        groupe.dessiner();
    }

}
