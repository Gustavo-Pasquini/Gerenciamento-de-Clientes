package unicesumar.gerenciamento_de_clientes.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import unicesumar.gerenciamento_de_clientes.Models.ClienteModel;
import unicesumar.gerenciamento_de_clientes.Services.ClienteService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteModel> criarCliente(@RequestBody ClienteModel clienteModel) {
        ClienteModel request = clienteService.criarCliente(clienteModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/clientes/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>> listarClientes() {
        List<ClienteModel> resquest = clienteService.listarClientees();
        return ResponseEntity.ok().body(resquest);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClienteModel> listarClientePorId(@PathVariable Long id) {
        ClienteModel request = clienteService.listarClientePorId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> deletarClientePorId(@PathVariable Long id) {
        clienteService.deletarClientePorId(id);
        return ResponseEntity.noContent().build();
    }
}
