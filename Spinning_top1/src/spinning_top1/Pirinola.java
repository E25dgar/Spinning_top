/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinning_top1;

import javax.swing.JOptionPane;

public class Pirinola {

public static void jugar(){
int pirinola, toma2=0, tomatodo=0;
int n1;
String n=JOptionPane.showInputDialog(null,"dame el numero de vuelta de la pirinola \n 2 toma dos. \n 6 toma todo ");

n1=Integer.parseInt(n);

for(int x=0; x<n1; x++){
pirinola= (int) (Math.random()*6+1);


if(pirinola==2){
toma2++;

}
else if(pirinola==6){
tomatodo++;
}
JOptionPane.showMessageDialog(null,"resultado toma 2: "+toma2+" toma todo: "+tomatodo+ " pirinola "+pirinola);
}

}
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
jugar(); // TODO code application logic here
}
}