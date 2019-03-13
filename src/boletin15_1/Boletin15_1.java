/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin15_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productos sudadera = new Productos("C1", 24);
        Productos patinete = new Productos("H23", 234);
        Productos movil = new Productos("M30", 109);

        JOptionPane.showMessageDialog(null, Productos.Factura(sudadera, patinete, movil));
        try {
            patinete.setProductos();
        } catch (CodigoException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage());
} catch (NumberFormatException e2) {
    JOptionPane.showMessageDialog(null, "Número incorrecto");
}
        JOptionPane.showMessageDialog(null, Productos.Factura(sudadera, patinete, movil));

    }

}
