package aparelhoMovel.dispositivos;

public class NavegadorInternetImpl implements NavegadorInternet{
	
	@Override
    public void openBrowser() {
        System.out.println("Navegador na Internet: Abrindo o navegador.");
    }

    @Override
    public void novaAba() {
        System.out.println("Navegador na Internet: Abrindo uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador na Internet: Atualizando a página.");
    }

}
