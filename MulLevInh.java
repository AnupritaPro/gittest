class Grandfather{

	String name;
	void gdisplay(String name){
	System.out.println("Grandfather name is:"+name);
	}
}

class Father extends Grandfather{
	int age;
	void fdisplay(String name,int age){
		System.out.println("father name is :" + name + "\n father age is:" + age);
	}
}

class MulLevInh extends  Father{
	void Mdisplay(String name,int age){
		System.out.println("child name is :" + name + "\n age of child is:" +age);
	}
public static void main(String args[]){

	MulLevInh m =new MulLevInh();
	m.gdisplay("Ashok");
	m.fdisplay("jaganathe",40);
	m.Mdisplay("Rahul",20);
}
}
