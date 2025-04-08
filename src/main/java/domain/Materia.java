package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean cumpleCorrelativas(List<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(this.correlativas);
    }

    public void agregarCorrelativas(Materia ... correlativas){
        Collections.addAll(this.correlativas, correlativas);
    }
}
