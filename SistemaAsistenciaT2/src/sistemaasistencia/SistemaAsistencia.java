/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaasistencia;

public class SistemaAsistencia {
    public static void main(String[] args) {
        // TODO code application logic here
        Clase m = new Clase("Trigonometria");
        Clase t = new Clase("Geometria");
        Clase n = new Clase("Algebra");
        Alumno[] alumnos = new Alumno[10];
        alumnos[0]=new Alumno("A1",1);
        alumnos[1]=new Alumno("A2",2);
        alumnos[2]=new Alumno("A3",3);
        alumnos[3]=new Alumno("A4",4);
        alumnos[4]=new Alumno("A5",5);
        alumnos[5]=new Alumno("A6",6);
        alumnos[6]=new Alumno("A7",7);
        alumnos[7]=new Alumno("A8",8);
        alumnos[8]=new Alumno("A9",9);
        alumnos[9]=new Alumno("A10",10);
        for(int i  = 0 ; i<10;i++){
            m.ingresarAlumno(alumnos[i]);
        }
        for(int i  = 0 ; i<10;i++){
            t.ingresarAlumno(alumnos[i]);
        }
        for(int i  = 0 ; i<10;i++){
            n.ingresarAlumno(alumnos[i]);
        }
        principal interfaz = new principal();
        interfaz.M = m;
        interfaz.T = t;
        interfaz.N = n;
        interfaz.setVisible(true);
    }
    
    
}
