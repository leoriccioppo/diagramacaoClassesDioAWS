package aparelhoMovel;

import aparelhoMovel.dispositivos.ReprodutorMusical;
import aparelhoMovel.dispositivos.ReprodutorMusicalImpl;
import aparelhoMovel.dispositivos.AparelhoTelefonico;
import aparelhoMovel.dispositivos.AparelhoTelefonicoImpl;
import aparelhoMovel.dispositivos.NavegadorInternet;
import aparelhoMovel.dispositivos.NavegadorInternetImpl;

public class Iphone {

	public static void main(String[] args) {
		
		ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
        NavegadorInternet navegadorInternet = new NavegadorInternetImpl();

        // Testando os métodos
        reprodutorMusical.play();
        aparelhoTelefonico.ligar();
        navegadorInternet.openBrowser();

	}

}
