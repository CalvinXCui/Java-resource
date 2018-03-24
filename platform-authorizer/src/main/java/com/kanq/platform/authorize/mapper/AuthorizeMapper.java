package com.kanq.platform.authorize.mapper;

import com.kanq.platform.basis.common.base.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import com.kanq.platform.authorize.model.Authorize;

public interface AuthorizeMapper extends BaseMapper<Authorize> {
	
	public List<Map<Object, Object>> getAuthorize()throws Exception;


}