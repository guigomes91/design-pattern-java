package refactoring_guru.criacionais.builder.contatobuilder.diretor;

import refactoring_guru.criacionais.builder.contatobuilder.builder.ContatoCompletoBuilder;
import refactoring_guru.criacionais.builder.contatobuilder.builder.ContatoInternetBuilder;
import refactoring_guru.criacionais.builder.contatobuilder.builder.ContatoTelefoneBuilder;
import refactoring_guru.criacionais.builder.contatobuilder.cliente.Contato;

/**
 *
 * @author Guilherme Gomes
 */
public class Director {

    public Director() {}
    
    public Contato construirContatoInternet(ContatoInternetBuilder builder, String nome, String email) {
        return builder.setEmail(email).setNome(nome).getResult();
    }
    
    public Contato construirContatoTelefone(ContatoTelefoneBuilder builder, String nome, String telefone) {
        return builder.setNome(nome).setTelefone(telefone).getResult();
    }
    
    public Contato construirContato(ContatoCompletoBuilder builder, 
            String nome, String telefone, String email, String endereco) {
        return builder.setNome(nome).
                            setTelefone(telefone).
                                setEndereco(endereco).
                                    setEmail(email).getResult();
    }
}
