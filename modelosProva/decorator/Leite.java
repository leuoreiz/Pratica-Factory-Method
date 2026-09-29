package modelosProva.decorator;

/*
 * PAPEL NO PADRÃO: CONCRETE DECORATOR (decorador concreto)
 *
 * Pega o resultado da bebida de dentro e SOMA o seu pedaço.
 */
public class Leite extends Adicional {

    public Leite(Bebida bebida) {
        super(bebida);   // guarda a bebida embrulhada no atributo do Adicional
    }

    @Override
    public String descricao() {
        return bebida.descricao() + ", leite";   // "Café" -> "Café, leite"
    }

    @Override
    public double preco() {
        return bebida.preco() + 0.5;             // preço de dentro + 0,50
    }
}
