package p01.windows;

import java.awt.Container; //awt
import java.awt.Dimension;

import javax.swing.JFrame; //swing
import javax.swing.JLabel; //swing
import javax.swing.SwingConstants;

/**
 * GUI 프로그램
 * 
 * Frame위에 Container를 얹고 필요한 컴포넌트들을 담아서 만듬.
 * 
 * */
public class WindowExample2 {
	public static void main(String[] args) {
		/** 1단.계 윈도우 프로그램 만들기 **/
		//윈도우 플레임 생성
		JFrame frame = new JFrame("내가만든 첫번째 윈도우 프로그램");
		//프레임크기 조정
		frame.setPreferredSize(new Dimension(400, 300));
		//프레임 위치 조정
		//프레임의 시작위치(사각형의 왼쪽우측의 위치 조정)
		frame.setLocation(300, 200);
		//컴포넌트들을 담을 컨테이너 생성
		Container contentPane = frame.getContentPane();
		//문자를 출력할 라벨컴포넌트 생성
		JLabel label = new JLabel("반갑습니다. GUI",SwingConstants.NORTH);
		//생성한 라벨컴포넌트를 컨테이너에 담기
		contentPane.add(label);
		//윈도우 우측상단의 X버튼 클릭시 프로그램 종료하도록 이벤트 추가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		/** 2단계. 화면에 디스플레이 **/
		//화면에 나타나는 모양 보정
		frame.pack();
		//화면에 나타내기 setVisible(true)메소드
		frame.setVisible(true);
		
		
	
		
		
	}
	
	
}
