/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Modelo.Modelo;
import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author l03m19
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Modelo mod = new Modelo();
       Vista View = new Vista();
       
       
       Controlador ctrl = new Controlador(View, mod);
       ctrl.iniciar();
       View.setVisible(true);
        
    }
}
