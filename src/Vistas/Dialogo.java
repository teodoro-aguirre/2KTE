/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author KLVC-WFE9L
 */
public class Dialogo {
    public static void main(String[] args) {
    MyIcon icon = new MyIcon();
    JOptionPane.showMessageDialog(null, "Estas seguro de finalizar tu proceso de preinscripcion", "AVISO", JOptionPane.DEFAULT_OPTION, icon);
    }  
}
