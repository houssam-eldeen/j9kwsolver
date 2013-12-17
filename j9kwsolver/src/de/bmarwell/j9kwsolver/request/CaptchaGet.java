/**
 * 
 */
package de.bmarwell.j9kwsolver.request;

import de.bmarwell.j9kwsolver.domain.YesNo;

/**
 * @author bmarwell
 *
 */
public class CaptchaGet implements CaptchaRequestInterface {
	private static final String url = "http://www.9kw.eu/index.cgi";
	private static final String action = "usercaptchanew";
	
	private String apikey;
	private String source = "jk9solver"; // toolname
	private boolean nocaptcha = true;
	private YesNo text = YesNo.YES;
	private boolean mouse = true;
	private boolean confirm = true;
	private boolean selfsolve = true;
	private boolean selfonly = false;
	private boolean withok = true; // bitte usercaptchanewok nutzen 
	private boolean extended = true; // mehr infos
	private boolean debug = true;
	
	public String getAction() {
		return action;
	}
	
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public YesNo getText() {
		return text;
	}
	public void setText(YesNo text) {
		this.text = text;
	}
	
	
	public boolean isNocaptcha() {
		return nocaptcha;
	}

	public void setNocaptcha(boolean nocaptcha) {
		this.nocaptcha = nocaptcha;
	}

	public boolean isMouse() {
		return mouse;
	}

	public void setMouse(boolean mouse) {
		this.mouse = mouse;
	}

	public boolean isConfirm() {
		return confirm;
	}

	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}

	public boolean isSelfsolve() {
		return selfsolve;
	}

	public void setSelfsolve(boolean selfsolve) {
		this.selfsolve = selfsolve;
	}

	public boolean isSelfonly() {
		return selfonly;
	}

	public void setSelfonly(boolean selfonly) {
		this.selfonly = selfonly;
	}

	public boolean isWithok() {
		return withok;
	}

	public void setWithok(boolean withok) {
		this.withok = withok;
	}

	public boolean isExtended() {
		return extended;
	}

	public void setExtended(boolean extended) {
		this.extended = extended;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public String getUrl() {
		return url;
	} 
	
}