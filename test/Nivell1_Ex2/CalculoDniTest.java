/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell1_Ex2;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class CalculoDniTest {
    //Es parametritxen 10 dnis amb les seves lletres per veure si funciona el mètode: 
   
    @Parameters
    public static Iterable<Object[]> gestData() {
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{47703668,'N'});
        obj.add(new Object[]{85984428,'D'});
        obj.add(new Object[]{47484466,'T'});
        obj.add(new Object[]{99829546,'R'});
        obj.add(new Object[]{62582085,'M'});
        obj.add(new Object[]{49891987,'L'});
        obj.add(new Object[]{87218138,'E'});
        obj.add(new Object[]{55676148,'W'});
        obj.add(new Object[]{82354514,'R'});
        obj.add(new Object[]{97891889,'W'});
        
        return obj;
    }
    
    
    private int a;
    private char exp;
    
    public CalculoDniTest(int a, char exp) {
        this.a = a;
        this.exp = exp;
    }
    
    
    /**
     * Test of calculaLLetra method, of class CalculoDni.
     */
    
    @Test //Anirà probant aquest mètode amb els 10 objectes parametrizats abans.
    public void testCalculaLLetra() {
        
        CalculoDni instance = new CalculoDni();
        char result = instance.calculaLLetra(a);
        assertEquals(exp, result);
      
    }
    
}
