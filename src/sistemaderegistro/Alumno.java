/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaderegistro;

/**
 *
 * @author Marito
 */
public class Alumno {
 
   
    private
    String nombreAlumno;
    String ApellidoAlumno;
    int notaAlumno;
    double trabajoAlumno[];
    double promedioAlumno;
    int faltasAlumno;
    int asistenciaAlumno;
    int faltasPorMaestro;
    int numeroAlumno;
    int codigoAlumno;

    Alumno(int codigo, String nombre, String apellido, int telefono )
    {
        this.codigoAlumno = codigo;
        this.nombreAlumno = nombre;
        this.ApellidoAlumno = apellido;
        this.numeroAlumno = telefono;
    }
 
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return ApellidoAlumno;
    }

    public void setApellidoAlumno(String ApellidoAlumno) {
        this.ApellidoAlumno = ApellidoAlumno;
    }

    public int getNotaAlumno() {
        return notaAlumno;
    }

    public void setNotaAlumno(int notaAlumno) {
        this.notaAlumno = notaAlumno;
    }

    public int getNumeroAlumno() {
        return numeroAlumno;
    }

    public void setNumeroAlumno(int numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }   
}
