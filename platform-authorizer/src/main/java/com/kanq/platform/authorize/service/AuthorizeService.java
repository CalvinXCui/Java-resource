package com.kanq.platform.authorize.service;

import com.kanq.platform.basis.common.base.service.BaseService;

import java.util.List;
import java.util.Map;

import com.kanq.platform.authorize.model.Authorize;

public interface AuthorizeService extends BaseService<Authorize> {
	
	public List<Map<Object, Object>> getAuthorize()throws Exception;

}
