package hello;

//import java.time.LocalTime;
import org.joda.time.LocalTime;
/**
 * Created by ryanstrong on 4/26/17.
 */
public class HelloWorld {
    public static void main(String [] args){
        LocalTime currentTime = new LocalTime();
        System.out.println("The local time is:" + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
