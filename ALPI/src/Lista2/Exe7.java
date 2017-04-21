package Lista2;
public class Exe7 {
    public static void main(String[] args) {
        /*Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço WHILE*/
        int i = 0,m=0;
        System.out.println("Multiplus de 7 menores que 200");
        while (i < 200){
            
            i = i + 1;
            m = i * 7;
            if (m < 200){
            System.out.print(m+"\n");
        }
    }
}
}