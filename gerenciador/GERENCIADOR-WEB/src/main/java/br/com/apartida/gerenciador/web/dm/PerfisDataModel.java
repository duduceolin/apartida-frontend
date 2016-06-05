/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.gerenciador.web.dm;

import br.com.apartida.acesso.acesso.PerfilServiceAcesso;
import br.com.apartida.gerenciador.web.util.FacesUtils;
import br.com.apartida.servicos.perfilservice.InPesquisarPelaEmpresa;
import br.com.apartida.servicos.perfilservice.IspoException_Exception;
import br.com.apartida.servicos.perfilservice.OutPesquisarPerfis;
import br.com.apartida.servicos.perfilservice.PerfilFuncDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

/**
 *
 * @author dudu
 */
public class PerfisDataModel extends LazyDataModel<PerfilFuncDTO> implements Serializable {

    private static final long serialVersionUID = -647451595441661027L;

    private List<PerfilFuncDTO> dataSource;

    private final PerfilServiceAcesso acesso;

    private final Long idEmpresa;

    public PerfisDataModel(PerfilServiceAcesso acesso, Long idEmpresa) {
        this.acesso = acesso;
        dataSource = new ArrayList<>();
        this.idEmpresa = idEmpresa;
        this.setRowCount(10);
    }

    @Override
    public List<PerfilFuncDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {

        try {

            InPesquisarPelaEmpresa inPesquisar = new InPesquisarPelaEmpresa();
            inPesquisar.setIdEmpresa(idEmpresa);
            inPesquisar.setPrimeiro(first);
            inPesquisar.setTamanho(pageSize);
            OutPesquisarPerfis outPesquisar = acesso.pesquisarPerfisPelaEmpresa(inPesquisar);
            dataSource = outPesquisar.getPerfis();

        } catch (IspoException_Exception ex) {
            FacesUtils.mostrarMensagemErro(ex.getMessage());
        }

        return dataSource;
    }

    @Override
    public Object getRowKey(PerfilFuncDTO perfil) {
        return perfil.getId();
    }

    @Override
    public PerfilFuncDTO getRowData(String playerId) {
        Long id = Long.valueOf(playerId);

        for (PerfilFuncDTO player : dataSource) {
            if (id.equals(player.getId())) {
                return player;
            }
        }

        return null;
    }

    public List<PerfilFuncDTO> getDataSource() {
        return dataSource;
    }

    public void setDataSource(List<PerfilFuncDTO> dataSource) {
        this.dataSource = dataSource;
    }

}
