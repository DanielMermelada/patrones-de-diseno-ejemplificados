package co.edu.sabana.patron.builder.director;

import co.edu.sabana.patron.builder.concepto.Cereal;
import co.edu.sabana.patron.builder.interfaz.CerealBuilder;

public class CerealEngineer {
    private CerealBuilder cerealBuilder;
    public CerealEngineer(CerealBuilder cerealBuilder){
        this.cerealBuilder = cerealBuilder;
    }

    public Cereal getCereal(){
        return this.cerealBuilder.getCereal();
    }

    public void makeCereal(){
        this.cerealBuilder.añadirCerealOjuelas();
        this.cerealBuilder.añadirCerealYogurt();
        this.cerealBuilder.añadirCerealFruta();
        this.cerealBuilder.añadirCerealQueso();
    }
}
