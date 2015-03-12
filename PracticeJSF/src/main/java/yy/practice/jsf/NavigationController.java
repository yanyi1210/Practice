package yy.practice.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable{

	private static final long serialVersionUID = -6025517168034713572L;
	
	// this managed property will read value from request parameter pageId
//	@ManagedProperty(value = "#{param.pageId}")
//	private String pageId;

	/*public String showPage() {
		if (pageId == null) {
			return "home";
		}

		switch (pageId) {
		case 1:
			return "page1";
		case 2:
			return "page2";
		default:
			return "home";
		}

		if (pageId.equals("1")) {
			return "page1";
		} else if (pageId.equals("2")) {
			return "page2";
		} else {
			return "home";
		}
	}*/

	public String moveToPage1() {
		return "page1";
	}
}
