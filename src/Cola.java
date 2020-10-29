
public class Cola {
    NodoCola inicio, fin;
    int tam;
    
    public Cola(){
        inicio = fin = null;
        tam = 0;
    }
    
    //Método para saber si la cola esta vacia 
    public boolean estaVacia(){
        return inicio == null;
    }
    
    //Método para insertar
    public void insertar(int ele){
        NodoCola nuevo = new NodoCola(ele);
        if(estaVacia()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tam++;
    }
    
    //Método para quitar un elemento de la cola
    public int quitar(){
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tam--;
        return aux;
    }
    
    //Método para saber quien esta al inicio de la cola
    public int inicioCola(){
        return inicio.dato;
    }
    
    //Método para saber el tamaño de la cola
    public int tamanoCola(){
        return tam;
    }
}
