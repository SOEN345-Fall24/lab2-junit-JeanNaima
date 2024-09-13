import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void test1FunctionA(){
        Example example = new Example(1,1);
        assertEquals("FunctionA test1 incorrect result", 2, example.Function_A(1));
    }
    @Test
    public void test2FunctionA(){
        Example example = new Example(1,1);
        assertEquals("FunctionA test2 incorrect result", -2, example.Function_A(-1));
    }
    @Test
    public void test1FunctionB(){
        Example example = new Example(1,1);
        assertEquals("FunctionB test1 incorrect result", 6, example.Function_B(5));
    }

    @Test
    public void test2FunctionB(){
        Example example = new Example(1,1);
        assertEquals("FunctionB test2 incorrect result", 6, example.Function_B(7));
    }

}
