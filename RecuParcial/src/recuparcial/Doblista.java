/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuparcial;

/**
 *
 * @author jorge
 */
public class Doblista extends Jugador implements Sacable, PracticarPareja {
    private static final int MINIMO_INDICE = 1;
    private static final int MAXIMO_INDICE = 10;
    private int indiceCoordinacion;
    
    
    public Doblista(String nombre, int ranking, Superficie superficieFavorita, int indiceCoordinacion) {
        super(nombre, ranking, superficieFavorita);
        this.indiceCoordinacion = setIndice(indiceCoordinacion);
    }

    public int getIndiceCoordinacion() {
        return indiceCoordinacion;
    }
    
    private int setIndice(int i){
        if (i < MINIMO_INDICE || i > MAXIMO_INDICE){
            
            throw new IllegalArgumentException("El indice no es valido.");
        }
        return i;
    }
    
    @Override
    public String getDatos(){
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        sb.append("Indice Coordinacion: ");
        sb.append(indiceCoordinacion);
        
        return super.getDatos() + sb.toString();
    }
    
    @Override
    public void sacar() {
        System.out.println("Saca");
    }

    @Override
    public void practicar() {
        System.out.println("Practica con su pareja.");
    }
    
    
}
