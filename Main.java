package PackPrincipal;

public class Main {
    public static void main(String[] args){
        Persona objeto = new Persona();

        objeto.setEdad(10);
        System.out.println("La edad es " + objeto.getEdad());

        objeto.setNombre("Luisa");
        System.out.println("El nombre es " + objeto.getNombre());

        objeto.setTelefono(225566);
        System.out.println("El telefono es " + objeto.getTelefono());
    }
}
