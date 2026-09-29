package modelosProva.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Financeiro financeiro = new Financeiro();

        // Três tipos diferentes passando pelo MESMO método registra()
        financeiro.registra(new Analista("Ana", 5000));         // 500
        financeiro.registra(new Gerente("Bruno", 8000));        // 800 + 1000
        financeiro.registra(new Diretor("Carla", 20000, 10));   // 20000 * 0,015 * 10 = 3000

        // printf = println com formatação. %n = quebra de linha.
        System.out.printf("Total de bonificações: R$ %.2f%n", financeiro.getTotal());
    }
}
