import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import task.helloworld.service.HelloWorldService;

import static org.testng.Assert.*;

/**
 * Created by mistrate on 10/26/2016.
 */
public class TestHelloWorld {

    HelloWorldService helloWorldService;
    @BeforeMethod
    public void setUp() throws Exception {
        helloWorldService = new HelloWorldService();
    }

    @Test
    public void testDesc() throws Exception {
        String desc = helloWorldService.getDesc();
        assertEquals("Gradle + Spring MVC Hello World Example", desc);
    }

    @Test
    public void testTitle() throws Exception {
        String title = helloWorldService.getTitle("");
        assertEquals("Hello World", title);
        title = helloWorldService.getTitle("lala");
        assertEquals("Hello lala", title);
    }

}