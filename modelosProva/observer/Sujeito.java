package modelosProva.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * PAPEL NO PADRÃO: SUBJECT (sujeito / observado)
 *
 * Guarda uma lista de observadores. Quando o estado muda,
 * percorre a lista e avisa todo mundo (relação um-para-muitos).
 */
public class Sujeito {

    // Lista dos interessados. Guarda pelo tipo da interface, então
    // aceita qualquer classe que implemente Observador.
    private final List<Observador> observadores = new ArrayList<>();

    private int estado;   // o dado que, quando muda, gera aviso

    // "Inscrever" um observador
    public void anexar(Observador observador) {
        observadores.add(observador);
    }

    // "Desinscrever" um observador
    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    public int getEstado() {
        return estado;
    }

    // Ao mudar o estado, avisa automaticamente. Esse é o ponto do padrão.
    public void setEstado(int estado) {
        this.estado = estado;
        notificarTodos();
    }

    // private: só o próprio Sujeito dispara as notificações
    private void notificarTodos() {
        for (Observador observador : observadores) {   // "para cada observador da lista"
            observador.atualizar(estado);
        }
    }
}
