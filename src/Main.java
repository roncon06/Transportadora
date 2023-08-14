public class Main {
    public static void main(String[] args) {

        Transportadora transporteNautico = new TransporteNautico();
        Transportadora transporteTerrestre = new TransporteTerrestre();

        int altura = 30;
        int largura = 10;

        double freteNautico = transporteNautico.calculaFrete(altura, largura);
        double freteTerrestre = transporteTerrestre.calculaFrete(altura, largura);

        System.out.format("Frete Náutico: %f ",freteNautico);
        System.out.format("Frete Terrestre: %f ", freteTerrestre);


    }
}