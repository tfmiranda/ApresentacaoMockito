/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apresentacaomockito;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author Tiago
 */
public class TestFuncionario {

    public TestFuncionario() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFuncionario()
    {
        FuncionarioDAOImpl dao = Mockito.mock(FuncionarioDAOImpl.class);        
        when(dao.getFuncionario(3)).thenReturn("Joao Mock");
        String mensagem = dao.getFuncionario(3);
        System.out.println(mensagem);
    }
}
