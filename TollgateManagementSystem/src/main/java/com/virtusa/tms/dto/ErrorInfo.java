package com.virtusa.tms.dto;

import java.time.LocalDateTime;

public class ErrorInfo {

	LocalDateTime timestap;
	String msg;
	String uri;
	public LocalDateTime getTimestap() {
		return timestap;
	}
	public void setTimestap(LocalDateTime timestap) {
		this.timestap = timestap;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	@Override
	public String toString() {
		return "ErrorInfo [timestap=" + timestap + ", msg=" + msg + ", uri=" + uri + "]";
	}
	public ErrorInfo(LocalDateTime timestap, String msg, String uri) {
		super();
		this.timestap = timestap;
		this.msg = msg;
		this.uri = uri;
	}
	public ErrorInfo() {
		super();
	}
	
}
