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
public class Productos {
    private String codigo;
    private float precio;
    private static int numFactura = 1000;

    public Productos(String codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public Productos() {
    }

    public String getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    public void setProductos() throws CodigoException{
        // creamos variable char para comprobar que el primer carácter del código es una letra y no un número.
        char c;
        precio=Float.parseFloat(JOptionPane.showInputDialog("Escribe el precio"));
    
        
        codigo=JOptionPane.showInputDialog("Escribe el código");
        
        c = codigo.charAt(0);
        if(Character.isDigit(c)) {
            codigo = "ERROR";
            throw new CodigoException("El código debe empezar por una letra y un número");
        }
    }
    public static String Factura(Productos a, Productos b, Productos c){
        numFactura++;
        return "FACTURA: "+numFactura+"\n"
                + "(Código: "+ a.codigo+", precio: "+a.precio+" euros)\n"
                + "(Código: "+ b.codigo+", precio: "+b.precio+" euros)\n"
                + "(Código: "+ c.codigo+", precio: "+c.precio+" euros)\n";
        
    }
    
}
