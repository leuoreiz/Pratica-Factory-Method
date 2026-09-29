package modelosProva.factoryMethod;

import java.util.HashMap;
import java.util.Map;

/*
 * PAPEL NO PADRÃO: CLIENT (cliente)
 *
 * Quem USA o sistema. Regras:
 *  - só cria CRIADORES (new CriadorA...), nunca PRODUTOS (new ProdutoA...);
 *  - guarda em variável do tipo abstrato (Criador), não CriadorA.
 */
public class Main {
    public static void main(String[] args) {

        // ---------- Forma 1: chamar direto ----------
        // Variável do tipo abstrato "Criador" recebendo um criador concreto.
        Criador c1 = new CriadorA("Ana", 80000, 22);
        c1.processar();   // roda o fluxo do Criador; por dentro ele cria um ProdutoA

        Criador c2 = new CriadorB("Bruno", 40, 300000, true, false);
        c2.processar();

        // ---------- Casos rejeitados ----------
        // Bom mostrar no main que a rejeição funciona (é critério de avaliação).
        new CriadorA("Carla", 10000, 30).processar();                // base abaixo de 50 mil
        new CriadorB("Davi", 50, 900000, false, false).processar();  // capital alto sem atestado

        // ---------- Forma 2: escolher pelo tipo SEM if/switch ----------
        // Map = "dicionário": liga uma chave (texto) a um valor (um criador).
        Map<String, Criador> criadores = new HashMap<>();
        criadores.put("A", new CriadorA("Eva", 120000, 35));
        criadores.put("B", new CriadorB("Fabio", 30, 600000, false, true));

        String tipo = "B";                // imagine que veio do usuário/enunciado
        criadores.get(tipo).processar();  // busca o criador pela chave e processa
        // Tipo novo = só mais um put(). Nenhum if para editar.
    }
}
