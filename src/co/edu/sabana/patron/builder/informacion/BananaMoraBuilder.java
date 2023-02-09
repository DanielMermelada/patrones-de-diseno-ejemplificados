package co.edu.sabana.patron.builder.informacion;

import co.edu.sabana.patron.builder.concepto.Cereal;
import co.edu.sabana.patron.builder.interfaz.CerealBuilder;

public class BananaMoraBuilder implements CerealBuilder {

    private Cereal cereal ;

    public BananaMoraBuilder(){
        this.cereal= new Cereal();
    }

    @Override
    public void añadirCerealOjuelas() {
        cereal.setCerealOjuelas("Kellogs");
    }

    @Override
    public void añadirCerealYogurt() {
        cereal.setCerealYogurt("Mora");
    }

    @Override
    public void añadirCerealQueso() {
        cereal.setCerealQueso("Pera");
    }

    @Override
    public void añadirCerealFruta() {
        cereal.setCerealFruta("Bananas");
    }

    @Override
    public Cereal getCereal() {
        return this.cereal;
    }
}
