package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTests {

    @Test
    public void alumnoCumpleConTodasLasCorrelativas(){
        Alumno alumno = new Alumno("Marcos Ruiz", "245603");

        Materia algebra = new Materia("Algebra");
        Materia am1 = new Materia("Analisis Matematico I");
        Materia am2 = new Materia("Analisis Matematico II");
        Materia algoritmos = new Materia("Algoritmos");
        Materia sintaxis = new Materia("Sintaxis y Semantica de los L");
        Materia fisica1 = new Materia("Fisica 1");

        alumno.agregarMateriasAprobadas(algebra, am1, algoritmos);

        am2.agregarCorrelativas(algebra, am1);
        sintaxis.agregarCorrelativas(algoritmos);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriasAInscribir(am2, sintaxis, fisica1);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void alumnoNoCumpleConCorrelativas(){
        Alumno alumno = new Alumno("Marcos Ruiz", "245603");

        Materia algebra = new Materia("Algebra");
        Materia am1 = new Materia("Analisis Matematico I");
        Materia am2 = new Materia("Analisis Matematico II");
        Materia algoritmos = new Materia("Algoritmos");
        Materia sintaxis = new Materia("Sintaxis y Semantica de los L");
        Materia fisica1 = new Materia("Fisica 1");

        alumno.agregarMateriasAprobadas(algebra, am1);

        am2.agregarCorrelativas(algebra, am1);
        sintaxis.agregarCorrelativas(algoritmos);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriasAInscribir(am2, sintaxis, fisica1);

        Assert.assertFalse(inscripcion.aprobada());
    }
}
