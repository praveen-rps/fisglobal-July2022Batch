package fisjava;

class Box2D {
	int length;
	int breadth;
	Box2D(int length, int breadth){
		System.out.println("Box2D is constructing");
		this.length=length;
		this.breadth=breadth;
	}
	public void calSurfaceArea() {
		System.out.println("The surface area is : "+(length*breadth));
	}
}


class Box3D extends Box2D{
	int height;
	Box3D(int height){
		super(10,20);
		System.out.println("Box3D is constructing");
		this.height=height;
	}
	public void calVolume() {
		System.out.println("The volume is : "+(length*breadth*height));
	}
	
	public void fianalize() {
		//code before destroying...
	}
	
}

class Box4D extends Box3D{
	int time;
	Box4D(int time){
		super(3);
		System.out.println("Box4D is constructing");
		this.time=time;
	}
	public void calRelVolume() {
		System.out.println("The relative volume is : "+(length*breadth*height*time));
	}
	
}

/*
class Box3D{
	int length;
	int breadth;
	int height;
	Box3D(){
		length=1;
		breadth=2;
		height=3;
	}
	public void calSurfaceArea() {
		System.out.println("The surface area is : "+(length*breadth));
	}
	
	public void calVolume() {
		System.out.println("The volume is : "+(length*breadth*height));
	}
}
*/

public class TestBoxes extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2D box1 = new Box2D(1,2);
	//	box1.calSurfaceArea();
		
		Box3D box2 = new Box3D(4);
	//	box2.calSurfaceArea();
	//	box2.calVolume();
		
		Box4D box3 = new Box4D(2);
		box3.calSurfaceArea();
		box3.calVolume();
		box3.calRelVolume();
		
		
		System.out.println("Box1 = "+box1.hashCode());
		System.out.println("Box2 = "+box2);
		System.out.println("Box3 = "+box3);
		if(box1==box2)
			System.out.println("Equal");
		else
			System.out.println("not equal");
		

	}

}
