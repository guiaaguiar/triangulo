
package triangulo;

import java.util.Scanner;
public class Triangulo {

    public static void main(String[] args) {
        Tri2 h = new Tri2();
        
        Scanner leia1 = new Scanner(System.in);
        System.out.println("Escreva o primeiro lado: ");
        h.l1 = leia1.nextDouble();
        
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Esreva o segundo lado: ");
        h.l2 = leia2.nextDouble();
        
        Scanner leia3 = new Scanner (System.in);
        System.out.println("Escreva o terceiro lado: ");
        h.l3 = leia3.nextDouble();
        
        h.calc();
        System.out.println(h.condi);
    }
}
