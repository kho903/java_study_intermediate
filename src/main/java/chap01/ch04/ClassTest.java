package chap01.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c	= Class.forName("java.lang.String");
		System.out.println(c.getName());
		Constructor<String>[] constructors = c.getConstructors();

		for (Constructor<String> constructor : constructors) {
			System.out.println(constructor);
		}

		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
