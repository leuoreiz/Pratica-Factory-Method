package modelosProva.decorator;

public class Main {
    public static void main(String[] args) {
        // Café puro: 3.0
        Bebida bebida = new Cafe();
        System.out.println(bebida.descricao() + " = R$ " + bebida.preco());

        // Embrulha o café no Leite: 3.0 + 0.5
        bebida = new Leite(bebida);
        System.out.println(bebida.descricao() + " = R$ " + bebida.preco());

        // Embrulha tudo no Açúcar: 3.0 + 0.5 + 0.1
        bebida = new Acucar(bebida);
        System.out.println(bebida.descricao() + " = R$ " + bebida.preco());

        // Também dá para montar numa linha: new Acucar(new Leite(new Cafe()))
    }
}
