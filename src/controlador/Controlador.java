/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;

/**
 *
 * @author l03m19
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;

 public Controlador(Vista view,Modelo model) {   
    this.view = view;
    this.model = model;
    this.view.btnMultiplicar.addActionListener(this);
         //btnMultiplicar.addActionListener(this)
 }
  
 public void iniciar()
   {
 view.setTitle("MVC Multiplicar");
 view.setLocationRelativeTo(null);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}