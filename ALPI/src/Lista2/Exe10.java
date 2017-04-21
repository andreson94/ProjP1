package Lista2;
public class Exe10 {
    public static void main(String[] args) {
        /*Faça um programa que calcule e imprima o resultado da soma abaixo (lembre-se de que tanto as divisões
quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
S = 1 + 1/2+1/3+1/4.. 1/20*/
        double soma = 1,i= 0 ,n = 0;
        while(i <= 20){
            i = i + 1;
            if (i<20){
                n = n+ (1/i);
                soma = soma + n;
            }
        }
        System.out.println("A soma das frações é = " +soma);
    }
   
}
