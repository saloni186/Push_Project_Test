import java.util.ArrayList;
public class QustionMarkTest{

public static void main(String[] args){

//ArrayList<? Super String> al=new ArrayList<Object>();
ArrayList<? extends Number> al2=new ArrayList<Integer>();
ArrayList<?> al3=new ArrayList<Object>();
ArrayList<?> al4=new ArrayList<Number>();
ArrayList<?> al5=new ArrayList<? extends Number>();


}
}