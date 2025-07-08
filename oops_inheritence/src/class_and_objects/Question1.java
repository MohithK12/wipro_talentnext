package class_and_objects;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int width = s.nextInt();
		int height = s.nextInt();
		int depth = s.nextInt();
		Box b = new Box(width,height,depth);
		System.out.println(b.getVolume());
	}

}
class Box{
	int width,height,depth;
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
		}
	double getVolume(){
		return width*height*depth;
	}
}
