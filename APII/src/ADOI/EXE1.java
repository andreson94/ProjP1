package ADOI;

import java.util.Scanner;

/**
 *
 * @author Andreson da Cruz Silva
 */
public class EXE1 {
    public static void main(String[] args) {
        String nome;
        
        menu();
        escolherOpcoes();
        String[]v =vetorNomes();
        nome = console.nextLine();
        adicionarNomes(v, nome);
        buscarNomes(v, nome);
    }
    
    static Scanner console = new Scanner(System.in);
    //apresentar um menu
    static void menu(){
        System.out.print("\tMENU\n"+"1 - Adicionar um novo nome\n" +
"2 - Apresentar os nomes\n" +
"3 - Pesquisar um nome\n" +
"4 - Remover um nome\n" +
"0 - Sair\n");
    }
    //testar o menu
    static int escolherOpcoes(){
        int opcao = console.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Adicionar um novo Nome");
                break;
            case 2:
                System.out.println("Apresentar os Nomes");
                break;
            case 3:
                System.out.println("Pesquisar um Nome");
                break;
            case 4:
                System.out.println("Remover um Nome");
                break;
            case 0:
                System.out.println("sair");
            
        }
        return opcao;
        
    }
    //criar o vetor a ser utilizado na lista
    static String[] vetorNomes(){
        String v [] = new String[10];
        return v;
    }
    //adicionar nomes ao vetor criado
    static boolean adicionarNomes(String[] v,String nome){
       
       // if(opcao == 1){
            
        for(int i=0;i<v.length;i++){
            boolean naohExiste = false;
            
            if (v[i].equalsIgnoreCase(null)){
                
                if(v[i].equalsIgnoreCase(nome)){
                    System.err.println("Nome já Existente");
            
                    return naohExiste = true;

                    }else if(naohExiste)
                        v[i] = nome;
                    return true;
            
            }else{
                System.err.println("Lista cheia impossivel adicionar nomes");           
                  return true;  
            }
        }
       // }
        return false;
    }
    //buscar nome no vetor e informar posição
    static boolean buscarNomes(String[] v,String nome){
        
        for(int i=0;i<v.length;i++){
            
            if(nome.equalsIgnoreCase(v[i])){
                System.out.printf("Nome encontrado na posição %d",i);
    return true;
            }else{
                System.out.println("Nome não encontrado");
            }
        }
            return false;
    }
   
    
}
