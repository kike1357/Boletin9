package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Numeros {
    
    public int pedirNumero(){
         
       String res= JOptionPane.showInputDialog("numero");
       int num= Integer.parseInt(res);
       return num;
    }    
    public void comparar (){
        int cp=0;
        int c0=0;
        int cn=0;
        int num;
        int i=0;
        
        for( i=0;i<10;i++){
            num= pedirNumero();
            if(num<0)
                cn++;  
            
            else if (num>0)
                cp++;
           
            else
                c0++;
        }     
                    
         System.out.println("o número e negativo="+cn);
         System.out.println("o número e positivo="+cp);
         System.out.println("o número e cero="+c0);
    }
}   
        
        
        
        
    
    
    
    

