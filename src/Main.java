import lcde.ListaCircularDoblementeEnlazada;
import lcse.ListaCircularSimplementeEnlazada;

public class Main {
    public static void main(String[] args){

        /*
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();

        //insertar elemntos a nuestra lista

        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);

        //mostramos nuestra lista
        listaSimplementeEnlazada.mostrar();

        //borrar algunos elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        //mostrar nuestra lista
        listaSimplementeEnlazada.mostrar();


        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada ();
        System.out.println(listaDoblementeEnlazada.estaVacia());

        for (int i = 20; i > 0; i--) {
            listaDoblementeEnlazada.insertar(i);
        }
        System.out.println(listaDoblementeEnlazada.estaVacia());
        listaDoblementeEnlazada.mostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();
        listaDoblementeEnlazada.mostrarAtras();
        */
        /*
        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i = 1; i <= 12; i++) {
            listaCircularSimplementeEnlazada.insertarFin(i);
        }

        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        //listaCircularSimplementeEnlazada.eliminarFin();
        //listaCircularSimplementeEnlazada.eliminarFin();

        //listaCircularSimplementeEnlazada.mostrar();

        listaCircularSimplementeEnlazada.mostrarCircular(2);



        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();

        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
        for (int i = 1; i <= 5 ; i++) {
            listaCircularDoblementeEnlazada.insertarFinal(i);
        }
        listaCircularDoblementeEnlazada.mostrar();

        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.mostrar();

        listaCircularDoblementeEnlazada.mostrarAdelante(4);
        listaCircularDoblementeEnlazada.mostrarAtras(4);

        */
        Cola cola = new Cola();
        System.out.println(cola.estaVacia());

        for (int i = 1; i <= 5; i++){
            cola.insertar(i);
                }
        cola.mostrar();

        cola.eliminar();
        cola.eliminar();
        cola.mostrar();

    }
}





