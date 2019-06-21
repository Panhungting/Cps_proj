package com.cps.manager.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * アクション：
 * 
 * @author PAN
 * @date 2019/06/02
 * 
 */
@ParentPackage("basePackage")
@Namespace("/")
public class TestpanAction extends ActionSupport{
	
	/**
	 * アクセス
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Action(results={@Result(name="success", location="Samplepansql01", type="redirectAction")})
	public String test01() {
		
//		//引数
//		ActionContext context = ActionContext.getContext();
//		Map<String, Parameter> map = context.getParameters();
		
		//String userid = map.get("userid").toString();
		String title = "OK Pan";
//		context.put("title",title);
		System.out.println("OK Pan");
		return SUCCESS;
	}
	
//	@Action(results={@Result(name="SUCCESS2",location="jsps/SamplepanSqlTest.jsp",type="redirect")})	//リダイレクト変化
//	public String test02() {
//		System.out.println("OK jsps/SamplepanSqlTest.jsp");
//		return "SUCCESS2";
//	}
	
}
