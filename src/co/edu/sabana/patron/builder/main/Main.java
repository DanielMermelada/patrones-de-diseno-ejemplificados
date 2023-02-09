package co.edu.sabana.patron.builder.main;

import co.edu.sabana.patron.builder.concepto.Cereal;
import co.edu.sabana.patron.builder.director.CerealEngineer;
import co.edu.sabana.patron.builder.informacion.BananaMoraBuilder;
import co.edu.sabana.patron.builder.informacion.manzanaMelocotonBuilder;
import co.edu.sabana.patron.builder.interfaz.CerealBuilder;

public class Main {
    public static void main(String[] args) {
        CerealBuilder bananaMora = new BananaMoraBuilder();
        CerealBuilder manzanaMelocoton = new manzanaMelocotonBuilder();

        CerealEngineer cerealbananaEngineer = new CerealEngineer(bananaMora);
        CerealEngineer cerealmanzanaEngineer = new CerealEngineer(manzanaMelocoton);
        cerealbananaEngineer.makeCereal();
        cerealmanzanaEngineer.makeCereal();
        Cereal primeraOrden = cerealbananaEngineer.getCereal();
        Cereal segundaOrden = cerealmanzanaEngineer.getCereal();

        System.out.println("co.edu.sabana.patron.builder.concepto.Cereal ojuelas: " + primeraOrden.getCerealOjuelas() + "\n" +
                "co.edu.sabana.patron.builder.concepto.Cereal yogurt: " + primeraOrden.getCerealYogurt() + "\n" +
                "co.edu.sabana.patron.builder.concepto.Cereal queso: " + primeraOrden.getCerealQueso() + "\n" +
                "co.edu.sabana.patron.builder.concepto.Cereal fruta: " + primeraOrden.getCerealFruta());
        System.out.println("co.edu.sabana.patron.builder.concepto.Cereal ojuelas: " + segundaOrden.getCerealOjuelas() + "\n" +
                "co.edu.sabana.patron.builder.concepto.Cereal yogurt: " + segundaOrden.getCerealYogurt() + "\n" +
                "co.edu.sabana.patron.builder.concepto.Cereal queso: " + segundaOrden.getCerealQueso() + "\n" +
                "co.edu.sabana.patron.builder.concepto.Cereal fruta: " + segundaOrden.getCerealFruta());
    }
}
