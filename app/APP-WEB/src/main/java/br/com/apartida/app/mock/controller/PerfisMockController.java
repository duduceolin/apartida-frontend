///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.apartida.app.mock.controller;
//
//import br.com.apartida.app.mock.dtos.MockPerfilDTO;
//import br.com.apartida.app.web.controller.BaseController;
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//
///**
// *
// * @author dudu
// */
//@ManagedBean(name = "perfisMockController")
//@ViewScoped
//public class PerfisMockController extends BaseController {
//
//    private List<MockPerfilDTO> perfis;
//
//    private MockPerfilDTO perfilSelecionado;
//
//    @PostConstruct
//    @Override
//    public void postConstruct() {
//        perfis = new ArrayList<>();
//        perfis.add(new MockPerfilDTO(new Long("1"), "Funcionário", Boolean.FALSE));
//        perfis.add(new MockPerfilDTO(new Long("2"), "Supervisor", Boolean.FALSE));
//        perfis.add(new MockPerfilDTO(new Long("3"), "Gerente", Boolean.TRUE));
//    }
//
//    public List<MockPerfilDTO> getPerfis() {
//        return perfis;
//    }
//
//    public void setPerfis(List<MockPerfilDTO> perfis) {
//        this.perfis = perfis;
//    }
//
//    public MockPerfilDTO getPerfilSelecionado() {
//        return perfilSelecionado;
//    }
//
//    public void setPerfilSelecionado(MockPerfilDTO perfilSelecionado) {
//        this.perfilSelecionado = perfilSelecionado;
//    }
//
//}
