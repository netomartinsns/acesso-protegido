package com.mycompany.GereEscola;

public class NovaClasse {
    private static Desempenho desempenho;
    /**
     * @param args
     */
    public static void main(String args[]) {
        desempenho = new Desempenho();
        double CR = desempenho.calcularCoeficienteRendimento();
        System.out.println("Coeficiente de Rendimento: " + CR);
    }

}
