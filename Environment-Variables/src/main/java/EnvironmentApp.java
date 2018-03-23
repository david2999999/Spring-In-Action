import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.configuration.EnvironmentConfig;
import com.springinaction.model.BlankDisc;

public class EnvironmentApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnvironmentConfig.class);
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("app.xml");
		
		BlankDisc blankDisc = context.getBean("disc", BlankDisc.class);
		BlankDisc blankDisc2 = context.getBean("newDisc", BlankDisc.class);
		
		BlankDisc blankDisc3 = context2.getBean("sgtPeppers", BlankDisc.class);
		
		
		System.out.println(blankDisc);
		System.out.println(blankDisc2);
		
		System.out.println(blankDisc3);
		
		context.close();
		context2.close();
	}
}
