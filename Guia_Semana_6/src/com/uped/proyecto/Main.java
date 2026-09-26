package com.uped.proyecto;

import com.uped.proyecto.modelo.Cliente;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Estudiante;
import com.uped.proyecto.modelo.Voluntario;
import com.uped.proyecto.modelo.Proveedor;
import com.uped.proyecto.modelo.Persona;

public class Main {
    public static void main(String[] args) {

        // Prueba 1: upcasting con clases abstractas
        Persona[] personas = {
                new Cliente("Ana", "0451...", "7777-1", 4000.0),
                new Empleado("Luis", "0622...", 850.0),
                new Estudiante("Kevin", "0399...", "UPED-045",
                        "Ing. Sistemas", 9.1),
        };
        for (Persona p : personas) {
            System.out.println(p.presentarse() + " -> $"
                    + p.calcularBeneficioAnual());
        }

        // Prueba 2: ejemplo integrador (Voluntario)
        Voluntario v = new Voluntario(
                "Sara Gómez", "07456123-2", 120.0);
        System.out.println(v);
        System.out.println("Beneficio: "
                + v.calcularBeneficioAnual());

        // Prueba 3: ejercicio práctico (Proveedor)
        Proveedor prov = new Proveedor("Comercial Ríos",
                "06554321-8", 8000.0);
        System.out.println(prov);
        System.out.println("Beneficio: "
                + prov.calcularBeneficioAnual());
    }
}