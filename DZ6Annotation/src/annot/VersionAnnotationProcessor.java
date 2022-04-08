package annot;

//Написать программу, которая будет анализировать присутствие аннотации над классом MyService и 
//если она присутствует - создавать экземпляр этого класса,
//задавать значения его полям и вызывать метод thisClassInfo (использовать возможности пакета reflection).


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VersionAnnotationProcessor {

	public void process(Class<?> clazz) throws Exception {
		
		
		boolean isAnnotation = clazz.isAnnotationPresent(Version.class);
		
		if(isAnnotation) {
			
			Version annotation = clazz.getAnnotation(Version.class);
			
			System.out.println("Annotation Version myService = " + annotation.myService());
			System.out.println("Annotation Version name = " + annotation.nameVersion());
			
		
			Constructor<?> constructor = clazz.getConstructor();
			
			MyService myService = (MyService)constructor.newInstance();
			
						
			myService.setPrivateInt(125);
			myService.setPrivateString("We change your private String - ha-ha-ha");
			
		
			
			Method[] declaredMethods = clazz.getDeclaredMethods();
			for(Method method : declaredMethods) {
				if(!method.canAccess(myService)) {
					method.setAccessible(true);
					method.invoke(myService, null);
				}				
				
			}
						
		}		
		
		
	}
	
}
