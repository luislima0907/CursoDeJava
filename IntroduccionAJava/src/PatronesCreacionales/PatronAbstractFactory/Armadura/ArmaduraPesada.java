package PatronesCreacionales.PatronAbstractFactory.Armadura;

public class ArmaduraPesada implements Armadura{
    @Override
    public void proteger() {
        System.out.println("La armadura protege");
    }
}
