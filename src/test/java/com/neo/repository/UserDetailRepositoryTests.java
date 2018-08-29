package com.neo.repository;

import com.neo.domain.User;
import com.neo.domain.UserDetail;
import com.neo.domain.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDetailRepositoryTests {

	@Resource
    private UserDetailRepository userDetailRepository;

	@Test
	public void testUserInfo()  {

		userDetailRepository.save(new UserDetail("222", "New York Address", "Jogging"));

		List<UserInfo> userInfos=userDetailRepository.findUserInfo("Jogging");
		for (UserInfo userInfo:userInfos){
			System.out.println("addree: "+userInfo.getAddress());
		}
	}


}