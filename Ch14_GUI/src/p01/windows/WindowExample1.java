package p01.windows;

import java.awt.Container; //awt

import javax.swing.JFrame; //swing
import javax.swing.JLabel; //swing

/**
 * GUI 프로그램
 * 
 * Frame위에 Container를 얹고 필요한 컴포넌트들을 담아서 만듬.
 * 
 * */
public class WindowExample1 {
	public static void main(String[] args) {
		/** 1단.계 윈도우 프로그램 만들기 **/
		//윈도우 플레임 생성
		JFrame frame = new JFrame();
		//컴포넌트들을 담을 컨테이너 생성
		Container contentPane = frame.getContentPane();
		//문자를 출력할 라벨컴포넌트 생성
		JLabel label = new JLabel("Hello, Java");
		//생성한 라벨컴포넌트를 컨테이너에 담기
		contentPane.add(label);
		/** 2단계. 화면에 디스플레이 **/
		//화면에 나타나는 모양 보정
		frame.pack();
		//화면에 나타내기 setVisible()메소드
		frame.setVisible(true);
		
		
	
		
		
	}
	
	
}
