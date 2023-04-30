package chap01.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
			InvocationTargetException, InstantiationException, IllegalAccessException {
		Person person = new Person("James");
		System.out.println(person);

		Class c = Class.forName("chap01.ch04.Person");
		Class[] parameterTypes = {String.class};
		Constructor constructor = c.getConstructor(parameterTypes);

		Object[] initArgs = {"김지훈"};
		Person personKim = (Person)constructor.newInstance(initArgs);
		System.out.println(personKim);
	}
}
