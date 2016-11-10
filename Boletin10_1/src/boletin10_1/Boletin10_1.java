/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean win = false;
        int continuar = 1;
        int cont = 5;
        do{
            int x = Integer.parseInt(JOptionPane.showInputDialog("Numero a identificar polo xogador"));
            if(x<0 || x>50){
                do{
                  x = Integer.parseInt(JOptionPane.showInputDialog("Numero entre 1 e 50"));
                }while(x<0 || x>50);
            }
            do{
                if(cont == 0){
                    System.out.println("Te has quedado sin vidas");
                    win = true;
                    break;
                }
                else{
                    int y = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
                    if(y<0 || y>50){
                        do{
                            y = Integer.parseInt(JOptionPane.showInputDialog("Numero entre 1 e 50"));
                        }while(y<0 || y>50);
                    }
                    if(y==x){
                        System.out.println("Ganaste");
                        win = true;}
                    else if (y>x){
                        System.out.println("o numero que buscas e menor");
                        cont--;
                        System.out.println("Vidas: "+ cont);            
                    }
                    else if(y<x){
                        System.out.println("o numero que buscas e maior");
                        cont--;
                        System.out.println("Vidas: "+ cont);}
                }
            }while(win == false);
            cont = 5;
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Quieres terminar? pulsa 0"));
        }while(continuar!=0);
    }
}
