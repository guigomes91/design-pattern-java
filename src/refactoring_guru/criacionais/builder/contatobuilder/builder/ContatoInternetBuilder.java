package refactoring_guru.criacionais.builder.contatobuilder.builder;

import refactoring_guru.criacionais.builder.contatobuilder.cliente.Contato;

/**
 *
 * @author Guilherme Gomes
 */
public class ContatoInternetBuilder {

    String nome, email;
    
    public ContatoInternetBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ContatoInternetBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public Contato getResult() {
        return new Contato(nome, "", email, "");
    }
}
