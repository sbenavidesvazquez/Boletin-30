
package boletin30;

/**
 *
 * @author sbenavidesvazquez
 */
public class Entrenador extends SeleccionFutbol{
    
    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento(){
        System.out.println("Planificando entrenamiento");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse con la seleccion");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar con la seleccion");
    }

    @Override
    public void viajar() {
        System.out.println("viajar con la seleccion");
    }

    @Override
    public void jugarPartido() {
        System.out.println("viajar con la seleccion");
    }
    
    
}
