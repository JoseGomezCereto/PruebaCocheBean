/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacochebean;

import componente.Coche;
import componente.CocheDAO;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author josegomez
 */
//Clase modelo de datos para utilizarlo indistintamente en todas las demás clases
import java.util.logging.Level;
import java.util.logging.Logger;

public class CocheSingleton {

    private static CocheSingleton instance = null;
    private ArrayList<Coche> coches;

    private CocheSingleton() {
        updateCoches();
    }

    public static CocheSingleton getInstance() {
        if (instance == null) {
            instance = new CocheSingleton();
        }
        return instance;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void addCoche(Coche coche) {
        try {
            CocheDAO cocheDao = new CocheDAO();
            cocheDao.addCoche(coche);
            updateCoches();
        } catch (Exception e) {
            Logger.getLogger(CocheSingleton.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void delCoche(String matricula) {
        try {
            CocheDAO cocheDao = new CocheDAO();
            cocheDao.delCoche(matricula);
            coches.removeIf(coche -> coche.getMatricula().equals(matricula));
            updateCoches();
        } catch (Exception e) {
            Logger.getLogger(CocheSingleton.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void updateCoches() {
        try {
            CocheDAO cocheDao = new CocheDAO();
            coches = new ArrayList<>(cocheDao.getCoches());
        } catch (Exception e) {
            Logger.getLogger(CocheSingleton.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
