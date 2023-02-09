package co.edu.unisabana.patrones.bridge.entidad;

import co.edu.unisabana.patrones.bridge.modelo.Modelo;
import co.edu.unisabana.patrones.bridge.interfaz.Placa;

//Hereda de la clase abstracta modelo, por lo que ahora puede llamar a la placa y asociarla con el modelo

public class Audi extends Modelo {
    public Audi(Placa placa){ super(placa); }
    @Override
    public void registrar() { System.out.println("Audi detectado registrando el carro!");
        placa.anotar();
    }
}
