/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitjub;

/**
 *
 * @author DELL
 */
public class user {
    public String nombre;
    public vidio videoSubido;

    public user(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public vidio getVideoSubido() {
        return videoSubido;
    }

    public void subirVideo(vidio videoSubido) {
        this.videoSubido = videoSubido;
    }
    
     public void mostrarInfoUser (){
        System.out.println("User " +nombre);
        if (videoSubido != null){
            System.out.println ("Ultimo video subido "+videoSubido.getTitulo());
        } else {
            System.out.println( "Aun no se han subido video");
        }
    }
}
