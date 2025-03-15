package com.mycompany.GereEscola;
import java.util.Calendar;

import codigo27.Pessoa;

public class Principal {
    private static void man (String args[]){
        ref = new Pessoa[2];
        Calendar data_nasc = Calendar.getInstance();
        Calendar data_criacao = Calendar.getInstance();
        data_nasc.set(1990, 1, 1);
        ref[0] = new Fisica ("Marco Antonio" , data_nasc , null , null , "Brasil" , "Rio de Janeiro");
        data_criacao.set(2000, 1, 1);
        ref[1] = new Juridica ("Escola Novo Mundo Ltda" , data_criacao , null , null , "Brasil" , "Rio de Janeiro");
        ref[0].atualizarID("365.586.875-45");
        ref[1].atualizarID("12.345.678/0001-12");
        for (int i = 0; i < ref.length; i++){
            System.out.println("Identificador: " + ref[i].recuperarID());
        }

}
}
