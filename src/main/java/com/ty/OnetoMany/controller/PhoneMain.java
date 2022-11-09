package com.ty.OnetoMany.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.OnetoMany.dao.PhoneDao;
import com.ty.OnetoMany.dto.Phone;
import com.ty.OnetoMany.dto.Sim;


public class PhoneMain {

	public static void main(String[] args) 
	{
		
		Phone phone = new Phone();
		phone.setName("MI");
		phone.setNumb(6587469);
		phone.setAddress("blr");
		
		Sim sim1= new Sim();
		sim1.setName("jio");
		sim1.setBal(98.25);
		sim1.setPhone(phone);
		
		Sim sim2= new Sim();
		sim2.setName("aritel");
		sim2.setBal(25.33);
		sim2.setPhone(phone);
		
		List<Sim> it=new ArrayList<Sim>();
		it.add(sim1);
		it.add(sim2);
		
		phone.setSim(it);
		
		PhoneDao dao= new PhoneDao();
		dao.SavePhone(phone);
		

	}

}
