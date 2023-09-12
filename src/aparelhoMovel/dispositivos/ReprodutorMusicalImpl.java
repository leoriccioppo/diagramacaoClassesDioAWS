package aparelhoMovel.dispositivos;

public class ReprodutorMusicalImpl implements ReprodutorMusical{

	@Override
    public void play() {
        System.out.println("Reprodutor Musical: Música sendo reproduzida.");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor Musical: Música pausada.");
    }

}
