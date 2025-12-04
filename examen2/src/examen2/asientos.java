/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author dilsh
 */
class asientos {
    public class Asiento {
    private String codigo ;
    private String clase;
    private double precio;
    private String estado;
    int[][] asientos;

        public Asiento(String codigo, String clase, double precio, String estado, int[][] asientos) {
            this.codigo = codigo;
            this.clase = clase;
            this.precio = precio;
            this.estado = estado;
            this.asientos = asientos;
        }

        
        
        
        
        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getClase() {
            return clase;
        }

        public void setClase(String clase) {
            this.clase = clase;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public int[][] getAsientos() {
            return asientos;
        }

        public void setAsientos(int[][] asientos) {
            this.asientos = asientos;
        }

    
    
    
     public String mostrarInfo() {
        return codigo + " - " + estado + " - " + clase + " - " + precio;
    }
    }

    }

    
