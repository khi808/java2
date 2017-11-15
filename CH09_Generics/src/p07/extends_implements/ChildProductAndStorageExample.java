package p07.extends_implements;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv,String,String> product
			= new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("Smart Tv");
		product.setCompany("samsong");
		//인터페이스타입<Tv> = new 구현체 객체 생성
		Storage<Tv> storage = new StorageImple<>(100);
		storage.add(new Tv(), 0);//저장
		Tv tv = storage.get(0);//출력
		
	}
}
