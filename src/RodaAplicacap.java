public class RodaAplicacap {
    public static void main(String[] args) throws Exception {

        //--carro1 com os atributos passados usando set e mostrados com get
        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Renault Megane");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.30));
      

        //--carro2 com os atributos passados direto no construtor e mostrados com get
        Carro carro2 = new Carro("Cinza", "Gol", 45);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.totalValorTanque(5.99));


    }
}
