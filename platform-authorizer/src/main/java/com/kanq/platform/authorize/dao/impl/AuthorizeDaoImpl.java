package com.kanq.platform.authorize.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kanq.platform.basis.common.base.dao.impl.AbstractBaseDaoImpl;
import com.kanq.platform.basis.common.base.mapper.BaseMapper;
import com.kanq.platform.authorize.dao.AuthorizeDao;
import com.kanq.platform.authorize.mapper.AuthorizeMapper;
import com.kanq.platform.authorize.model.Authorize;

@Repository
public class AuthorizeDaoImpl extends AbstractBaseDaoImpl<Authorize> implements AuthorizeDao {

	@Autowired
	private AuthorizeMapper authorizeMapper;

	@Override
	public BaseMapper<Authorize> getDefinedMapper() {
		return authorizeMapper;
	}

	@Override
	public List<Map<Object, Object>> getAuthorize() throws Exception {
		
		return authorizeMapper.getAuthorize();
	}


}
