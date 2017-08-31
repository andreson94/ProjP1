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
        String[] v = vetorNomes();
        //String nome = console.nextLine();
        //adicionarNome(v, nome);
        mediaAlunos(v);
    }
static String[] vetorNomes(){
        String v [] = new String[5];
        for(int i=0;i<v.length;i++){
           v[i]=console.nextLine();
            System.out.println(v[i]);
        }
        return v;
    }
    static Scanner console = new Scanner(System.in);

    static void adicionarNome(String[] v,String nome) {
        boolean listaCheia = false,naohExiste=false;
        
        while(listaCheia){
            for(int i=0;i<v.length-1;i++){
                
                if(v[i].equals(null)){
                    if(v[i].equalsIgnoreCase(nome)){
                        System.out.println("Nome já Existe");
                    naohExiste=true;
                
                    }else {
                        for(int j=0;j<v.length-1;j++){
                            v[i]=nome;
                            System.out.println(v[i]);
                    }}
            }else{
            System.out.println("Lista Cheia");
                listaCheia=true;
                }
            }
        }   
        
    }
      static void mediaAlunos(String[] v){
        String nome=" ";int cont=0;
        
        for(int i = 1;i <= v.length;i++){
            System.out.printf("Digite a nota do aluno %d: ",i);
            nome =console.nextLine();
            v[i] = nome;
            i++;
            cont++;
            if (v[i].equals(null)){
                System.out.println("ja existe");
            }
        }
        System.out.printf("ALuno: %S \nposição %d",nome,cont);
    }
}