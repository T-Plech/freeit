package annot;

import java.util.Objects;

//Класс MyService должен иметь переменные c private модификаторами,
//конструктор по умолчанию, get и set методы, переопределенные методы equals и hashcode,
//а так же private метод (private thisClassInfo), который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.
//

@Version(myService = "1.6")

public class MyService {
	
	private int privateInt = 12;
	private String privateString = "this is private string";
	
	public MyService() {
		
	}
	
	
	private void thisClassInfo() {
		System.out.println("Private Method! This class has next values: " + "\n" + " privateInt = " + privateInt 
				+ "\n privateString: " + privateString);
		
	}
	

	public int getPrivateInt() {
		return privateInt;
	}

	public void setPrivateInt(int privateInt) {
		this.privateInt = privateInt;
	}

	public String getPrivateString() {
		return privateString;
	}

	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(privateInt, privateString);
	}



	public boolean equals() {
		if (this == null) {return true;}
		
		else return false;
		
	}

	
	
	

}
