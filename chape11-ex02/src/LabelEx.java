import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	public LabelEx(){
    	  setTitle("���̺� ����");
    	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  Container c =getContentPane();
    	  c.setLayout(new FlowLayout());
    	  
    	  JLabel textLabel = new JLabel("����մϴ�");
    	  
    	  ImageIcon beauty = new ImageIcon("images/beauty.jpg");
    	  JLabel imageLabel = new JLabel(beauty);
    	  
    	  ImageIcon normalIcon = new ImageIcon("images/normalTcon.gif");
    	  JLabel lable = new JLabel("���������� ��ȭ�ϼ���",
    	  normalIcon, SwingConstants.CENTER);
    	  
    	  c.add(textLabel);
  		c.add(imageLabel);
  		c.add(lable);

    	  setSize(400,600);
    	  setVisible(true);
    	  
    	  
      }
      public static void main(String[]args){
    	  new LabelEx();
    	  
      }
}