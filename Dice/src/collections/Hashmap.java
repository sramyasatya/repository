package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1, "Ram");
hm.put(2, "Sam");
System.out.println(hm);
//duplicates value allowed
hm.put(3, "Ram");
//duplicates keys wont allow
hm.put(3, "Sandy");
System.out.println(hm);
//getting value based on key
System.out.println(hm.get(2));
//retrieving all keys
Set<Integer> keys=hm.keySet();
System.out.println(keys);
Set<Map.Entry<Integer,String>> kv=hm.entrySet();
for(Map.Entry<Integer,String> k:kv)
{
	System.out.println(k.getKey()+" "+k.getValue());
}
}
}
