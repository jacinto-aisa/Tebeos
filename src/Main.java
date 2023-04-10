// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Tebeo {
    String editorial;
    String autor;
    int edicion;
    int numeroPaginas;
}
public class Main {
    public static void main(String[] args) {
        Tebeo HellBoy = new Tebeo();
        HellBoy.editorial = "Editorial Norma";
        HellBoy.autor = "Mike Mignola";
        HellBoy.edicion = 2020;
        HellBoy.numeroPaginas = 34;

        Tebeo CuatroFantasticos = new Tebeo();
        CuatroFantasticos.editorial = "Editorial Melón";
        CuatroFantasticos.autor= "Señor Azul";
        CuatroFantasticos.edicion= 2017;
        CuatroFantasticos.numeroPaginas = 15;

        System.out.println("La editorial de hellboy es: "+HellBoy.editorial);
        System.out.println("El autor de hellboy es: "+HellBoy.autor);
        System.out.println("La edición de hellboy es del año: "+HellBoy.edicion);
        System.out.println("El numero de paginas de hellboy es de: "+HellBoy.numeroPaginas);
    }
}