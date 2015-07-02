package myqual.sample.demo;

import myqual.sample.annotations.Id;

/**
 *  A POJO for encapsulating the Id and name
 */
public class Pojo {

  private @Id Long id;

  private String name;

  public @Id Long getId() { return id; }

  public void setId(@Id Long id) { this.id = id; }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

}
