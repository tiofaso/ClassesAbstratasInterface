package exercicio01lampada;

public class FabricaLampada {
    int tipoLampada;

    public class Incandescente implements Lampada{
        public void ligar(){
            System.out.println("PLIM! Acendi!!!");
        }
        public void desligar() {
            System.out.println("Tec-tec... apaguei...");
        }
    }

    public class Fluorescente implements Lampada{
        public void ligar(){
            System.out.println("PLIM! Acendi!!!");
        }
        public void desligar() {
            System.out.println("Tec-tec... apaguei...");
        }
    }

    public void construir(int tipoLampada){
        this.tipoLampada = tipoLampada;

        if(this.tipoLampada == 1){//Lâmpada incandescente
            System.out.println("> LÂMPADA INCANDESCENTE");
            Incandescente minhaLampada = new Incandescente();
            minhaLampada.ligar();
            minhaLampada.desligar();
        }else if(this.tipoLampada == 2){//Lâmpada fluorescente
            System.out.println("> LÂMPADA FlUORESCENTE");
            Fluorescente minhaLampada = new Fluorescente();
            minhaLampada.ligar();
            minhaLampada.desligar();
        }
    }
}
