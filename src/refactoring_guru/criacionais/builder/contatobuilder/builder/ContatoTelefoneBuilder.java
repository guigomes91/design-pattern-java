package refactoring_guru.criacionais.builder.contatobuilder.builder;

import refactoring_guru.criacionais.builder.contatobuilder.cliente.Contato;

/**
 *
 * @author Guilherme Gomes
 */
public class ContatoTelefoneBuilder {

    String nome, telefone;
    
    public ContatoTelefoneBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    public ContatoTelefoneBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
    
    public Contato getResult() {
        return new Contato(nome, "", "", telefone);
    }
}
