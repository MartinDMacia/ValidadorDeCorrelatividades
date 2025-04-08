package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribir = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public void agregarMateriasAInscribir(Materia ... materiasAInscribir){
        Collections.addAll(this.materiasAInscribir, materiasAInscribir);
    }

    public boolean aprobada(){
        return this.materiasAInscribir
                .stream()
                .allMatch(materia -> this.alumno.puedeCursar(materia));
    }
}
