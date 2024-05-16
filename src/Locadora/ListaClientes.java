package Locadora;

import java.util.ArrayList;

public class ListaClientes {
    private static ArrayList<Cliente> lista = new ArrayList();
    
    public static void add(Cliente cliente){
        lista.add(cliente);
    }
    public static int size(){
        return lista.size();
    }
    public static Cliente get(int i){
        return lista.get(i);
    }
    public static void remove(int index){
        lista.remove(index);
    }
}
