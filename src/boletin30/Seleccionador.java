
package boletin30;

/**
 *
 * @author sbenavidesvazquez
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarXogador(){
        System.out.println("Seleccionando xogadores");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar");
    }

    @Override
    public void jugarPartido() {
        System.out.println("jugar");
    }
    
}
