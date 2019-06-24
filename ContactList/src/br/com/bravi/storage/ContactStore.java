package br.com.bravi.storage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import br.com.bravi.bean.Address;
import br.com.bravi.bean.Contact;

public class ContactStore {
	private static Map<String,Contact> store;
	private static ContactStore instance = null;
	
	private ContactStore() {
		store = new HashMap<String,Contact>();
		initOneContact();
	}
	
	public static Map<String,Contact> getStore() {
		if(instance==null) {
			instance = new ContactStore();
		}
		return store;
	}
	
	private static void initOneContact() {
		Address[] addrs = {
			new Address("Rio de Janeiro", "Carlos de Vasconselos"),
			new Address("Shanghai", "Dong Quan Street")
		};
		Contact cHuang = new Contact("luis", "Tijuca", Arrays.asList(addrs));
		store.put(cHuang.getId(), cHuang);
	}
}
