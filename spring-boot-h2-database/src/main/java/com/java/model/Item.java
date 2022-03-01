package com.java.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Item   
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column  
private int id;  
//defining name as column name  
@Column  
private String name;  
//defining age as column name  
@Column  
private int price;  
public int getId()   
{  
return id;  
}  
public void setId(int id)   
{  
this.id = id;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
public int getPrice()   
{  
return price;  
}  
public void setPrice(int price)   
{  
this.price = price;  
}  
}