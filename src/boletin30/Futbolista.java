
package boletin30;

/**
 *
 * @author sbenavidesvazquez
 */
public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void entrevista(){
        System.out.println("Entrevistando xogador");
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
        System.out.println("Jugar con la seleccion");
    }
    
    
    
}
