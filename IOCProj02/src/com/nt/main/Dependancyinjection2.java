package com.nt.main;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbean.currentseasonefinder ;

public class Dependancyinjection2 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx= 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		currentseasonefinder genrator= ctx.getBean("wmg",currentseasonefinder.class);
		
		String result =genrator.showseassion();
		System.out.println(result);
		
		ctx.close();
	}
}
		
