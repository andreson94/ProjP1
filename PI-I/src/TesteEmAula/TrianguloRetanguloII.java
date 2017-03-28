package TesteEmAula;

import java.util.Scanner; 

public class TrianguloRetanguloII { 
  
  public static void main(String[] args) { 
        System.out.println ("triangulo retangulo");
        double ca, cb, h, p, a; 
        Scanner leia = new Scanner (System.in); 
        System.out.print("Informe o cateto a: "); 
        ca = leia.nextDouble(); 
        System.out.print("Informe o cateto b: "); 
        cb = leia.nextDouble();
        ca = Math.pow(ca, ca);
        cb = Math.pow(cb, cb);
        h = Math.sqrt(ca + cb); 
        p = (ca + cb + h);
        System.out.println("Perimetro: " + p);
         
    } 
}