package ADOII;

import java.util.Scanner;

/**
 *
 * @author Andreson
 */
public class TesteTV {
    public static void main(String[] args) {
        
        TV tv = new TV();
        tv.ligar();
        tv.status();
        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());
        tv.setCanal(3);
        tv.setVolume(15);
        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());
        tv.desligar();
        tv.status();
    }
    
}
