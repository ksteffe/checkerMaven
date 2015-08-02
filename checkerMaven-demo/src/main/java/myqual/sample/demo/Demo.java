package myqual.sample.demo;

import myqual.sample.annotations.Id;

/**
 *  A class to demonstrate type checking
 */
public class Demo {

  public static void main(String[] args) {
    Pojo pojo = new Pojo();

    // Should compile here
    @SuppressWarnings({"id"})
    @Id long value = 1234L;
    pojo.setId(value);

    // Should fail to compile here
    pojo.setId(1234L);

    pojo.setName("Test");
    System.out.println(pojo);
  }

}
