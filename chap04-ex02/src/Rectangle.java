import java.util.Scanner; //ctrl + shift + o

public class Rectangle {
	int width;
	int height;
	private String getArea;
	
	public Rectangle(){
	
	}
	
	public int grtArea(){
		return width * height;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Rectangle rect = new Rectangle();
      Scanner scan = new Scanner(System.in);
      System.out.print("�Է�");
      
      rect.width = scan.nextInt();
      rect.height = scan.nextInt();
      
      System.out.println("�簢���� ����" + rect.grtArea());
      
     scan.close();
	} 

}
