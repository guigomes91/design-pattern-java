package refactoring_guru.criacionais.builder.contatobuilder.builder;

import refactoring_guru.criacionais.builder.contatobuilder.cliente.Contato;

/**
 *
 * @author Guilherme Gomes
 */
public class ContatoCompletoBuilder {
    String nome, telefone, email, endereco;
    
    public ContatoCompletoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    public ContatoCompletoBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
    
    public ContatoCompletoBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }
    
    public ContatoCompletoBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public Contato getResult() {
        return new Contato(nome, endereco, email, telefone);
    }
}
