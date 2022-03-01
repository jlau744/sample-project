package com.java.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.java.model.Item;  
import com.java.service.ItemService;  
//creating RestController  
@RestController  
public class ItemController   
{  
//autowired the ItemService class  
@Autowired  
ItemService itemService;  
//creating a get mapping that retrieves all the items detail from the database   
@GetMapping("/item")  
private List<Item> getAllItem()   
{  
return itemService.getAllItem();  
}  
//creating a get mapping that retrieves the detail of a specific item  
@GetMapping("/item/{id}")  
private Item getItem(@PathVariable("id") int id)   
{  
return itemService.getItemById(id);  
}  
//creating a delete mapping that deletes a specific item 
@DeleteMapping("/item/{id}")  
private void deleteItem(@PathVariable("id") int id)   
{  
itemService.delete(id);  
}  
//creating post mapping that post the item detail in the database  
@PostMapping("/item")  
private int saveitem(@RequestBody Item item)   
{  
itemService.saveOrUpdate(item);  
return item.getId();  
}  
}  