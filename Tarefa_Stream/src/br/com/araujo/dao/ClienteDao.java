package br.com.araujo.dao;

public class ClienteDao implements  IClienteDao {
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Buscando";
    }
}
