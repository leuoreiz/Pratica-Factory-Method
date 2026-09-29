package modelosProva.decorator;

/*
 * PAPEL NO PADRÃO: CONCRETE COMPONENT (componente concreto)
 *
 * O objeto "puro", que vai ser decorado. Não sabe nada dos adicionais.
 */
public class Cafe implements Bebida {

    @Override
    public String descricao() {
        return "Café";
    }

    @Override
    public double preco() {
        return 3.0;
    }
}
