/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BolsaDelCaos;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class BolsaDelCaosF {
    int n;
    public int BolsaDelCaosF(){
    Random numero = new Random();
    int valor = numero.nextInt(15);
          switch (valor ){
                  case 0 :
                  System.out.println("Has sacado  :+1");
                  n=7;
                  break;
                  case 1 :
                  System.out.println("Has sacado  :+1");
                  n=7;
                  break;
                  case 2 :
                  System.out.println("Has sacado  :0");
                  n=0;
                  break;
                  case 3 :
                  System.out.println("Has sacado  :0");
                  n=0;
                  break;
                  case 4 :
                  System.out.println("Has sacado  :0");
                  n=0;
                  break;
                  case 5 :
                  System.out.println("Has sacado  :-1");
                  n=1;
                  break;
                  case 6 :
                  System.out.println("Has sacado  :-1");
                  n=1;
                  break;
                  case 7 :
                  System.out.println("Has sacado  :-1");
                  n=1;
                  break;
                  case 8 :
                  System.out.println("Has sacado  :-2");
                  n=2;
                  break;
                  case 9 :
                  System.out.println("Has sacado  :-2");
                  n=2;
                  break;
                  case 10 :
                  System.out.println("Has sacado  :calavera");
                  n=9;
                  break;
                  case 11 :
                  System.out.println("Has sacado  :calavera");
                  n=9;
                  break;
                  case 12 :
                  System.out.println("Has sacado  :capucha");
                  n=10;
                  break;
                  case 13 :
                  System.out.println("Has sacado  :piedra");
                  n=11;
                  break;
                  case 14 :
                  System.out.println("Has sacado  :tentaculo");
                  n=12;
                  break;
                  case 15 :
                  System.out.println("Has sacado  :estrella");
                  n=13;
                  break;
    
    }
          System.out.println(n);
          return n ;
    
}}
