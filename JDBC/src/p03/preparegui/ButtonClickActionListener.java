package p03.preparegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonClickActionListener extends AddActionListener implements ActionListener{
	
	
	public ButtonClickActionListener(JTextField text1, JTextField text2, JTextField text3, {
		super(text1, text2, text3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(,"추가하시겠습니까?");
				if(choice!=0) return;
				
	}

}
