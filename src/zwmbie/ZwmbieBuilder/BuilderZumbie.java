package zwmbie.ZwmbieBuilder;

import zwmbie.ZumbisComposite.*;

public class BuilderZumbie {
    
    private Zumbie zumbis = new Zumbie();
       
    public BuilderZumbie temDeVida(int vida){
        zumbis.setVida(vida);
        return this;
    }    

    public BuilderZumbie eCorre(int velocidade){
        zumbis.setVelocidade(velocidade);
        return this;
    }    

    public Zumbie build(){
        return zumbis;
    }  
}
