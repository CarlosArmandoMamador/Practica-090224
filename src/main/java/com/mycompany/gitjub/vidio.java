/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitjub;

/**
 *
 * @author DELL
 */
public class vidio {
    public String titulo;
    public int duracionSegundo;
    public String url;

    public vidio(String titulo, int duracionSegundo, String url) {
        this.titulo = titulo;
        this.duracionSegundo = duracionSegundo;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionSegundo() {
        return duracionSegundo;
    }

    public void setDuracionSegundo(int duracionSegundo) {
        this.duracionSegundo = duracionSegundo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
