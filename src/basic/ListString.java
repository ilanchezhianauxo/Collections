package basic;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListString implements Serializable {
	List<String> someList;
	List<String> itemsToAdd;
	public static void main(String args[])
	{
		ListString l=new ListString();
		l.itemsToAdd.add("one");
		l.itemsToAdd.add("two");
		l.someList.addAll(l.itemsToAdd);
		System.out.println(l.someList);
		System.out.println(l.itemsToAdd);
	}

}
