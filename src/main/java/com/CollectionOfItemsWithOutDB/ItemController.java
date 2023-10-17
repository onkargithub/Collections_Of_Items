package com.CollectionOfItemsWithOutDB;



import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {
  
	ArrayList<Item> ss=new ArrayList<Item>();
	
   
   public ItemController() {
		ss.add(new Item(10,"phone","This is a phone"));
		ss.add(new Item(11,"watch","This is a watch"));
		ss.add(new Item(12,"Laptop","This is a laptop"));
		ss.add(new Item(13,"Bottle","This is a Bottle"));
		
		    }
		@GetMapping("allItems")
		public ArrayList<Item> allItem() {
			return ss;
			}
		

		@GetMapping("getsinglerecord/{id}")
		public Item singleItem(@PathVariable int id) {
			Item item=new Item();
			for(Item  itm: ss) {
				if(itm.itemid==id) {
					item=itm;
				}}
				System.out.println(item);
				return item;
			}	
	
		@PostMapping("insertrecord")
		public ArrayList <Item> singlerecord(@RequestBody Item item){
		ss.add(item);
		return ss;
	}
}
