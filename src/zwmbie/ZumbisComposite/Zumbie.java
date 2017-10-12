package zwmbie.ZumbisComposite;

public class Zumbie implements Zumbis{

    private int vida;
    private int velocidade;

    private void checaVida(int vida){
        if(vida < 20){
            System.out.println("Zumbis são normalmente mais resistentes, almente a vida");
        }
        else{
            this.vida = vida;
        }
    }
    
    public void setVida(int vida) {
        checaVida(vida);
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getVelocidade() {
        return this.velocidade;
    }
}
