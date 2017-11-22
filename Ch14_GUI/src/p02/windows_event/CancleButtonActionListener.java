package p02.windows_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CancleButtonActionListener implements ActionListener {
	//필드
	JTextField text;
	//생성자
	public CancleButtonActionListener(JTextField text) {
		this.text = text;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		text.setText("");

	}

}
