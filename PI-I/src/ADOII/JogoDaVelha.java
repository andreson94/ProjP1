package ADOII;

import java.util.Scanner;

    public class JogoDaVelha {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int jogadores,jogador1 = 0,jogador2 = 0;
            System.out.print("De Quem é a Vez? ");
            jogadores= Integer.parseInt(leitor.nextLine());
            if (jogadores == 0){
                System.out.println("Em qual posição?");
                jogador1 = Integer.parseInt(leitor.nextLine());
                } switch (jogador1) {
                case 1:
                    System.out.println(" X |   |   ");
                    System.out.println("---+---+---"); 
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 2:
                    System.out.println("   | X |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 3:
                    System.out.println("   |   | X ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 4:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println(" X |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 5:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   | X |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 6:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   | X ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 7:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println(" X |   |   ");
                    break;    
                case 8:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   | X |   ");
                    break;   
                       
                case 9:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   | X ");
                    break;   
                default:
                    break;
   
                } if (jogadores == 1){
                System.out.println("Em qual posição?");
                jogador2 = Integer.parseInt(leitor.nextLine());
                } switch (jogador2) {
                case 1:
                    System.out.println(" O |   |   ");
                    System.out.println("---+---+---"); 
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 2:
                    System.out.println("   | O |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 3:
                    System.out.println("   |   | O ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 4:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println(" O |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 5:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   | O |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 6:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   | O ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    break;
                case 7:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println(" O |   |   ");
                    break;    
                case 8:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   | O |   ");
                    break;   
                       
                case 9:
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   | O ");
                    break;   
                default:
                    break;   
            }
        }
    }        