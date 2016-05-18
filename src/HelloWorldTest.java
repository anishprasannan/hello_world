import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anish Prasannan on 18/05/2016.
 */
public class HelloWorldTest {
    @Test
    public void getDefaultHelloWorld() throws Exception {
        HelloWorld hello = new HelloWorld();
        assertEquals("The strings match","Hello World",hello.getHelloWorld());
    }

    @Test
    public void getHelloWorld() throws Exception {
        HelloWorld hello = new HelloWorld("custom");
        assertEquals("The strings match","custom",hello.getHelloWorld());
    }

}