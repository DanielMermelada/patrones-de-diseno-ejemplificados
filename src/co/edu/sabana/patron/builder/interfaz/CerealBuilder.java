package co.edu.sabana.patron.builder.interfaz;

import co.edu.sabana.patron.builder.concepto.Cereal;

public interface CerealBuilder {
    void añadirCerealOjuelas();
    void añadirCerealYogurt();
    void añadirCerealQueso();
    void añadirCerealFruta();
    Cereal getCereal();
}
