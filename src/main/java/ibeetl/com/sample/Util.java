package main.java.ibeetl.com.sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.ClasspathResourceLoader;

public class Util {
	static GroupTemplate gt = null;
	static {
		ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("/main/resources/template");
		Configuration cfg;
		try {
			cfg = Configuration.defaultConfiguration();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		gt = new GroupTemplate(resourceLoader, cfg);
	}
	
	public static GroupTemplate getGroupTemplate(){
		return gt;
	}
	
	public static User oneUser(){
		User user = new User();
		user.setId(1);
		user.setName("lijiazhi");
		user.setBir(new Date());
		return user;
	}
	
	public static List<User> users(){
		List<User> list = new ArrayList<User>(2);
		User user = new User();
		user.setId(1);
		user.setName("lijiazhi");
		user.setBir(new Date());
		list.add(user);
		
		user = new User();
		user.setId(2);
		user.setName("beetl");
		user.setBir(new Date());
		list.add(user);
		return list;
		
	}
	
	
	
}
