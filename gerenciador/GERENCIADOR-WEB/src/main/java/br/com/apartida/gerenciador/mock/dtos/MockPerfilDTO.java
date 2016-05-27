/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.mock.dtos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dudu
 */
public class MockPerfilDTO {
    
    private Long id;
    private String nome;
    private Boolean isAdmin;
    private List<MockFuncionalidadesDTO> listaFuncionalidades;
    
    public MockPerfilDTO(Long id, String nome, Boolean admin){
       this.id = id;
       this.nome = nome;
       this.isAdmin = admin;
       listaFuncionalidades = new ArrayList<>();
       listaFuncionalidades.add(new MockFuncionalidadesDTO("Cadastrar quadra"));
       listaFuncionalidades.add(new MockFuncionalidadesDTO("Listar quadras"));
       listaFuncionalidades.add(new MockFuncionalidadesDTO("Listar horários"));
       listaFuncionalidades.add(new MockFuncionalidadesDTO("Cadastrar horário"));
       listaFuncionalidades.add(new MockFuncionalidadesDTO("Marcar horário"));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<MockFuncionalidadesDTO> getListaFuncionalidades() {
        return listaFuncionalidades;
    }

    public void setListaFuncionalidades(List<MockFuncionalidadesDTO> listaFuncionalidades) {
        this.listaFuncionalidades = listaFuncionalidades;
    }
    
    
}
