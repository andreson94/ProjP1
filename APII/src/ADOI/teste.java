/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOI;

import java.util.Scanner;

/**
 *
 * @author Andreson
 */
public class teste {
     public static void main(String[] args) {
        int opcao;
        String[]v;
        
        v =vetorNomes();
         menu(v);
        adicionarNomes(v);       
        buscarNomes(v);
        excluirNome(v);
    }
    
    static Scanner console = new Scanner(System.in);
    
//apresentar um menu e escolher a opÃ§Ã£o
    static void menu(String[]v){
       
        int opcao ;
       boolean sair=true;
       
       do{
           
       System.out.println("\tMENU\n"+"1 - Adicionar um novo nome\n" +
        "2 - Apresentar os nomes\n" +
        "3 - Pesquisar um nome\n" +
        "4 - Remover um nome\n" +
        "0 - Sair\n");
       
       
        System.out.print("Digite o numero da opção desejada: ");
        opcao = console.nextInt();
        
        switch(opcao){
            case 1:
                adicionarNomes(v);
                break;
            case 2:
                mostrarNomes(v);
                break;
            case 3:
                buscarNomes(v);
                break;
            case 4:
                excluirNome(v);
                break;
            case 0:
                sair =false;
                break;
        }
        break;
       }while(sair);
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
    static void adicionarNomes(String[] v){
       String nome;
       int cont=0;
       
       boolean naohExiste = false;
                
        for(int i=0;i<v.length;i++){
            
            
            if (v[i].equalsIgnoreCase(" ")){
                
                System.out.print("Digite um nome:");
                nome=console.next();
                
                if(v[i].equalsIgnoreCase(nome)){
                    System.err.println("Nome já Existente");
            
                     naohExiste = true;

                    }else if(naohExiste)
                        v[i] = nome;
            
            }else{
                System.err.println("Lista cheia impossivel adicionar nomes");           
            }
        }
    }

//mostrar lista de nomes
    static void mostrarNomes(String[] v){
            
                
        for(int i=0;i<v.length;i++){
            
            if (v[i].equals(v[i]=" ")){
                System.out.println("Lista fazia");
            
            }else{
                System.out.println(v[i]+"\n");
            }
        }
    }

//buscar nome no vetor e informar posição
    static void buscarNomes(String[] v){
        String nome;
        
                nome=console.next();
    
        for(int i=0;i<v.length;i++){
            
            if(nome.equals(v[i])){
                System.out.printf("Nome encontrado na posição %d",i);
            break;
            
            }else{
                System.out.println("Nome não encontrado");
                break;
            }
        }
    }

//excluir nome nome no vetor
    static void excluirNome(String[]v){
       String excluido=null,nome;
       
               for(int i=0;i<v.length;i++){
                   
                   nome=console.next();
                   
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
    