package p03.layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GridLayout - 테이블 표 형식의 레이아웃
 * */
public class WindowLayoutExample1 {
	public static void main(String[] args) {
		//윈도우 객체 생성
		JFrame frame = new JFrame();
		//위치 지정
		frame.setLocation(400,300);
		//컨테이너 구하기
		Container contentPane = frame.getContentPane();
		//레이아웃 컴포넌트 생성
		GridLayout layOut = new GridLayout(3,2);
		//컨테이너의 레이아웃 설정
		contentPane.setLayout(layOut);//GridLayout이 설정
		//컴포넌트 추가
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("사자"));
		contentPane.add(new JButton("타조"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("기린"));
		contentPane.add(new JButton("펭귄"));
		//X버튼 클릭 이벤트 추가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//크기 조절
		frame.pack();
		//화면에 보이기
		frame.setVisible(true);
		
	}
}
