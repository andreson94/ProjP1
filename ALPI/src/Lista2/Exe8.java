package Lista2;
public class Exe8 {
    public static void main(String[] args) {
        /*Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize o laço que
lhe for mais conveniente*/
        int soma = 0,media,i,par = 0;
        for (i = 13 ; i < 73 ;i = i + 1){
            par = i%2;
            if (par == 0 ){
                par = i;
                soma = soma + par; 
        }
        }
            media = soma / 31;
            System.out.println("Média = "+media);
    }
}
