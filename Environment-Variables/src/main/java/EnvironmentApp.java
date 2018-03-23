import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springinaction.configuration.EnvironmentConfig;
import com.springinaction.model.BlankDisc;

public class EnvironmentApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnvironmentConfig.class);
		
		BlankDisc blankDisc = context.getBean("disc", BlankDisc.class);
		BlankDisc blankDisc2 = context.getBean("newDisc", blankDisc.getClass());
		
		System.out.println(blankDisc);
		System.out.println(blankDisc2);
		
		context.close();
	}
}
