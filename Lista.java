public class Lista<T> {

    Nodo<T> head;
    
    public Lista<T>(Nodo<T> head) {
        head = null;
    }

    public boolean vuota() {
        if (head.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void aggiungiInTesta(T dato) {
        Nodo<T> nuovoNodo = new Nodo(dato);
        nuovoNodo.next = head;
        head = nuovoNodo;
    }

    public void aggiungiInCoda(T dato) {
        Nodo <T> nuovoNodo = new Nodo(dato);

        if (head == null) {
            nuovoNodo.next = null;
            head = nuovoNodo;
        }
        
    }


}
