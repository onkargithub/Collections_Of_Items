package com.CollectionOfItemsWithOutDB;

public class Item {

public int itemid;
public String itemname;
public String itemdescription;
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(int itemid, String itemname, String itemdescription) {
	super();
	this.itemid = itemid;
	this.itemname = itemname;
	this.itemdescription = itemdescription;
}
public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	this.itemid = itemid;
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public String getItemdescription() {
	return itemdescription;
}
public void setItemdescription(String itemdescription) {
	this.itemdescription = itemdescription;
}
@Override
public String toString() {
	return "Item [itemid=" + itemid + ", itemname=" + itemname + ", itemdescription=" + itemdescription + "]";
}


}
