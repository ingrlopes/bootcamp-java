package digitalinnovationone.facade;

import digitalinnovationone.facade.subsistema.cep.CepApi;
import digitalinnovationone.facade.subsistema.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}