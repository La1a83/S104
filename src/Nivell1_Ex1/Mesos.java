
package Nivell1_Ex1;

import java.util.ArrayList;




public class Mesos {

    ArrayList<String> mesos = new ArrayList(){{add("GENER");add("FEBRER");
        add("MARÇ");add("ABRIL");add("MAIG");add("JUNY"); add("JULIOL");
        add ("AGOST");add("SETEMBRE");add("OCTUBRE");add("NOVEMBRE");
        add("DESEMBRE");}};
    
    
   
    //Mètode per saber el nombre de posicions de la llista.
    public int posicions () {
        int pos = this.mesos.size();
        return pos;
    }
    
    //Mètode per comprovar si la llista es nul·la.
    public boolean nula () {
        
        if (this.mesos.isEmpty()) {
            return true;
        } else {
            return false;
        }
       
    }
    //Mètode per comprobar la 8 posició de la llista (7 perquè es comença en 0).
    public String pos () {
        String posicio ="";
        posicio = this.mesos.get(7);
        return posicio;
    }
    
}
