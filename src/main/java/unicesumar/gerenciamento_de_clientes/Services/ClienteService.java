package unicesumar.gerenciamento_de_clientes.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.gerenciamento_de_clientes.Models.ClienteModel;
import unicesumar.gerenciamento_de_clientes.Repositories.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel criarCliente(ClienteModel pedidoModel) {
        return clienteRepository.save(pedidoModel);
    }

    public List<ClienteModel> listarClientees() {
        return clienteRepository.findAll();
    }

    public ClienteModel listarClientePorId(Long id) {
        return clienteRepository.findById(id).get();
    }

    public void deletarClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }

}
