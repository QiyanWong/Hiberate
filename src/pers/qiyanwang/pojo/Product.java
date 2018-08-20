package pers.qiyanwang.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_")
public class Product {
  int id;
  String name;
  float price;
  Category category;
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }
  Set<User> users;

  public Set<User> getUsers() {
    return users;
  }
  public void setUsers(Set<User> users) {
    this.users = users;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public float getPrice() {
    return price;
  }
  public void setPrice(float price) {
    this.price = price;
  }
}
