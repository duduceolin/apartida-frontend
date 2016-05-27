/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.mock.dtos;

/**
 *
 * @author dudu
 */
public class MockFuncionalidadesDTO {

    public MockFuncionalidadesDTO(String nome){
        this.nome = nome;
    }
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
