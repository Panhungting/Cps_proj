package com.cps.manager.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * �A�N�V�����F
 * 
 * @author PAN
 * @date 2019/06/02
 * 
 */
@ParentPackage("basePackage")
@Namespace("/")
public class _TestpanSqlAction extends ActionSupport{
	
	/**
	 * �A�N�Z�X
	 */
	private static final long serialVersionUID = 1L;
	
	@Action(results={@Result(name="success", location="Samplepansql01", type="redirectAction")})
	public String test01() {
		System.out.println("OK Pan");
		return SUCCESS;
	}
	
//	@Action(results={@Result(name="SUCCESS2",location="jsps/SamplepanSqlTest.jsp",type="redirect")})	//���_�C���N�g�ω�
//	public String test02() {
//		System.out.println("OK jsps/SamplepanSqlTest.jsp");
//		return "SUCCESS2";
//	}
	
}
