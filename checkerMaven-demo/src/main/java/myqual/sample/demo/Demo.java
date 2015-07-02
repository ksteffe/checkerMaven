package myqual.sample.demo;

/**
 *  A class to demonstrate type checking
 */
public class Demo {

  public static void main(String[] args) {
    Pojo pojo = new Pojo();
    //Should fail to compile here
    pojo.setId(1234L);
    pojo.setName("Test");
    System.out.println(pojo);
  }

}
