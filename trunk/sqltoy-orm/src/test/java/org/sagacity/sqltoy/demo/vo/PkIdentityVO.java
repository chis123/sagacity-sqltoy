/**
 *@Generated by QuickVO Tools 1.5 
 */
package org.sagacity.sqltoy.demo.vo;

import java.util.Date;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import org.sagacity.sqltoy.demo.vo.base.AbstractPkIdentityVO;

/**
 * @project sqltoy-orm
 * @author chenrenfei@lakala.com
 * @version 1.0.0
 * Identity主键测试表  		
 * PkIdentityVO generated by TEST_PK_IDENTITY
 */
@SqlToyEntity
public class PkIdentityVO extends AbstractPkIdentityVO {	
	/** default constructor */
	public PkIdentityVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public PkIdentityVO(Integer id)
	{
		this.id=id;
	}

	/** minimal constructor */
	public PkIdentityVO(Integer id,String name)
	{
		this.id=id;
		this.name=name;
	}

	/** full constructor */
	public PkIdentityVO(Integer id,String name,Date createTime,Double sallary)
	{
		this.id=id;
		this.name=name;
		this.createTime=createTime;
		this.sallary=sallary;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public PkIdentityVO clone() {
		try {
			// TODO Auto-generated method stub
			return (PkIdentityVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
