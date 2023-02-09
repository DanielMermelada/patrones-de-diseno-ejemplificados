package co.edu.unisabana.patrones.bridge.main;

import co.edu.unisabana.patrones.bridge.modelo.Modelo;
import co.edu.unisabana.patrones.bridge.entidad.*;

public class Bridge {
    public static void main(String[] args) {
        Modelo[] modelos = new Modelo[5];
        modelos[0] = new Audi(new Particular());
        modelos[1] = new Renault(new Oficial());
        modelos[2] = new Bmw(new Comercial());
        modelos[3] = new Audi(new Oficial());
        modelos[4] = new Renault(new Comercial());

        for (Modelo m : modelos) { m.registrar();}
    }
}

