package com.nt.main;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.wishmeassagegenrator;
public class DependencyInjection 
{
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx= 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		wishmeassagegenrator genrator= ctx.getBean("wmg",wishmeassagegenrator.class);
		 
		String result=genrator.showWishmeassage("raja");
		System.out.println("Reasult ::"+result);
		ctx.close();

	}

}