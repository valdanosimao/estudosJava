package swing;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JDialog;

public class TelaTime extends JDialog{
	
	public TelaTime() { //é executado no momento que é isntanciado o objeto TelaTime
		
		setTitle("Minha Tela");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//primeira parte concluida
		
		
		GridBagConstraints gridBagConstraints =  new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		
		
		
		
		
		setVisible(true);//torna a tela visível para o usuário,Sempre vai ser o último comando
	}
}
