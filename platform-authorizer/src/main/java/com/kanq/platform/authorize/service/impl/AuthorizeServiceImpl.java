package com.kanq.platform.authorize.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanq.platform.basis.common.base.dao.BaseDao;
import com.kanq.platform.basis.common.base.service.impl.AbstractBaseServiceImpl;
import com.kanq.platform.authorize.dao.AuthorizeDao;
import com.kanq.platform.authorize.model.Authorize;
import com.kanq.platform.authorize.service.AuthorizeService;

@Service
public class AuthorizeServiceImpl extends AbstractBaseServiceImpl<Authorize> implements AuthorizeService {

	@Autowired
	private AuthorizeDao authorizeDao;

	@Override
	public BaseDao<Authorize> getDefinedDao() {
		return authorizeDao;
	}

	@Override
	public List<Map<Object, Object>> getAuthorize() throws Exception {
		return authorizeDao.getAuthorize();
	}
	
}