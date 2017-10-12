
package zwmbie.PlayerObserver;

public class ObservadorInfeccao implements Observador{
    
    @Override
    public void notifica(String acao) {        
        if(acao.equalsIgnoreCase("Mordida")){
            System.out.println("Foi infectado");
        }else if(acao.equalsIgnoreCase("Remedio")){
            System.out.println("Foi Curado");
        }
    }
}
