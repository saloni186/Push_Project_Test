class GenDemo<T>{

T ob;

GenDemo(T ob){
this.ob=ob;
}

public void show(){
System.out.println("Type of ob is = "+ob.getClass().getName());
}

public T getOb(){
return ob;
}

}

public class GenDemoTest{

public static void main(String[] args){

	GenDemo<String> g1=new GenDemo<String>("soniya");
	g1.show();
	//System.out.println(g1.getOb());
}
}
