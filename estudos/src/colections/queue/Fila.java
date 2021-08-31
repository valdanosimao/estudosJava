package colections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		
		//Diferen�a � o comportamento que ocorre
		//quando a fila est� cheia!
		
		fila.add("Ana");// retorna false
		fila.offer("Bia"); //Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o pr�ximo elemento
		//da fila (Sem remover)
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia!
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lan�a uma exce��o
		System.out.println(fila.element());
		
		//fila.size(); tamanho
		//fila.clear(); limpar a fila
		//fila.isEmpty(); saber se a fila est� vazia
		//fila.contains(); verifica se o objeto est� ou n�o contido
		
		
		//poll e remove -> obtem o pr�ximo elemento
		//da fila e remove!
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia!
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}
