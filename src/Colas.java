
import javax.swing.JOptionPane;

public class Colas {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, elemento = 0;
        Cola colita = new Cola();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Insertar un elemento en la Cola"
                        + "\n2.-Quitar un elemento de la cola"
                        + "\n3.-¿La cola está Vacía?"
                        + "\n4.-Elemento ubicado al inicio de la Cola"
                        + "\n5.-Tamaño de la Cola"
                        + "\n6.-Salir", "Menú de Opciones de una Cola", JOptionPane.INFORMATION_MESSAGE));
                
                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar en la cola"));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if(!colita.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento atendio es: " + colita.quitar());
                        }else{
                            JOptionPane.showMessageDialog(null, "Cola Vacia");
                        }
                        break;
                    case 3:
                        if(colita.estaVacia()){
                            JOptionPane.showMessageDialog(null, "Cola Vacia");
                        }else{
                            JOptionPane.showMessageDialog(null, "Cola NO Vacia");
                        }
                        break;
                    case 4:
                        if(!colita.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento Ubicado al Inicio de cola es: " + colita.inicioCola());
                        }else{
                            JOptionPane.showMessageDialog(null, "Cola Vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es: " + colita.tamanoCola());
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizada");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no Existente");
                        break;        
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 6);

    }

}
