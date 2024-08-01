package com.supraja.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@SpringBootTest
class BookingServiceImplTest {

	@Autowired
	
	BookingServiceImpl bookingservice;
	
	@Test
	void test() 
	{
		assertEquals("success", service.addBooking());
	}

}
