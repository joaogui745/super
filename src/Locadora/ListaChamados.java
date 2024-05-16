package Locadora;

import java.util.ArrayList;

public class ListaChamados {
    private static ArrayList<Chamado> lista = new ArrayList();
    
    public static void add(Chamado chamado){
        lista.add(chamado);
    }
    public static int size(){
        return lista.size();
    }
    public static Chamado get(int i){
        return lista.get(i);
    }
    public static void remove(int index){
        lista.remove(index);
    }
}
