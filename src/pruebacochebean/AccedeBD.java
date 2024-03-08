/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacochebean;

import componente.Coche;
import componente.CocheBean;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josegomez
 */

/*
public class AccedeBD implements CocheBean.BDModificadaListener {

     CocheBean coches;

    AccedeBD() {
        coches = new CocheBean();
        coches.addBDModificadaListener(this);
    }

    public void listado() {
        int size = coches.getCocheDAO().getCoches().size();
        for (int i = 0; i < size; i++) {
            Coche coche = coches.getCocheDAO().getCoches().get(i);
            System.out.println("Coche " + i + "\n\tMatricula:" + coche.getMatricula());
            System.out.println("\tMarca: " + coche.getMarca());
            System.out.println("\tModelo: " + coche.getModelo());
            System.out.println("\tKilometros: " + coche.getKilometros());
            System.out.println("\tAño de Matriculación: " + coche.getAnoMatriculacion());
        }
    }

    void add() {
        Coche coche = new Coche("1234ABC", "Toyota", "Corolla", 50000, 2015);
        try {
            coches.addCoche(coche);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccedeBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void capturarBDModificada(CocheBean.BDModificadaEvent ev) {
        System.out.println("Se ha añadido un elemento a la base de datos");
    } 
}
 */
/**
 * Añadir Eliminar Mostrar Buscar por Matrícula
 */
