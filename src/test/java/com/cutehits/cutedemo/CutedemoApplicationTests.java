package com.cutehits.cutedemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cutehits.cutedemo.bo.EmployeeInt;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CutedemoApplicationTests {

	/*@Test
	public void contextLoads() {
	}*/
	@MockBean
	private EmployeeInt emprepository; 
	@Test
	public void test(){
		
	}

}
