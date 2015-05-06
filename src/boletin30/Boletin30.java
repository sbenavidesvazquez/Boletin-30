
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author sbenavidesvazquez
 */
public class Boletin30 {

    
    public static void main(String[] args) {
        ArrayList <SeleccionFutbol> seleccion=new ArrayList();
        SeleccionFutbol fut=new Futbolista();
        SeleccionFutbol ent=new Entrenador();
        SeleccionFutbol mas=new Masajista();
        SeleccionFutbol sel=new Seleccionador();
        
        System.out.println("Seleccionador");
        sel.setNombre("Fran");
        sel.setApellidos("Cisco");
        sel.setEdad(21);
        sel.setId(25634);
        ((Seleccionador)sel).seleccionarXogador();
        ((Seleccionador)sel).concentrarse();
        ((Seleccionador)sel).entrenar();
        ((Seleccionador)sel).viajar();
        seleccion.add(sel);
        
        System.out.println("masajista");
        mas.setNombre("Pa");
        mas.setApellidos("Tricia");
        mas.setEdad(21);
        mas.setId(4851);
        ((Masajista)mas).setAñosExperiencia(3);
        ((Masajista)mas).setTitulacion("Masoterapeuta");
        ((Masajista)mas).concentrarse();
        ((Masajista)mas).darMasaje();
        ((Masajista)mas).viajar();
        seleccion.add(mas);
        
        System.out.println("Entrenador");
        System.out.println("");
        ent.setNombre("Os");
        ent.setApellidos("Kar");
        ent.setEdad(21);
        ent.setId(5465);
        ((Entrenador)ent).setIdFederacion(3621);        
        ((Entrenador)ent).concentrarse();
        ((Entrenador)ent).planificarEntrenamiento();
        ((Entrenador)ent).entrenar();
        ((Entrenador)ent).viajar();
        seleccion.add(ent);
        
        System.out.println("Jugador");
        fut.setNombre("Pa");
        fut.setApellidos("Zo");
        fut.setEdad(25);
        fut.setId(9435);
        ((Futbolista)fut).setDemarcacion("calientavanquillo");
        ((Futbolista)fut).setDorsal(00);
        ((Futbolista)fut).concentrarse();
        ((Futbolista)fut).entrevista();
        ((Futbolista)fut).entrenar();
        ((Futbolista)fut).jugarPartido();
        ((Futbolista)fut).viajar();
        seleccion.add(fut);
        
        for (SeleccionFutbol equipo: seleccion) {
            System.out.println(equipo.toString());
        }
    }
    
}
