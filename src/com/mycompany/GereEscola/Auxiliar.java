package com.mycompany.GereEscola;

public abstract class Auxiliar {
    private float frequencia;
    private final int dias_letivos = 180;
    private int presencas;
    private int faltas;

    public Auxiliar(float frequencia, int presencas, int faltas) {
        this.frequencia = frequencia;
        this.presencas = presencas;
        this.faltas = faltas;
    }
    protected float calcularFrequencia(){
        return (presencas*100)/dias_letivos;
    }
    protected void setFrequencia(float frequencia){
        this.frequencia = frequencia;
    }
    protected float getFrequencia(){
        return frequencia;
    }
    protected void setPresencas(int presencas){
        this.presencas = presencas;
    }
    protected int getPresencas(){
        return presencas;
    }
    protected void setFaltas(int faltas){
        this.faltas = faltas;
    }
    protected int getFaltas(){
        return faltas;
    }
    protected int getDiasLetivos(){
        return dias_letivos;
    }
    protected void registarPresenca(){
        presencas++;
    }
    protected void registarFalta(){
        faltas++;
    }
    protected void registarFaltaJustificada(){
        faltas++;
    }
    protected void registarFaltaInjustificada(){
        faltas++;
    }
    protected void registarFaltaInjustificada(int dias){
        faltas += dias;
    }
    protected void registarFaltaJustificada(int dias){
        faltas += dias;
    }
    protected void registarPresenca(int dias){
        presencas += dias;
    }
    protected void registarFalta(int dias){
        faltas += dias;
    }
    protected void registarFaltaJustificada(int dias, int dias_letivos){
        faltas += dias;
        presencas += dias_letivos - dias;
    }
    protected void registarFaltaInjustificada(int dias, int dias_letivos){
        faltas += dias;
        presencas += dias_letivos - dias;
    }
    protected void registarPresenca(int dias, int dias_letivos){
        presencas += dias;
        faltas += dias_letivos - dias;
    }
    protected void registarFalta(int dias, int dias_letivos){
        faltas += dias;
        presencas += dias_letivos - dias;
    }
    protected void registarFaltaJustificada(int dias, int dias_letivos, int dias_faltados){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarFaltaInjustificada(int dias, int dias_letivos, int dias_faltados){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarPresenca(int dias, int dias_letivos, int dias_faltados){
        presencas += dias_faltados;
        faltas += dias_letivos - dias_faltados;
    }
    protected void registarFalta(int dias, int dias_letivos, int dias_faltados){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarFaltaJustificada(int dias, int dias_letivos, int dias_faltados, int dias_justificados){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarFaltaInjustificada(int dias, int dias_letivos, int dias_faltados, int dias_justificados){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarPresenca(int dias, int dias_letivos, int dias_faltados, int dias_justificados){
        presencas += dias_faltados;
        faltas += dias_letivos - dias_faltados;
    }
    protected void registarFalta(int dias, int dias_letivos, int dias_faltados, int dias_justificados){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarFaltaJustificada(int dias, int dias_letivos, int dias_faltados, int dias_justificados, int dias_justificados2){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarFaltaInjustificada(int dias, int dias_letivos, int dias_faltados, int dias_justificados, int dias_justificados2){
        faltas += dias_faltados;
        presencas += dias_letivos - dias_faltados;
    }
    protected void registarPresenca(int dias, int dias_letivos, int dias_faltados, int dias_justificados, int dias_justificados2){
        presencas += dias_faltados;
        faltas += dias_letivos - dias_faltados;
    }

}
