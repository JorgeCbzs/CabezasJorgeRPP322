/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuparcial;

/**
 *
 * @author jorge
 */
public class Singlista extends Jugador implements Sacable{
    private int velocidad;

    public Singlista(String nombre, int ranking, Superficie superficieFavorita, int velocidad) {
        super(nombre, ranking, superficieFavorita);
        this.velocidad = velocidad;
    }
    
    
    @Override
    public String getDatos(){
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        sb.append("Velocidad: ");
        sb.append(velocidad);
        
        return super.getDatos() + sb.toString();
    }

    @Override
    public void sacar() {
        System.out.println("Saca");
    }


    
}
