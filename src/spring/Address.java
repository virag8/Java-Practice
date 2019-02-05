package spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("address")
@PropertySource("classpath:spring.properties")
public class Address {

	@Value("${streetName}")
	String streetName;
	
	@Value("${city}")
	String city;
	
	@Value("${pin}")
	int pin;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", pin=" + pin + "]";
	}

}
