package com.mycompany.GereEscola;

import com.mycompany.Matematica.Nota;

public class Desempenho extends Nota{
    /**
     *
     */
    private float media , CR;
    private Nota nota;

    public Desempenho(){
        nota = new Nota();
        media = nota.calcularMedia();
        CR = calcularCoeficienteRendimento();
    }

    public float getCR() {
        return CR;
    }

    public float getMedia() {
        return media;
    }

}
