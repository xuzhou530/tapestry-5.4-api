package org.flywind.tapestry.pages.examples.t54;

import org.apache.tapestry5.annotations.Property;

/**
 * <p>Tapestry5.4 API</p>
 * 
 * @author flywind(飞风)
 * @date 2016年6月2日
 * @网址：http://www.flywind.org
 * @QQ技术群：41138107(人数较多最好先加这个)或33106572
 * @since 1.0
 */
public class ContextTest2 {

	@Property
	private String myName;
	
	public void onActivate(String str){
		this.myName = str;
	}
}
