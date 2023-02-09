package co.edu.sabana.patron.builder.informacion;

import co.edu.sabana.patron.builder.concepto.Cereal;
import co.edu.sabana.patron.builder.interfaz.CerealBuilder;

public class manzanaMelocotonBuilder implements CerealBuilder {

    private Cereal cereal ;

    public manzanaMelocotonBuilder(){
        this.cereal= new Cereal();
    }

    @Override
    public void añadirCerealOjuelas() {
        cereal.setCerealOjuelas("ChocoKrispies");
    }

    @Override
    public void añadirCerealYogurt() {
        cereal.setCerealYogurt("Melocoton");
    }

    @Override
    public void añadirCerealQueso() {
        cereal.setCerealQueso("Crema");
    }

    @Override
    public void añadirCerealFruta() {
        cereal.setCerealFruta("Manzana");
    }

    @Override
    public Cereal getCereal() {
        return this.cereal;
    }
}
