package spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Autowired
	Address address;
	
	@Autowired
	List<Address> addresses;
	
	
	public Student(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	/*public void setAddress(Address address) {
		this.address = address;
	}*/

	
}
