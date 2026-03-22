package unicesumar.gerenciamento_de_clientes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.gerenciamento_de_clientes.Models.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
