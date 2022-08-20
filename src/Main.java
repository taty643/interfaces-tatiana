public class Main {
    public static void main(String[] args) {

        Perro p=new Perro("Mamifero","Perro",5,"Paco","Bulldog");
        System.out.println("Metodos del padre");
        p.nacer();
        p.respirar();
        p.comer();
        System.out.println("Metodos de interfaz");
        p.bañar();
        p.vacunar();

    }
}
