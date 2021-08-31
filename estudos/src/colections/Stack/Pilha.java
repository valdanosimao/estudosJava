package colections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;


public class Pilha {
	
	public static void main(String[] args) {
	
		// O ULTIMO QUE ENTROU NA PILHA VAI SER O PRIMEIRO A SAIR
	Deque<String> livros = new ArrayDeque<>();
	
	livros.add("Curso de Java");
	livros.add("POO");
	livros.push("HTML5");
	
	System.out.println(livros.peek());
	System.out.println(livros.element());
	
	System.out.println(livros.pop());//REMOVE
	System.out.println(livros.poll());
	
	
	}

}
