package di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component : 객체 생성
//@Component : 명칭생략시 samsungTV 명칭 사용(첫글자 소문자)
@Component("tv") // tv 라는 명칭으로 객체 생성
class SamsungTV implements TV {
	@Autowired //동일한 데이터 타입을 찾아서 주입
	private Speacker speacker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() {
		System.out.println(">> SamsungTV 객체 생성");
	}
	public SamsungTV(Speacker speacker) {
		System.out.println(">> SamsungTV 객체 생성");
		this.speacker = speacker;
	}
	public SamsungTV(Speacker speacker, int price) {
		System.out.println(">> SamsungTV 객체 생성");
		this.speacker = speacker;
		this.price = price;
	}
	public SamsungTV(Speacker speacker, int width, int height) {
		System.out.println(">> SamsungTV 객체 생성");
		this.speacker = speacker;
		this.width = width;
		this.height = height;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV - 전원OFF");
	}
	public void volumeUp() {
		System.out.println("SamsungTV - 소리크게");
		speacker.volumnUp();
	}
	public void volumeDown() {
		System.out.println("SamsungTV - 소리작게");
		speacker.volumnDown();
	}
	@Override
	public String toString() {
		return "SamsungTV [speacker=" + speacker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
	
	//========= getter, setter 생성 ==========
	public Speacker getSpeacker() {
		return speacker;
	}
	public void setSpeacker(Speacker speacker) {
		this.speacker = speacker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}









