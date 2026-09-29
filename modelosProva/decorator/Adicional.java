package modelosProva.decorator;

/*
 * PAPEL NO PADRÃO: DECORATOR (decorador abstrato)
 *
 * O truque do padrão está aqui:
 *  - ELE É uma Bebida      (implements Bebida)
 *  - ELE TEM uma Bebida    (atributo "bebida")
 * Assim um Adicional pode embrulhar um Cafe ou até outro Adicional.
 */
public abstract class Adicional implements Bebida {

    // A bebida que está "dentro" do embrulho
    protected final Bebida bebida;

    public Adicional(Bebida bebida) {
        this.bebida = bebida;
    }
    // Não implementa descricao()/preco(): como a classe é abstrata,
    // quem implementa são as subclasses (Leite, Acucar).
}
