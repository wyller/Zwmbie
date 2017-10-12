package zwmbie.Player;

import zwmbie.PlayerState.State;
import java.util.ArrayList;
import java.util.List;
import zwmbie.PlayerObserver.Observador;
import zwmbie.PlayerState.Infectado;
import zwmbie.PlayerState.Normal;

public class Player {
    private List<Observador> observadores = new ArrayList<>();
    private State estado;
      
    public void andar(){
        estado.andar();
    }
    
    public void atacar(){
        estado.atacar();
    }

    private void setEstado(State estado) {
        this.estado = estado;
    }
    
    public void setAcontecimento(String acao){
        if(acao.equalsIgnoreCase("mordida")){
            setEstado(new Infectado());
        }
        else if(acao.equalsIgnoreCase("remedio")){
            setEstado(new Normal());
        }
        
        for(Observador o : observadores){
            o.notifica(acao);
        }
    }
    
    public void addObservadores(Observador observador){
        observadores.add(observador);
    }
}
