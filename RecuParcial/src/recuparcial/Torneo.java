/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuparcial;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Torneo {
    private ArrayList<Jugador> jugadores;
    
    public Torneo(){
        
        jugadores = new ArrayList<>();
    }
    
    
    
    public void agregarJugador(Jugador jugador){
        
        if (jugadorRepetido(jugador)){
            throw new JugadorRepetidoException();
        }
        validarJugadorNulo(jugador);
        jugadores.add(jugador);
    }
    
    
    private boolean jugadorRepetido(Jugador jugador){
    boolean toReturn = false;
    
    for (Jugador j: jugadores){
        if(j.equals(jugador)){
            toReturn = true;
        }
    }
    return toReturn;
}
    

    
    private void validarJugadorNulo(Jugador jugador){
        
        if (jugador == null ){
            throw new IllegalArgumentException("El jugador no puede ser nulo");
        }
        
    }
    
    
    public void filtrarPorSuperficie(Superficie superficie){
        
        StringBuilder sb = new StringBuilder();
        for (Jugador j : jugadores){
            if(j.getSuperficieFavorita().equals(superficie)){
                sb.append(j.getDatos());
            }
        }
        
        System.out.println(sb);
    }
    
    
    public String generarResumenPorTipo(){
        StringBuilder sb = new StringBuilder();
        int cantidadSinglistas = 0;
        int cantidadDoblistas = 0;
        int cantidadJuveniles = 0;
        
        for (Jugador j : jugadores ){
            if(j instanceof Singlista){
                cantidadSinglistas ++;
            }
            
            if(j instanceof Doblista){
                cantidadDoblistas ++;
            }
            
            if(j instanceof Doblista){
                cantidadJuveniles ++;
            }
        }
        if (cantidadSinglistas == 0){
            sb.append("No hay singlistas");
            sb.append("\n");
        }else{
            sb.append("Cantidad de Singlistas: ");
            sb.append(cantidadSinglistas);
            sb.append("\n");
        }
        if (cantidadDoblistas == 0){
            sb.append("No hay doblistas");
            sb.append("\n");
        }else{
            sb.append("Cantidad de doblistas: ");
            sb.append(cantidadDoblistas);
            sb.append("\n");
        }
        
        if (cantidadJuveniles == 0){
            sb.append("No hay juveniles");
            sb.append("\n");
        }else{
            sb.append("Cantidad de juveniles: ");
            sb.append(cantidadJuveniles);
            sb.append("\n");
        }
        
        
        
        
        
        return sb.toString();
    }
    
    public void sacar(Jugador j){
        if(j instanceof Sacable){
            ((Sacable) j).sacar();
        }
        else{
            System.out.println("El jugador:" + j.getNombre() + "No puede sacar");
        }
    }
    
    public void practicarEnPareja(Jugador j){
        if(j instanceof PracticarPareja){
            ((PracticarPareja) j).practicar();
        }else{
            System.out.println("El jugador no puede practicar");
        }
    }
    
    private void validarJugadoresVacio(){
        if (jugadores.isEmpty()){
            throw new IllegalStateException("La lista de jugadores esta vacia");
        }
    }
    
    public void mostrarJugadores(){
        validarJugadoresVacio();
        for (Jugador j: jugadores){
            System.out.println(j.getDatos());
        }
    }
}
