package zwmbie.PlayerState;

public class Infectado implements State{

    @Override
    public void andar() {
        System.out.println("Andou Devagar");
    }

    @Override
    public void atacar() {
        System.out.println("Atacou Devagar");
    }
    
}
