public class TestaSmartTV {

    public static void main(String[] args) {

        // Criando primeira TV usando construtor vazio
        SmartTv st1 = new SmartTv();

        System.out.println("===== TESTE TV 1 =====");

        // Teste de volume inválido
        st1.setVolume(120);

        // Volume válido
        st1.setVolume(40);
        System.out.println("Volume atual: " + st1.getVolume());

        // Testando aumento de volume
        st1.aumentaVolume(10);
        System.out.println("Volume após aumentar: " + st1.getVolume());

        // Testando diminuir volume
        st1.diminuirVolume(20);
        System.out.println("Volume após diminuir: " + st1.getVolume());

        // Testando marca
        st1.setMarca("Samsung");
        System.out.println("Marca: " + st1.getMarca());

        // Testando modelo válido
        st1.setModelo("SmartTV");
        System.out.println("Modelo: " + st1.getModelo());

        // Testando modelo inválido
        st1.setModelo("smarttv");

        // Testando Youtube
        st1.abrirYoutube();


        System.out.println("\n===== TESTE TV 2 =====");

        // Criando segunda TV usando construtor com parâmetros
        SmartTv st2 = new SmartTv("LG", "OLED", 30, false);

        System.out.println("Marca: " + st2.getMarca());
        System.out.println("Modelo: " + st2.getModelo());
        System.out.println("Volume inicial: " + st2.getVolume());

        // Testando volume
        st2.aumentaVolume(15);
        System.out.println("Volume após aumentar: " + st2.getVolume());

        // Testando Youtube novamente
        st2.abrirYoutube();
    }
}