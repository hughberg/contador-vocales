
package principal;

import java.util.Scanner;
public class Contar {

    
    public static void main(String[] args) {
        String texto;
        int contador=0;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un texto:");
        
        texto=sc.nextLine();
        texto=texto.toLowerCase();//convierte todo a minúscula para contar también las posibles
                                  //maýusculas que haya en el texto
        
        for (int i=0;i<texto.length();i++){
            if(texto.charAt(i)=='a'||texto.charAt(i)=='e'||texto.charAt(i)=='i'||texto.charAt(i)=='o'||texto.charAt(i)=='u'){
              contador++;  
            }
        }
        System.out.println("Vocales totales: "+contador);
    }
    
}
