package modelosProva.decorator;

/*
 * PAPEL NO PADRÃO: CONCRETE DECORATOR (decorador concreto)
 */
public class Acucar extends Adicional {

    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descricao() {
        return bebida.descricao() + ", açúcar";
    }

    @Override
    public double preco() {
        return bebida.preco() + 0.1;             // preço de dentro + 0,10
    }
}
