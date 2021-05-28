package in.co.movie.ticket.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import in.co.movie.ticket.config.MovieTicketConfigration;
import in.co.movie.ticket.config.MovieTicketDispatcherServletInitializer;
import in.co.movie.ticket.dao.UserDAOInt;
import in.co.movie.ticket.dao.UserDAOimpl;
import in.co.movie.ticket.entity.UserEntity;
import in.co.movie.ticket.util.DataUtility;


@ContextConfiguration(
    classes = {MovieTicketDispatcherServletInitializer.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

	@Autowired(required = true)
	UserDAOInt dao;
	
	@Test
	public void test() {
		assertEquals(1,1);
	}
	
	@Test
	public void testAdd() {
		UserEntity entity=new UserEntity();
		entity.setFirstName("Hari");
		entity.setLastName("Mukati");
		entity.setLogin("Hari@gmail.com");
		entity.setPassword("123");
		entity.setMobileNo("9685456574");
		entity.setRoleId(2);
		entity.setCreatedBy("root");
		entity.setModifiedBy("root");
		entity.setCreatedDateTime(DataUtility.getCurrentTimestamp());
		entity.setModifiedDateTime(DataUtility.getCurrentTimestamp());
		long pk=dao.add(entity);
		assertNotEquals(0,pk);
	}

}
