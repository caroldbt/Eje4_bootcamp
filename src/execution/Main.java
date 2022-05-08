package execution;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.setNombre("Lucas");
        cliente.setEdad(32);
        cliente.setTelefono(625654877);
        cliente.setCredito(3500.58);
        System.out.println("Datos del Cliente:\nNombre\tEdad\tTelefono\tCredito\n "+cliente.getNombre()
                +"\t"+cliente.getEdad()+"\t\t"+cliente.getTelefono()
                +"\t"+cliente.getCredito());
        System.out.println();
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Sara");
        trabajador.setEdad(27);
        trabajador.setTelefono(625455789);
        trabajador.setSalario(1590.89);
        System.out.println("Datos del Trabajador:\nNombre\tEdad\tTelefono\tSalario\n "
                +trabajador.getNombre()
                +"\t"+trabajador.getEdad()+"\t\t"+trabajador.getTelefono()
                +"\t"+trabajador.getSalario());

    }
}
abstract class Persona{
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}