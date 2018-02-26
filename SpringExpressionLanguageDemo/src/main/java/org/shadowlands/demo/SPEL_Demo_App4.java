package org.shadowlands.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SPEL_Demo_App4 {
	
	@Autowired
	@Value("#{systemProperties['os.name']}")
	private static String osValue;

	public static void main(String[] args) {
		//SpringApplication.run(SpringExpressionLanguageDemoApplication.class, args);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext4.xml");

		System.out.println("osValue: " + osValue);
		ScriptLoaderDemoClass sl = appContext.getBean("sL", ScriptLoaderDemoClass.class);
		sl.loadScript();
		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}
}
