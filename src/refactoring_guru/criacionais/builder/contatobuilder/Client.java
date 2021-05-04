package refactoring_guru.criacionais.builder.contatobuilder;

import refactoring_guru.criacionais.builder.contatobuilder.builder.ContatoCompletoBuilder;
import refactoring_guru.criacionais.builder.contatobuilder.builder.ContatoInternetBuilder;
import refactoring_guru.criacionais.builder.contatobuilder.builder.ContatoTelefoneBuilder;
import refactoring_guru.criacionais.builder.contatobuilder.cliente.Contato;
import refactoring_guru.criacionais.builder.contatobuilder.diretor.Director;

/**
 *
 * @author Guilherme Gomes
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        
        ContatoInternetBuilder contInt = new ContatoInternetBuilder();
        
        Contato ci = director.construirContatoInternet(contInt, "Guilherme Gomes", "guilherme@teste.com.br");
        System.out.println("Contato de Internet\n");
        System.out.println(ci.toString());
        
        ContatoTelefoneBuilder contTel = new ContatoTelefoneBuilder();
        
        Contato ct = director.construirContatoTelefone(contTel, "Viviane", "19982665478");
        System.out.println("Contato de Telefone\n");
        System.out.println(ct.toString());
        
        ContatoCompletoBuilder contFull = new ContatoCompletoBuilder();
        
        Contato cc = director.construirContato(contFull, "Guilherme", "1985222265", "teste@teste.com.br", "Rua Jorge Salibe, 28, Jardim Ibirapuera");
        
        System.out.println("Contato Completo\n");
        System.out.println(cc.toString());
    }
}
