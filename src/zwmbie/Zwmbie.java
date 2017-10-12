package zwmbie;

import zwmbie.ZumbisComposite.Zumbie;
import zwmbie.ZumbisComposite.Horda;
import zwmbie.ZumbisComposite.Zumbis;
import zwmbie.Player.Player;
import zwmbie.PlayerObserver.ObservadorInfeccao;
import zwmbie.ZwmbieBuilder.BuilderZumbie;

public class Zwmbie {

    public static void main(String[] args) {

        Zumbis normal = new Zumbie();
        Zumbis capiroto = new Zumbie();
        normal = new BuilderZumbie().temDeVida(30).eCorre(50).build();
        capiroto = new BuilderZumbie().temDeVida(150).eCorre(30).build();
        
        Zumbis hordaFraca = new Horda(normal, normal);
        Zumbis hordaMedia = new Horda(hordaFraca, normal);
        Zumbis hordaForte = new Horda(hordaFraca, capiroto);
        
        System.out.println(hordaForte.getVida());
        System.out.println(hordaForte.getVelocidade());
        
        System.out.println("----------");
        
        Player Leon = new Player();
        Leon.addObservadores(new ObservadorInfeccao());
        
        Leon.setAcontecimento("mordida");
        Leon.andar();
        Leon.atacar();
        
        System.out.println("----------");
        
        Leon.setAcontecimento("Remedio");
        Leon.andar();
        Leon.atacar();
 
    }  
}
