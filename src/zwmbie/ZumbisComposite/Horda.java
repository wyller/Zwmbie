package zwmbie.ZumbisComposite;

public class Horda implements Zumbis{
    private Zumbis zubie1;
    private Zumbis zubie2;

    public Horda(Zumbis zubie1, Zumbis zubie2) {
        this.zubie1 = zubie1;
        this.zubie2 = zubie2;
    }
    
    @Override
    public int getVida() {
        return this.zubie1.getVida() + this.zubie2.getVida();
    }

    @Override
    public int getVelocidade() {
        return this.zubie2.getVelocidade() + this.zubie2.getVelocidade();
    }         
}
