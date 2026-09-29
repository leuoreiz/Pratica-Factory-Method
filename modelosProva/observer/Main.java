package modelosProva.observer;

public class Main {
    public static void main(String[] args) {
        Sujeito sujeito = new Sujeito();

        // Dois observadores se inscrevem no mesmo sujeito
        sujeito.anexar(new ObservadorConcreto("Observador 1"));
        sujeito.anexar(new ObservadorConcreto("Observador 2"));

        // Cada mudança de estado avisa os dois automaticamente
        sujeito.setEstado(10);
        sujeito.setEstado(20);
    }
}
