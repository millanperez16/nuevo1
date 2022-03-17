package pract4;

// Añadir comentario

public class PersonaCambiado {

    private String nombre;
    private String apellidos;
    private String dni;
    private int años;

    public void votar(){
        if (años >= 18){
            datosPersonales();
        }
    }

    public void entrarEnDiscoteca(){
    	final boolean edadOK = años >=18;
        if (edadOK){
            entrada();
        }
    }
    
    public void entrada() {
    	System.out.println(nombre + " " + apellidos + " ha entrado en la Discoteca");
    }
    
    public void datosPersonales() {
    	System.out.println(nombre + " " + apellidos + " con DNI: " + dni + " ha votado");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("edad: " + años);
    }

}
