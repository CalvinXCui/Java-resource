package com.kanq.platform.authorize.web.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kanq.platform.basis.common.base.web.controller.BaseViewController;

@Controller
@RequestMapping("authorize")
public class AuthorizeViewController implements BaseViewController {

	/**
	 * mapping
	 */

	// mapping-end~

	/**
	 * 视图路径
	 */
	private static final String VIEW_TEMPLATE_PATH = "authorize/newPage";

	/**
	 * 主界面视图(authorize/mainView)
	 */
	protected static final String MAIN_VIEW_TEMPLATE = VIEW_TEMPLATE_PATH + "/authorizeMa";
	
	/**
	 * 添加页视图(authorize/addView)
	 */
	protected static final String ADD_VIEW_TEMPLATE = VIEW_TEMPLATE_PATH + "/authorizeAdd";

	/**
	 * 详情页视图(authorize/detailView)
	 */
	protected static final String DETAILS_VIEW_TEMPLATE = VIEW_TEMPLATE_PATH + "/details-view";

	/**
	 * 编辑页视图(authorize/editView)
	 */
	protected static final String EDIT_VIEW_TEMPLATE = VIEW_TEMPLATE_PATH + "/edit-view";

	/**
	 * 分页页视图(authorize/pagedResultView)
	 */
	protected static final String PAGED_RESULT_VIEW_TEMPLATE = VIEW_TEMPLATE_PATH + "/paged-result-view";
	
	// view-path-end~

	/**
	 * 主页
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(MAIN_VIEW)
	public ModelAndView mainView() throws Exception {
		ModelAndView mv = new ModelAndView(MAIN_VIEW_TEMPLATE);
		return mv;
	}

	/**
	 * 详情页
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(DETAILS_VIEW)
	public ModelAndView detailsView() throws Exception {
		ModelAndView mv = new ModelAndView(DETAILS_VIEW_TEMPLATE);
		return mv;
	}

	/**
	 * 添加页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(ADD_VIEW)
	public ModelAndView addView() throws Exception {
		ModelAndView mv = new ModelAndView(ADD_VIEW_TEMPLATE);
		return mv;
	}
	
	/**
	 * 编辑页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(EDIT_VIEW)
	public ModelAndView editView() throws Exception {
		ModelAndView mv = new ModelAndView(EDIT_VIEW_TEMPLATE);
		return mv;
	}

	/**
	 * 分页页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(PAGED_RESULT_VIEW)
	public ModelAndView pagedResultView() throws Exception {
		ModelAndView mv = new ModelAndView(PAGED_RESULT_VIEW_TEMPLATE);
		return mv;
	}
}
