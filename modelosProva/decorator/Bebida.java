package modelosProva.decorator;

/*
 * PAPEL NO PADRÃO: COMPONENT (componente)
 *
 * Contrato comum entre o objeto original (Cafe) e os enfeites (Leite, Acucar).
 * Como todos são "Bebida", dá para embrulhar um dentro do outro.
 */
public interface Bebida {
    String descricao();
    double preco();
}
