package proyect001;

public class Libretas {
    private String nombre;
    private String cedula;
    private String carrera;
    private double [] notas;
    
    public Libretas(String nombre, String cedula, String carrera, double[] notas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrera = carrera;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Libretas{" + "nombre=" + nombre + ", cedula=" + cedula + ", carrera=" + carrera + ", notas=" + notas + '}';
    }

    public void mostrarInfo(){
        System.out.println("Nombre = " + nombre );
        System.out.println("Cedula = " + cedula );
        System.out.println("Carrera = " + carrera );
        
        System.out.println("Las notas:" );
        for(int i=0;i<notas.length;i++){
            System.out.println(notas[i]);
        }
    }  
    
    public double calcularPromedio(){
        double promed=0;
        int lim=notas.length;
        for(int i=0;i<notas.length;i++){
            promed+=notas[i];
        }
        System.out.println("El promedio es: "+promed/lim);
        return promed/lim;
    }
    public void notaCualitativa(double promed){
        if(promed<10 && promed>7 ){
            System.out.println("Bueno");
        }else if(promed >7 && promed>0 ){
            System.out.println("Malo");
        }else{
            System.out.println("NO se sabe");
        }
    }
}
