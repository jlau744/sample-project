package com.java.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.java.model.Item;  
import com.java.repository.ItemRepository;  
@Service  
public class ItemService   
{  
@Autowired  
ItemRepository itemRepository;  
//getting all item records 
public List<Item> getAllItem()   
{  
List<Item> items = new ArrayList<Item>();  
itemRepository.findAll().forEach(item -> items.add(item));  
return items;  
}  
//getting a specific record  
public Item getItemById(int id)   
{  
return itemRepository.findById(id).get();  
}  
public void saveOrUpdate(Item item)   
{  
itemRepository.save(item);  
}  
//deleting a specific record  
public void delete(int id)   
{  
itemRepository.deleteById(id);  
}  
}  