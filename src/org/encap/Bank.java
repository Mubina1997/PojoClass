package org.encap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bank {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		//this is normal method
		h.setUsername("Siraj");
		h.setPassword(1234);
		h.setUsername("Ruksana");
		h.setPassword(2367);
		String username = h.getUsername();
		System.out.println(username);
		int password = h.getPassword();
		System.out.println(password);
		
		//using list
		List<HDFC> li = new ArrayList();
		li.add(h);
		for(int i=0;i<li.size();i++)
		{
			HDFC hdfc = li.get(i);
			String username2 = hdfc.getUsername();
			System.out.println(username2);
			int password2 = hdfc.getPassword();
			System.out.println(password2);
		}
		
		//using Set
		
		Set<HDFC> s = new HashSet();
		s.add(h);
		for(HDFC b:s) {
			b.getUsername();
			b.getPassword();
			}
		
		//using Map
		Map<HDFC,Integer> m = new HashMap();
		m.put(h, 1);
		Set<HDFC> keySet = m.keySet();
		for(HDFC sv:keySet)
		{
			sv.getUsername();
			sv.getPassword();
			
		}
		/*here values la dan hDFC so entryset loop used
		Set<Entry<Integer, HDFC>> entrySet = m.entrySet();
		for(Entry<Integer,HDFC> f:entrySet)
		{
			System.out.println(f);
			Integer key = f.getKey();
			System.out.println(key);
			//HDFC value = f.getValue();
			//System.out.println(value);
		}
		*/
		System.out.println("Git changes done");
		
		
		
		
	
	}

}
