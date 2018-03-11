package ca.jae.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ca.jae.spring.beans.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // create spring IOC container 
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	// IOC container get java bean
    	HelloWorld hw = (HelloWorld)ctx.getBean("helloworld");
    	// call method
    	hw.hello();
    }
}
