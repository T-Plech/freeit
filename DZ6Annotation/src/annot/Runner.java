package annot;

public class Runner {

	public static void main(String[] args) throws Exception {
		
	VersionAnnotationProcessor processor = new VersionAnnotationProcessor();
	
	processor.process(MyService.class);

	
	
}}
