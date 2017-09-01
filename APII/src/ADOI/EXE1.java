package ADOI;

import java.util.Scanner;

/**
 *
 * @author Andreson da Cruz Silva
 */
public class EXE1 {
    public static void main(String[] args) {
        int opcao;
        
        opcao = menu();
        String[]v =vetorNomes();
        adicionarNomes(v, opcao);       
        buscarNomes(v,opcao);
        excluirNome(v, opcao);
    }
    
    static Scanner console = new Scanner(System.in);
    
//apresentar um menu e escolher a opÃ§Ã£o
    static int menu(){
       int opcao;

       System.out.print("\tMENU\n"+"1 - Adicionar um novo nome\n" +
"2 - Apresentar os nomes\n" +
"3 - Pesquisar um nome\n" +
"4 - Remover um nome\n" +
"0 - Sair\n");
        System.out.print("Digite o numero da opção desejada: ");
        opcao = console.nextInt();
        return opcao;

    }
    
//criar o vetor a ser utilizado na lista
    static String[] vetorNomes(){
        String v [] = new String[10];
        for(int i=0;i<v.length;i++){
        v[i]=" ";
    }
        return v;
    }
//adicionar nomes ao vetor criado
    static void adicionarNomes(String[] v,int opcao){
       String nome;
       boolean naohExiste = false;

       
        switch(opcao){
        
            case 1: 
                
        for(int i=0;i<v.length;i++){
            
            
            if (v[i].equalsIgnoreCase(" ")){
                
                System.out.print("Digite um nome:");
                nome=console.nextLine();
                
                if(v[i].equalsIgnoreCase(nome)){
                    System.err.println("Nome já Existente");
            
                     naohExiste = true;

                    }else if(naohExiste)
                        v[i] = nome;
            
            }else{
                System.err.println("Lista cheia impossivel adicionar nomes");           
            }
        }
        break;
        }
    }
    //buscar nome no vetor e informar posiÃ§Ã£o
    static void mostrarNomes(String[] v,int opcao){
        switch(opcao){
            
            case 2:
                
        for(int i=0;i<v.length;i++){
            
            if (v[i].equals(v[i]=" ")){
                System.out.println("Lista fazia");
            }else{
                System.out.println(v[i]+"\n");
            }
        }
        }
    }
    static void buscarNomes(String[] v,int opcao){
        String nome;
        
        switch(opcao){
            case 3:
          
                nome=console.nextLine();
    
        for(int i=0;i<v.length;i++){
            
            if(nome.equals(v[i])){
                System.out.printf("Nome encontrado na posição %d",i);
            break;
            
            }else{
                System.out.println("Nome não encontrado");
                break;
            }
        }
        break;
        }
    }
   static void excluirNome(String[]v,int opcao){
       String excluido=null,nome;
       
       switch(opcao){
           case 4:
               for(int i=0;i<v.length;i++){
                   
                   nome=console.nextLine();
                   
                   if(nome.equals(v[i])){
                       excluido=v[i];
                       v[i]=v[i]+1;
                       System.out.println(v[i]);
                   }else{
                       System.out.println("nome nÃo estÃ¡ na Lista ");
                   }
               }
       }
   }
    
}
