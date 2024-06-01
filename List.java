import java.util.*;
class List<T>
{
   Node head;
   int count;
   class Node
   {
     T data;
     Node next;
     Node(T x)
     {
       data=x;
       next=null;
     }
    }
    List()
    {
      head=null;
      count=0;
    }
    boolean isEmpty()
    {
      if(head==null)
	    return true;
      else
	return false;	
    }
	
    void insert(T value)
    {
	Node newNode=new Node(value);
	if(isEmpty())
	{
	   head=newNode;
	   head.next=null;
	   count++;
	}
	else
	{
	  Node current=head;
	  while(current.next!=null)
		current=current.next;
	  current.next=newNode;
	   count++;
	}
    }
	
	void insert(int pos, T value)
	{
		/*
		1. if inserting last element
		2. inserting at middle somewhere
		3. inserting at first 
		*/
		Node newNode=new Node(value);
		if(pos>count+1 || pos<=0)   // count +1 so that we can insert element at the end of list
			
			throw new NullPointerException("Position out of bound");
		else
		{
			if(pos==1)
			{
				newNode.next=head;
				head=newNode;
				count++;
			}
			else{
			Node current=head;
			
			int count_1=1;
			while(current.next!=null && count_1<pos-1)
			{
			current=current.next;
			count_1++;
			}
			newNode.next=current.next;
			current.next=newNode;
			count++;
			}
			
		}
	}
    void printAll()
    {
	Node current=head;
	System.out.println("Total number of elements in list: "+count);
	while(current!=null)
	{
	   System.out.println(current.data);
	   current=current.next;
	}
    }
    void delete(T value)
    {
	if(isEmpty())
	   throw new NullPointerException("List is Empty");
	else
	{
	   if(head.data==value)    // If value to be deleted is at first position
	   {
	     head=head.next;
		count--;
	   }
	  else
	  { 
	     Node current= head;
	     Node toDelete=head;
	     while(toDelete!=null && toDelete.data!=value)
	     {
	          current=toDelete;
		  toDelete=toDelete.next;
	     }
	     if(toDelete==null)   //if list ends & we dont find the value to be deleted
		System.out.println("Wrong value for delete()");
	     else
	     {  // we found the values to be deleted
		count--;
		current.next=toDelete.next;
   		}
	}
	}// end of else
  }// end of function
	void delete(int pos)
	{
		/*
		1. if deleting last elements
		2. deleting middle somewhere
		3. deleting first 
		*/
		if(isEmpty())
			throw new NullPointerException("List is Empty");
		else 
		{
			if(pos>count || pos<=0)   // count  so that we can element to be deleted should be in the list
			
				throw new NullPointerException("Position out of bound");
			if(pos==1)
			{
			Node current=head;
			head=head.next;
			System.out.println("Deleted element:"+current.data);
			count--;
			}
			else{
				Node current=head;
				Node toDelete=head.next;
				int count_1=1;
				while(current.next!=null && count_1<pos-1)
				{
					toDelete=toDelete.next;
					current=current.next;
					
					count_1++;

				}
				current.next=toDelete.next;
				System.out.println("Deleted element:"+toDelete.data);
				count--;
		}
		}
	}
	void search(T value){
		Node newNode=new Node(value);
		Node current = head;
		
		if(count ==0)
			System.out.println("List is empty");
		else if(current.data == newNode.data && count ==1){
			System.out.println("element found" +newNode.data);
		}
		else if(count>1){
			while(current!= null){
				if(current.data.equals(newNode.data)){
					System.out.println(value + " Contained in List");	
					break;		
				}
				current = current.next;
			}
			if(current==null)
				System.out.println("Not in list");
				
			
		}
	}
		
	
	
	void searchduplicates(T value){
		Node newNode=new Node(value);
		Node current = head;
		
		
		if(count ==0)
			System.out.println("List is empty");
		else if( count ==1 && current.data == newNode.data){
			System.out.println("element found" +newNode.data);
		}
		else{
		//	System.out.println("in else if");
		int dup_holder = 0;
			while(current!= null){
			//	System.out.println(" in while"+current.data);
				if(current.data.equals(newNode.data)){
					dup_holder+=1;
				}
					current=current.next;
				
				
			}
			if(dup_holder==0)
				System.out.println("Not in list");
				
			else
				System.out.println("No of copies of "+newNode.data+"  are"+dup_holder);
		}
	
	}
	
	
	void toArray(){
		Node current = head;
		T[] listToArray = (T[])new Object[count];
	
		int i=0;
		while(current!= null){
			
				listToArray[i] = current.data;
				i++;
			current = current.next;
		}
			
		for(int c=0; c<listToArray.length; c++){
			System.out.print(listToArray[c] + " ");
		}
	
	}
	
     
}

class ListProgram
{
   public static void main(String arg[])
   {
	   /* 
	   1. insert
	   2. insert at given position
	   3. search
	   4. print
	   5. delete by value
	   6. delete by position
	   */
	List<String> ob=new List();
	while(true)
	{
	System.out.println("1.Insert");
	System.out.println("2.Insert at given position");
	System.out.println("3.Search");
	System.out.println("4.print");
	System.out.println("5.Delete by value");
	System.out.println("6.Delete by position");
	System.out.println("7.Transform list into array");
	System.out.println(" What operation u want to perform:");
	
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	switch(x)
	{
		case 1:
		
		System.out.println("Enter String u want to insert:");
		String s=sc.next();
		ob.insert(s);
		break;
	
		case 2:
	
		System.out.println("Enter String u want to insert:");
		s=sc.next();
		System.out.println("Enter position:");
		int pos=sc.nextInt();
		ob.insert(pos,s);
		break;
		case 3:
	
			System.out.println("Enter String u want to search:");
		    s=sc.next();
			ob.searchduplicates(s);
		break;
		case 4:
	
		ob.printAll();
		break;
	
		case 5:
		System.out.println("Enter String u want to delete:");
		s=sc.next();
		ob.delete(s);
		break;
	
		case 6:
		System.out.println("Enter position to delete:");
		pos=sc.nextInt();
		ob.delete(pos);
		break;
		
		case 7:
		ob.toArray();
		break;
		
		default:
		System.out.println("Enter Correct option:");
	
	}
	System.out.println("Do u want to continue(y/n):");  
	String s=sc.next();
	if(s.equals("y")==false)
	{
		break;
	}
	}
	//char c=sc.next().charAt(0);
	
}
}








/*	ob.insert("Sonal");
	ob.insert("Sade");
	ob.insert("Corona");
	ob.insert("Threat");
	//ob.printAll();
	ob.insert(3,"Java");
	//ob.printAll();
	ob.insert(6,"List");
	//ob.printAll();
	ob.insert(1,"Node");
	ob.printAll();
	//ob.deleteAt(4);
	ob.printAll();
ob.search("Sonal");
	ob.printAll();
	ob.search("Lt");
	*/

	/*
	1. List is empty
	2. element found
	3. element not found
	4. Case Sensitive
	*/