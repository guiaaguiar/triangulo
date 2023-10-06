
package triangulo;

public class Tri2 {
       public double l1, l2, l3;
    public String condi;
    
    public String calc(){
        if ((l1 + l2) < l3 || (l2 + l3) < l1 || (l1+l3) < l2){
            condi = "Isso não é um triângulo";
        }
        else if (l1 == l2 && l2 == l3) {
            condi = "Isso é um triângulo equilátero.";
        }
        else if (l1 == l2 || l1 ==l3 || l2 == l3){
            condi = "Isso é um triângulo isósceles";
        }
        else { 
            condi = "Isso é um triângulo escaleno.";
            
        } return condi;
        
    } 
    
}
