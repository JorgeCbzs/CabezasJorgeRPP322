/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuparcial;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public abstract class Jugador {
    private String nombre;
    private int ranking;
    private Superficie superficieFavorita;

    public Jugador(String nombre, int ranking, Superficie superficieFavorita) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.superficieFavorita = superficieFavorita;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public Superficie getSuperficieFavorita() {
        return superficieFavorita;
    }
    
    
    
    
    
    @Override
    public boolean equals(Object o){
        if (o == null || !(o instanceof Jugador j)){
            return false;
        }

        return this.nombre.equals(j.nombre) && this.ranking == (j.ranking);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre,ranking);
    }
    
    
    public String getDatos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append("|");
        sb.append("Ranking: ");
        sb.append(ranking);
        sb.append("|");
        
        return sb.toString();
    }
    
}
