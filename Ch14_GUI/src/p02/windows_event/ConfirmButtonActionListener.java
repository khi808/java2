package p02.windows_event;
/**
 * Listener - 컴포넌트에 이벤트가 발생하는지 여부를 모니터링하는 객체
 * 			- 이벤트 발생시 미리정해진 명령문을 실행함.
 * */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
/* Consumer타입의 FunctionalInterface */
public class ConfirmButtonActionListener implements ActionListener {
	//처리대상 컴포넌트로 사용할 필드 선언
	JTextField text;
	JLabel label;
	//생성자
	public ConfirmButtonActionListener(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText(); //TextField의 값을 읽어옴. getText();
		label.setText("Hello, "+name);//setText() -> 라벨값을 설정
	}

}
