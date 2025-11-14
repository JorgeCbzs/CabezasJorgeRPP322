/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuparcial;

/**
 *
 * @author jorge
 */
public class Juvenil extends Jugador implements PracticarPareja{
    
    boolean tieneTutor;
    
    public Juvenil(String nombre, int ranking, Superficie superficieFavorita, boolean tieneTutor) {
        super(nombre, ranking, superficieFavorita);
        this.tieneTutor = tieneTutor;
    }
    
    
        
    @Override
    public String getDatos(){
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        if (tieneTutor){
            sb.append("Tiene tutor.");
        }else{
            sb.append("No tiene tutor");
        }
        
        return super.getDatos() + sb.toString();
    }



    @Override
    public void practicar() {
        System.out.println("Practica con su pareja.");
    }
    
}
