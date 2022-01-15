package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	Book(int bookNo, String title, String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
	public void rent() {
		stateCode = 0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	
	public void print() {
		String str = "";
		switch (stateCode) {
		case 1:
			str = "재고있음";
			break;
		case 0:
			str = "대여중";
			break;
		}
		
		System.out.printf("책 제목:%s, 작가:%s, 대여 유무:%s\n", title, author, str);
	}
}
