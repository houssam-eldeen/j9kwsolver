package de.bmarwell.j9kwsolver.domain;

public class Captcha {

	private String id;
	private String source;
	private boolean mouse;
	private boolean confirm;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
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
	
	
}