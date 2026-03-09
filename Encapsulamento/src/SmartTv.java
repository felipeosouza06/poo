public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTv() {
    }

    public SmartTv(String marca, String modelo, int volume, boolean internet) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.internet = true;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("O volume informado é inválido!\n");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca) {
        // Metodo lenght() metodo de instância
        if (marca.length() <= 30) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida");
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);
        if (resp) {
            this.modelo = modelo;
        } else {
            System.out.println("\nModelo inválido");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void aumentaVolume(int x) {
        this.setVolume(this.volume + x);
    }

    public void diminuirVolume(int x) {
        this.setVolume(this.volume - x);
    }

    public void abrirYoutube() {
        if (this.conectaInternet()) {
            System.out.println("Youtube abrindo");
        } else {
            System.out.println("Sem internet para abrir o Youtube");
        }
    }

    //Não vamos expor esse metodo, não quero torná-lo visível em outras classes
    public boolean conectaInternet() {
        System.out.println("Verificando conexões disponíveis");
        System.out.println("Consultando as credenciais");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 5) {
            System.out.println("IP gerado com sucesso\n");
            return true;
        } else {
            System.out.println("Falha na conexão\n");
            return false;
        }
    }
}