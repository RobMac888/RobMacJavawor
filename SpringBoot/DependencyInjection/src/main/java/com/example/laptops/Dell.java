package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces2.HDD;
import com.example.interfaces2.Laptop;
@Component("Dell")
public class Dell implements HDD{
	@Autowired
	@Qualifier("MB512")
	HDD hdd;
	public String spec()
	{
		System.out.println("This laptop has "+hdd.spec()+" storage.");
		return hdd.spec();
	}
}