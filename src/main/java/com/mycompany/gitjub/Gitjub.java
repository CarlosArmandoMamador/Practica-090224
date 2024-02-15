/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gitjub;

/**
 *
 * @author DELL
 */
public class Gitjub {

    public static void main(String[] args) {
      user usu1= new user("nero");
      vidio vid1= new vidio ("Entendiendo eta vaina", 4000,"Https://youtube.com/unbideomamigente");
      usu1.subirVideo(vid1);
      usu1.mostrarInfoUser(); 
      
      user usu2= new user ("Tilin");
      Comentario comen1= new Comentario("Cuenta en decadencia",usu2);
      System.out.println("El usuario "+usu2.getNombre()+" publico el comentario "+comen1.getContenido());
    }
    
    
}
