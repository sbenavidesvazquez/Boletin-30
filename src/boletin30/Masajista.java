
package boletin30;

/**
 *
 * @author sbenavidesvazquez
 */
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad){
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(){
        System.out.println("Dar masaje");
    }

    @Override
    public String toString() {
        return "titulacion=" + titulacion + ", Experiencia=" + añosExperiencia;
    }
    
    
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse coa selección");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando con la seleccion");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugar");
    }
    
    
}
