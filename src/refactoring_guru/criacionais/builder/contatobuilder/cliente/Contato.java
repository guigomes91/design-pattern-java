package refactoring_guru.criacionais.builder.contatobuilder.cliente;

/**
 *
 * @author Guilherme Gomes
 */
public class Contato {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Contato(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        str.append("Nome: " + nome + "\n");
        if(!telefone.equals("")) {
            str.append("\tTel.:" + telefone + "\n");
        }
        if(!endereco.equals("")) {
            str.append("\tEnd.:" + endereco + "\n");
        }
        if(!email.equals("")) {
            str.append("\tEmail:" + email + "\n");
        }
        
        return str.toString();
    }
}
