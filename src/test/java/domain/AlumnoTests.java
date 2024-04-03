package domain;

import org.junit.Assert;
import org.junit.Test;

public class AlumnoTests {

    @Test
    public void alumnoCumpleConCorrelativas(){
        Alumno alumno = new Alumno("Juan Perez", "2044223");
        Materia paradigmas = new Materia("Paradigmas");
        Materia analisis = new Materia("Analisis de Sistemas");
        Materia diseno = new Materia("Diseno de Sistemas");

        diseno.agregarCorrelativas(paradigmas, analisis);
        alumno.agregarMateriasAprobadas(paradigmas, analisis);

        Assert.assertTrue(alumno.puedeCursar(diseno));
    }

    @Test
    public void alumnoNoCumpleConCorrelativas(){
        Alumno alumno = new Alumno("Juan Perez", "2044223");
        Materia paradigmas = new Materia("Paradigmas");
        Materia analisis = new Materia("Analisis de Sistemas");
        Materia diseno = new Materia("Diseno de Sistemas");

        diseno.agregarCorrelativas(paradigmas, analisis);
        alumno.agregarMateriasAprobadas(paradigmas);

        Assert.assertFalse(alumno.puedeCursar(diseno));
    }

    @Test
    public void alumnoPuedeCursarMateriaSinCorrelativas(){
        Alumno alumno = new Alumno("Juan Perez", "2044223");
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        
        Assert.assertTrue(alumno.puedeCursar(algoritmos));
    }
}
