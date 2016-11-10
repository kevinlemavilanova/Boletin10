/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin10_2 {

    public static void main(String[] args) {
        Boolean win = false;
        int continuar = 1;
        int cont = 5;
        do{
            int random = (int)Math.floor(Math.random()*50);
            do{
                if(cont == 0){
                    System.out.println("Te has quedado sin vidas");
                    System.out.println("O numero era o "+random);
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
                    
                    if(y==random){
                        System.out.println("Ganaste");
                        win = true;
                        break;
                    }
                    else if (Math.abs(random-y) <= 5){
                        System.out.println("moi preto");
                        cont--;
                        System.out.println("Vidas: "+ cont);            
                    }
                    else if ((Math.abs(random-y) < 10)&&(Math.abs(random-y) > 5)){
                        System.out.println("preto");
                        cont--;
                        System.out.println("Vidas: "+ cont);            
                    }
                    else if ((Math.abs(random-y) >= 10 && Math.abs(random-y) <= 20)){
                        System.out.println("moi lonxe");
                        cont--;
                        System.out.println("Vidas: "+ cont);            
                    }
                    else if (Math.abs(random-y) > 20){
                        System.out.println("moi lonxe");
                        cont--;
                        System.out.println("Vidas: "+ cont);            
                    }
                }
            }while(win == false);
            cont = 5;
            win=false;
            random = (int)Math.floor(Math.random()*50);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Quieres terminar? Pulsa 0"));
        }while(continuar!=0);
    }
    
}
