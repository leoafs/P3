package com.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.Kickstarter.main.Main;

public class MainTeste {
	Main main;
	@Before
	public void setUp() throws Exception {
		main=new Main();
	}

	@Test
	public void testMain() {
		assertEquals("Entrada Invalida",main.equals("a"));
	}

}
