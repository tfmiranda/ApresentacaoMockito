/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apresentacaomockito;

import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
        List lista = gerarListaMockada1();
        System.out.println(lista.get(0));
        System.out.println(lista.get(0));
        System.out.println(lista.get(0));
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        
        verify(lista, atLeastOnce()).get(0);
    }

    private List gerarListaMockada1() {
        List lista = mock(List.class);
        when(lista.get(anyInt())).thenReturn("Nao existe");
        when(lista.get(0)).thenReturn("primeiro elemento 1", "primeiro elemento 2", "primeiro elemento 3");
        return lista;
    }
}
