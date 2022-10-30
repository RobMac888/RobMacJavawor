
package com.example.HDD;

import org.springframework.stereotype.Component;

import com.example.interfaces2.HDD;
@Component("MB512")
public class MB512 implements HDD{
	public String spec()
	{
		return "MB512";
	}

}
