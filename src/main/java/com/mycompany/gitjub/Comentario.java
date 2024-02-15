/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitjub;

/**
 *
 * @author DELL
 */
public class Comentario {
    public String contenido;
    public user autor;

    public Comentario(String contenido, user autor) {
        this.contenido = contenido;
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public user getAutor() {
        return autor;
    }

    public void setAutor(user autor) {
        this.autor = autor;
    }
    
    
}
