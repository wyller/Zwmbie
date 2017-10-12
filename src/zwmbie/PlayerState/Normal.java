package zwmbie.PlayerState;

public class Normal implements State{

    @Override
    public void andar() {
        System.out.println("Andou Normal");
    }

    @Override
    public void atacar() {
        System.out.println("Atacou Normal");
    }
}
