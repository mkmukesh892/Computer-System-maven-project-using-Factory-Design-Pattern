package com.mukesh.design.factory;


import com.mukesh.design.model.Computer;
import com.mukesh.design.model.PC;
import com.mukesh.design.model.Server;

public class ComputerFactory {
public static Computer getComputer(String type,String ram, String hdd, String cpu) {
	if("PC".equalsIgnoreCase(type)) return new PC(ram,hdd,cpu);
	else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
	return null;
	
}


}
