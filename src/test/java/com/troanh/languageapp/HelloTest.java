package com.troanh.languageapp;
import org.junit.jupiter.api.Test;
import com.troanh.languageapp.Hello;
import java.io.IOException;
public class HelloTest {
  @Test
  public void testHello() throws IOException {
  Hello.main(new String[]{"en"});
  }
}
