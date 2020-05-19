package ex7;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
	private String name;
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Resource r = (Resource)o;
		System.out.println("hi " + name + ",\na piece of news from " + r.getUrl() + 
				", and the content is: " + r.getLateNews());
	}
	
}
