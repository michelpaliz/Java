
public class Perro {
    // *que sabe
    String nombre;
    int vida;
    Raza raza;
    Genero genero;
    int edad; // DateFecha nacimiento
    Posicion2D posicion;

    public Perro(String nombre, Raza raza, Genero genero, int edad, Posicion2D posicion) {
        this.nombre = nombre;
        vida = 100;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.posicion = posicion;
    } // metodo constructor no tiene void

}