package com.troanh.languageapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Hello 
{
  public static void main(String[] args) throws IOException 
  {
    String language = args[0];
    InputStream resourceStream = Hello.class.getClassLoader().getResourceAsStream(language + ".txt");
    assert resourceStream != null;
    BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(resourceStream, StandardCharsets.UTF_8));
    System.out.println(bufferedInputStream.readLine());
  }
}
