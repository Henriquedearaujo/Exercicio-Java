package br.com.araujo;

import br.com.araujo.dao.ClienteDao;
import br.com.araujo.dao.ClienteDaoMock;
import br.com.araujo.dao.IClienteDao;
import br.com.araujo.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServerTest {
    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
