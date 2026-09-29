package factoryMethodV2;

public class Main {
    public static  void main(String[] args) {
        Logistica logistica = new LogisticaAerea();
        logistica.planejarEntrega(5);

        Logistica logisti2 = new LogisticaMaritma();
        logisti2.planejarEntrega(5);

        Logistica logistica3 = new LogisticaRodoviaria();
        logistica3.planejarEntrega(5);


    }
}
