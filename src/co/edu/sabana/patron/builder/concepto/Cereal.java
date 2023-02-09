package co.edu.sabana.patron.builder.concepto;

import co.edu.sabana.patron.builder.interfaz.CerealPlan;

public class Cereal implements CerealPlan {

    public String cerealOjuelas;
    public String cerealYogurt;
    public String cerealQueso;
    public String cerealFruta;

    @Override
    public void setCerealOjuelas(String ojuelas) {
        cerealOjuelas = ojuelas;
    }

    public String getCerealOjuelas() {
        return cerealOjuelas;
    }

    @Override
    public void setCerealYogurt(String yogurt) {
        cerealYogurt = yogurt;
    }

    public String getCerealYogurt() {
        return cerealYogurt;
    }

    @Override
    public void setCerealQueso(String queso) {
        cerealQueso = queso;
    }

    public String getCerealQueso() {
        return cerealQueso;
    }

    @Override
    public void setCerealFruta(String fruta) {
        cerealFruta = fruta;
    }

    public String getCerealFruta() {
        return cerealFruta;
    }

}
