package zooAnimales;
import gestion.Zona;

public class Animal {
    public static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
               "Aves: " + Ave.cantidadAves() + "\n" +
               "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
               "Peces: " + Pez.cantidadPeces() + "\n" +
               "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    public String movimiento() {
        return "desplazarse";
    }

    @Override
    public String toString() {
        if (this.zona != null) {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad +
                   ", habito en " + this.habitat + " y mi genero es " + this.genero +
                   ", la zona en la que me ubico es " + this.zona.getNombre() +
                   ", en el " + this.zona.getZoo().getNombre();
        } else {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad +
                   ", habito en " + this.habitat + " y mi genero es " + this.genero;
        }
    }

    // getters and setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return this.zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
}
