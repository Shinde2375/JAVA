package com.tka.hw.hw12.ExceptionHandling;

import java.io.IOException;

public class ThrowEx2 {

	void myMethod(int num) throws IOException,ClassNotFoundException
	{
		if(num == 1)
			throw new IOException("Exception Message 1");
		else
			throw new ClassNotFoundException("Exception Message 2");			
	}
}
