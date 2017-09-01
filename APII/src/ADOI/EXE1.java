package ADOI;

import java.util.Scanner;

/**
 *
 * @author Andreson da Cruz Silva
 */
public class EXE1 {
    public static void main(String[] args) {
        String nome;
        boolean add,buscar;
        menu();
        String[]v =vetorNomes();
        nome = console.nextLine();
        add = adicionarNomes(v,0, nome);
        buscar = buscarNomes(v,0, nome);
        System.out.println(add);
        excluirNome(v, 0, nome);
        System.out.println(nome+" "+buscar);
    }
    
    static Scanner console = new Scanner(System.in);
    
//apresentar um menu e escolher a opção
    static int menu(){
        System.out.print("\tMENU\n"+"1 - Adicionar um novo nome\n" +
"2 - Apresentar os nomes\n" +
"3 - Pesquisar um nome\n" +
"4 - Remover um nome\n" +
"0 - Sair\n");
        System.out.print("Digite o numero da opção desejada: ");
        int opcao = console.nextInt();
        return opcao;

    }
    
//criar o vetor a ser utilizado na lista
    static String[] vetorNomes(){
        String v [] = new String[10];
        return v;
    }
//adicionar nomes ao vetor criado
    static boolean adicionarNomes(String[] v,int opcao,String nome){
       
        switch(opcao){
        
            case 1: 
                
        for(int i=0;i<v.length;i++){
            
            boolean naohExiste = false;
            
            if (v[i].equals(null)){
                
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
        break;
        }
        return false;
    }
    //buscar nome no vetor e informar posição
    static boolean buscarNomes(String[] v,int opcao,String nome){
        switch(opcao){
            case 3:
        for(int i=0;i<v.length;i++){
            
            if(nome.equals(v[i])){
                System.out.printf("Nome encontrado na posição %d",i);
    return true;
            }else{
                System.out.println("Nome não encontrado");
            }
        }
        break;
        }
            return false;
    }
   static void excluirNome(String[]v,int opcao,String nome){
       String excluido=null;
       
       switch(opcao){
           case 4:
               for(int i=0;i<v.length;i++){
                   
                   if(nome.equals(v[i])){
                       excluido=v[i];
                       v[i]=v[i]+1;
                       System.out.println(v[i]);
                   }else{
                       System.out.println("nome não está na Lista");
                   }
               }
       }
   }
    
}
