/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuparcial;

/**
 *
 * @author jorge
 */
public class JugadorRepetidoException extends RuntimeException {
    private static final String MESSAGE = "Jugador Repetido ";

    public JugadorRepetidoException() {
        this(MESSAGE);
    }

    public JugadorRepetidoException(String message){
        super(message);
    }
    
    
    
}
