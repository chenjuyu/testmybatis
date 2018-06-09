package pos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.UserMapper;
import pos.model.User;


import pos.service.userService;

@Service("userSerivice")
public class userServiceimpl implements userService  {

	
	  @Autowired  
	  private UserMapper  userDao;

		
	 @Override  
	 public User Login(User user) {  
     // return userDao.Login(user)==null?false:true; 
		 return userDao.Login(user); 
		    }  
		
	

	
	
	
	
}
