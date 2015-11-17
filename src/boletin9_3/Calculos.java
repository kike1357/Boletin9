
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Calculos {
    float dato;
    float base;
    float altura;
    public float pedirDatoValido(){
       do{
      dato= Float.parseFloat(JOptionPane.showInputDialog("Introducir dato : "));

       }while(dato<=0);
          return dato;             
    }
    
    public void calculoArea(){
        base=pedirDatoValido();
        altura=pedirDatoValido();
        JOptionPane.showMessageDialog(null,"Area = "+ altura*base);
    }
    
    }

