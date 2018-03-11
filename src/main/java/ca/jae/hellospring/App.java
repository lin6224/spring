package ca.jae.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ca.jae.spring.beans.Car;
import ca.jae.spring.beans.HelloWorld;

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
    	
    	
    	Car car = ctx.getBean(Car.class);
    	System.out.println(car);
    	
    }
}
