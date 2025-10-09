//clase padre libro
//Atributos titulo, autor, precio, cantidad de ejemplares
//Metodo mostrar libro
// tiene una clase hija que es libro digital con atributo tamaño y disponibilidad, metodo mostrar libro, metodo prestar, metodo devolver
// clase hija, libro impreso, attributo precio, y numero de ejemplares, metodo mostrar libro, metodo prestar y devolver
//consideraciones a tener en cuenta, no se puede prestar un libro no disponible
// Nose puede devolver mas de 2 libros
//validar que no se puede pedir prestaodos cantidades no existentes
// no se puede entregar -4 libros
//sistema para representar libros
// subir diagrama, repositorios, cma
// Main va a ver un menu de interacion  con lo siguiente:
//1. Crear un libro impreso
//2. Crear un libro digital
//3. mostrar los libros
//4. Buscar libro por titulo -- submenu "100 años de soledad" luego pedir o prestar
//5.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int menu_opcion = 0;
        String buscador;
        boolean salir_menu = false;
         String titulo;
         String autor;
         int precio;
         int cantidad_ejemplares;
         int tamaño;
         boolean disponibilidad;
        System.out.println("   Sistema de Libros  ");
        System.out.println("1.Crear un libro impreso");
        System.out.println("2.Crear un libro digital");
        System.out.println("3.Mostar los libros");
        System.out.println("4.Buscar libro por titulo");
        Scanner teclado = new Scanner(System.in);
        List<Padre> lista_libros_digitales = new ArrayList<>();
        List<Padre> lista_libros_impresos = new ArrayList<>();

        while(salir_menu == false){
            menu_opcion = teclado.nextInt();
            switch(menu_opcion){
                case 1:
                    teclado.nextLine();
                    System.out.print("Escriba el titulo del libro Impreso");
                    titulo = teclado.next();
                    System.out.println("Escriba el  autor");
                    autor = teclado.next();
                    System.out.println("Escriba precio");
                    precio = teclado.nextInt();
                    System.out.println("Escriba cantidad de ejemplares ");
                    cantidad_ejemplares = teclado.nextInt();
                    Padre l1 = new LibroImpreso(titulo ,autor,precio ,cantidad_ejemplares);
                    lista_libros_impresos.add(l1);
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.print("Escriba el titulo del libro digital");
                    titulo = teclado.next();
                    System.out.println("Escriba el  autor");
                    autor = teclado.next();
                    System.out.println("Escriba precio");
                    precio = teclado.nextInt();
                    System.out.println("Escriba disponibilidad, true or false");
                    disponibilidad = teclado.nextBoolean();
                    System.out.println("Escriba el tamaño ");
                    tamaño = teclado.nextInt();
                    Padre l2 = new LibroDigital(titulo ,autor,precio ,tamaño, disponibilidad);
                    lista_libros_digitales.add(l2);
                case 3:
                    System.out.println("Libros Digitales");
                    for(Padre l : lista_libros_digitales ) {
                        System.out.println(l.mostrarLibro());
                    }
                    System.out.println("Libros Impresos");
                    for(Padre l : lista_libros_impresos ) {
                        System.out.println(l.mostrarLibro());
                    }
                    break;

                case 4:
                    System.out.print("Escriba el titulo con espacios de manera exacta");
                    buscador = teclado.next();
                    for(Padre l : lista_libros_digitales ) {
                        if(buscador.equalsIgnoreCase(l.getTitulo())){
                            System.out.println(l);
                            int opcion_submenu;
                            System.out.println("1.Pedir prestado");
                            System.out.println("2.Devolver");
                            opcion_submenu = teclado.nextInt();
                            if(opcion_submenu == 1){
                                l.prestarLibro();
                            }else{
                                l.devolverLibro();
                            }

                        }

                    }
                    for(Padre l : lista_libros_impresos ) {
                        if(buscador.equalsIgnoreCase(l.getTitulo())){
                            System.out.println(l);
                            int opcion_submenu;
                            System.out.println("1.Pedir prestado");
                            System.out.println("2.Devolver");
                            opcion_submenu = teclado.nextInt();
                            if(opcion_submenu == 1){
                                l.prestarLibro();
                            }else{
                                l.devolverLibro();
                            }

                        }

                    }











                default:
                    break;
            }


        }









    }
}//clase padre libro
//Atributos titulo, autor, precio, cantidad de ejemplares
//Metodo mostrar libro
// tiene una clase hija que es libro digital con atributo tamaño y disponibil
// tiene una clase hija que es libro digital con atributo tamaño y disponibil
//sistema para representar libros
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
