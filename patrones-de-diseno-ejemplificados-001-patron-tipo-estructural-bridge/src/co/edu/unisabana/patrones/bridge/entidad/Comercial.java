package co.edu.unisabana.patrones.bridge.entidad;

import co.edu.unisabana.patrones.bridge.interfaz.Placa;

public class Comercial implements Placa {
    @Override
    public void anotar(){ System.out.println("Anotando una placa comercial!"); }
}