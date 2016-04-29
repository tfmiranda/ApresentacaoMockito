/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apresentacaomockito;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Spy;

/**
 *
 * @author Tiago
 */
public class TestsBasicos {

    public TestsBasicos() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testeBasico() {
        ArrayList<String> lista = mock(ArrayList.class);        
        when(lista.size()).thenReturn(100);
        when(lista.add(anyString())).thenCallRealMethod();
        lista.add("a");
        System.out.println(lista.get(0));
    }

}
