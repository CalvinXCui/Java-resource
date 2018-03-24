package com.kanq.platform.authorize.dao;

import com.kanq.platform.basis.common.base.dao.BaseDao;

import java.util.List;
import java.util.Map;

import com.kanq.platform.authorize.model.Authorize;

public interface AuthorizeDao extends BaseDao<Authorize> {
	
	public List<Map<Object, Object>> getAuthorize()throws Exception;

}
