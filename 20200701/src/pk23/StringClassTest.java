package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class strClass = Class.forName("practice1.Student");
		
		System.out.println("Constructor");
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c: cons) {
			System.out.println(c);
		}
		
		System.out.println("===================================================================================");
		System.out.println("Method");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("===================================================================================");
		System.out.println("Field");
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("===================================================================================");
		System.out.println("");
		
	}

}
