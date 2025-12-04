/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author dilsh
 */
public class pasajeros {
 String nombre;
 String pasaporte;
 String nacionalidad;
 boolean cliente;

    public pasajeros(String nombre, String pasaporte, String nacionalidad, boolean cliente) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
        this.cliente = cliente;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }
    // Método para mostrar información del pasajero
    public String mostrarInfo() {
        String info = "Nombre: " + nombre +
                      "\nPasaporte: " + pasaporte +
                      "\nNacionalidad: " + nacionalidad +
                      "\nCliente Frecuente: ";
        if (cliente) {
            info = "Sí";
        } else {
            info += "No";
        }
        return info;


    }



}
