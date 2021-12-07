/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell1_Ex3;

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
public class Exercici3Test {
    
    public Exercici3Test() {
    }
    
    
    
    @Test
    public void testExercici3ThrowsIndexOutOfBoundsException() {
    boolean thrown = false;// en principi thrown val false.

    try {
    Exercici3 instance = new Exercici3();
    instance.generaExcepcio();
    } catch (IndexOutOfBoundsException e) {//si genera ua exepcio thrown val true.
    thrown = true;
    }

    assertTrue(thrown);//ES compara que els dos siguin true :)
}

    
}
