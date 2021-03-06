/**
 *@Generated by QuickVO Tools 1.6
 */
package org.sagacity.sqltoy.demo.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import org.sagacity.sqltoy.demo.vo.base.AbstractLobVO;

/**
 * @project sqltoy-orm
 * @author chenrenfei@lakala.com
 * @version 1.0.0
 * 大数据类型测试  		
 * LobVO generated by TEST_LOB
 */
@SqlToyEntity
public class LobVO extends AbstractLobVO {	
	/** default constructor */
	public LobVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public LobVO(Integer id)
	{
		this.id=id;
	}


	/** full constructor */
	public LobVO(Integer id,String name,String comments,byte[] photo)
	{
		this.id=id;
		this.name=name;
		this.comments=comments;
		this.photo=photo;
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
	public LobVO clone() {
		try {
			// TODO Auto-generated method stub
			return (LobVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
