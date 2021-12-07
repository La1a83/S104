/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell1_Ex1;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laiayjordi
 */
public class MesosTest extends Mesos {
    
    public MesosTest() {
        
    }
    
   

    

    /**
     * Test per verificar que hi han 12 elements.
     */
    @Test
    public void testPosicions() {
        Mesos instance = new Mesos ();
        int expResult =12;
        int result = instance.posicions();
        assertEquals(expResult,result);
        
    }
    //Test per validar que no sigui una llista buida.
    @Test
    public void esNula() {
        Mesos instance = new Mesos();
        assertNotNull(instance.nula());
    }
    
    //Test per comprobar que a la posició 8 de la llista hi ha "AGOST".
    @Test
    public void testAgost () {
        Mesos instance = new Mesos();
        String expResult ="AGOST";
        String result = instance.pos();
        assertEquals(expResult, result);
        
    }

    
        
    
}
