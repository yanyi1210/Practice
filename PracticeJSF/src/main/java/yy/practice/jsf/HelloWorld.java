package yy.practice.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {

	private static Logger LOG = Logger.getLogger(HelloWorld.class);

	@ManagedProperty(value = "#{message}")
	private Message messageBean;

	private String message;

	public HelloWorld() {
		LOG.debug("HelloWorld started!");
	}

	public String getMessage() {
		if (messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}

	public void setMessageBean(Message message) {
		this.messageBean = message;
	}
}
