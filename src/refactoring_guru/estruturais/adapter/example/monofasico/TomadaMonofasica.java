package refactoring_guru.estruturais.adapter.example.monofasico;

/**
 *
 * @author Guilherme Gomes
 */
public class TomadaMonofasica {
    private int tensao;

    public TomadaMonofasica(int tensao) {
        this.tensao = tensao;
    }

    public int getTensao() {
        return tensao;
    }
    
    public void encaixeTomada(TomadaA a) {
        if(this.tensao >= 115 && this.tensao <= 220 && a.getPino() <= 3) {
            System.out.println("Tomada modelo " + a.getModelo() + " de " + a.getPino() + " pinos!");
        } else {
            System.out.println("Tomada fora de padrão!");
        }
    }
}
