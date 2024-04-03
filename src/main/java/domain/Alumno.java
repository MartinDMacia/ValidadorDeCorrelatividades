package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public boolean puedeCursar(Materia materia){
        return materia.cumpleCorrelativas(this.materiasAprobadas);
    }

    public void agregarMateriasAprobadas(Materia ... materiasAprobadas){
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }

}
