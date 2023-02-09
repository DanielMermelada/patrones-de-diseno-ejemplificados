package co.edu.unisabana.patrones.bridge.modelo;

import co.edu.unisabana.patrones.bridge.interfaz.Placa;

/*Se tiene el puente que es la clase abstracta modelo, llamando a la placa de forma protegida, esta tiene
su método abstracto encargado de registrar el modelo y placa de los carros se realiza por override y la
instancia de plca nos da acceso a la interfaz placa que sirve para conectarnos con el método anotar propio
de las placas.
 */

public abstract class Modelo {
    protected Placa placa;
    public Modelo(Placa placa){ this.placa=placa;}
    public abstract void registrar();
}
