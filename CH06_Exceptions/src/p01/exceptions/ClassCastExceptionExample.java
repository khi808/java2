package p01.exceptions;
/**
 * try catch 문은 발생한 예외를 처리하는것, if문은 예외를 막는것
 * */
public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		change(dog); // dog -> Animal -> dog
		
		Cat cat = new Cat();
		change(cat); // cat -> Animal -> dog
		
	}
	// 매개변수의 다형성
	// Dog -> Animal로 Promotion -> (Dog)animal(Casting)
	private static void change(Animal animal) {
		if(animal instanceof Dog) { // 매개변수로 들어온 객체가 원래 dog 였나, casting이 가능한지 여부 확인
			Dog dog = (Dog)animal;	
		}
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}