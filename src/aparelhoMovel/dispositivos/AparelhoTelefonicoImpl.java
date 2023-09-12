package aparelhoMovel.dispositivos;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico{
	
	@Override
    public void ligar() {
        System.out.println("Aparelho Telefônico: Ligando para um número.");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho Telefônico: Chamada atendida.");
    }

    @Override
    public void recusar() {
        System.out.println("Aparelho Telefônico: Chamada recusada.");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Aparelho Telefônico: Acessando correio de voz.");
    }

}
