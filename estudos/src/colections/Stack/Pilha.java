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
	
	System.out.println(livros.pop());
	System.out.println(livros.poll()); //REMOVE DA PILHA
	
	//livros.size();tamanho
	//livros.clear(); limpar
	//livros.contains(); tem?
	//livros.isEmpty(); est? vazia?
	
	
	}

}
