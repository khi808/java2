package p03.layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * FlowLayout - 가로로 배치되어 있다가 폭이 좁아지면
 * 			     컴포넌트들이 아래로 내려오는 레이아웃 구조
 * */
public class WindowLayoutExample2 {
	public static void main(String[] args) {
		//윈도우 프레임 생성
		JFrame frame = new JFrame("과일 바구니");
		//컨테이너 구하기
		Container contentPane = frame.getContentPane();
		//레이아웃 생성
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);
		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("파인애플"));
		contentPane.add(new JButton("레몬"));
		contentPane.add(new JButton("키위"));
		contentPane.add(new JButton("바나나"));
		contentPane.add(new JButton("오렌지"));
		//x버튼 이벤트 추가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 400);
		frame.pack();
		frame.setVisible(true);
	}
}
