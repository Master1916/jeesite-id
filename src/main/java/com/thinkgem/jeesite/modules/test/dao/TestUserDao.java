/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.test.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.test.entity.TestUser;

/**
 * 测试用户DAO接口
 * @author wut
 * @version 2018-08-02
 */
@MyBatisDao
public interface TestUserDao extends CrudDao<TestUser> {
	
}