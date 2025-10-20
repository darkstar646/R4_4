//R4_4
/*R4_1のサンプル
public class RectLoop extends MyFrame2 {
	public void run() {
		setColor(0,128,0);
		
		int y = 50;
		for (int i=0 ; i<10 ; i++) {
			
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				fillRect(x,y,10,10);
				x+=20;
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}
*/

public class RectLoop extends MyFrame2 {
	public void run() {
		setColor(0,128,0);
		
		int y = 50;
		for (int i=0 ; i<10 ; i++) {
			
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				if((i+j)%6==0) {
					fillRect(x,y,10,10);
					x+=20;
				}
						
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}
