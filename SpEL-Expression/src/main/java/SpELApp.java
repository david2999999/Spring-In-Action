import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.configuration.EnvironmentConfig;
import com.springinaction.model.BlankDisc;
import com.springinaction.model.DiscManager;

public class SpELApp {
	public static void main(String[] args) {
	    String key1 = "artist";
	    String key2 = "title";
	    System.setProperty(key1 , "a property with a value");
	    System.setProperty(key2 , "a property with a value2");
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnvironmentConfig.class);
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("app.xml");
		
		DiscManager discManager = context.getBean("discManager", DiscManager.class);
		BlankDisc blankDisc = context2.getBean("sgtPeppers", BlankDisc.class);
		
		System.out.println(discManager.getDisc());
		System.out.println(blankDisc);
		context.close();
		//context2.close();
	}
}
