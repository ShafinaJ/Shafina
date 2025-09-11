import java.util.ArrayList;
class Contact
{
public static void main(String[]args)
{
ArrayList<String>con=new ArrayList<String>();
con.add("Shafi");
con.add("Saru");
con.add("Sri");
con.add("Alen");
con.add("Achu");
for(String con1:con)
{
System.out.println("Contact List"+con1);
}
system.out.println("Retrieve:"+con1.get(3));
system.out.println("Update:"+con1.set(4,"Oops"));
system.out.println("Remove:"+con1.remove(1));
}
}