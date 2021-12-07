
package Nivell1_Ex2;


public class CalculoDni {
    
    String lletres ="TRWAGMYFPDXBNJZSQVHLCKE";
    
    
    public char calculaLLetra(int numDNI) {
        int resultat = numDNI%23;
        return this.lletres.charAt(resultat);
    }
    
}
