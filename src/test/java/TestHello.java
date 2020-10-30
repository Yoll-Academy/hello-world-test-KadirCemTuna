import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {

  @Test
  void firstTest(){
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    Hello.main(null);

    assertEquals("Hello World!\n", bos.toString());

    System.setOut(originalOut);
  }
}
