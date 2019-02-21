/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Jose
 */
public class EvitarEnemigo {
 
    
  public EvitarEnemigo(){}
  
  
  public boolean EvitarEnemigo(int discre, int bonif, int percep){

  int tot=discre+bonif-percep;
for (int x=tot;x>0;x--) {
int dado = (int) (Math.random() * 6) + 1;
if (dado==6 || dado==5){
    return true;
}
}return false;}}
