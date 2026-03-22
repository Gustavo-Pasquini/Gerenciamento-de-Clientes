package unicesumar.gerenciamento_de_clientes.Models;

import jakarta.persistence.*;

@Entity
@Table(name="tb_cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cli_id")
    private Long id;

    @Column(name="cli_nome")
    private String nome;
    private String email;
    private String telefone;

    public ClienteModel() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
