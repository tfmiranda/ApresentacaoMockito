/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apresentacaomockito;

/**
 *
 * @author Tiago
 */
public class FuncionarioDAOImpl implements IFuncionarioDAO {

    @Override
    public String getFuncionario(int i) {
        System.out.println("Fui no banco de dados!");
        return "Joao";
    }

}
