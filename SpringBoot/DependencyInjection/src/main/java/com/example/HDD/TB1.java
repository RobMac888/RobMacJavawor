
package com.example.HDD;

import org.springframework.stereotype.Component;

import com.example.interfaces2.HDD;
@Component("TB1")
public class TB1 implements HDD{
	public String spec()
	{
		return "TB1";
	}

}
