package com.java.repository;  
import org.springframework.data.repository.CrudRepository;  
import com.java.model.Item;  
public interface ItemRepository extends CrudRepository<Item, Integer>  
{  
}  