/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuparcial;

/**
 *
 * @author jorge
 */
public class RecuParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Torneo torneo = new Torneo();
        Singlista s = new Singlista("David Nalbandian",1,Superficie.CEMENTO,3);
        Singlista s2 = new Singlista("Jorge",1,Superficie.CEMENTO,3);
        Juvenil j1 = new Juvenil("Jorge",1,Superficie.CEMENTO,false);
        Doblista d1 = new Doblista("Valeria",1,Superficie.CEMENTO,10);
        

        

        //torneo.agregarJugador(null);
        
        //1. Agregar jugadores al sistema:
        torneo.agregarJugador(s);
        torneo.agregarJugador(s2);
        //torneo.agregarJugador(j1); //Lanza excepcion
        torneo.agregarJugador(d1);
        
        //2. Mostrar jugadores registrados:
        torneo.mostrarJugadores();
        
        
        //3. Saque y práctica en pareja:
        torneo.sacar(j1);//No puede sacar
        torneo.sacar(s); //Si puede
        
        //4. Filtrar por superficie:
        torneo.filtrarPorSuperficie(Superficie.CEMENTO);
        
        //5. Generar resumen por tipo:
        System.out.println(torneo.generarResumenPorTipo());

    }
    
}
