package com.xinma.base.core.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

public class ErrorFiledEO implements Serializable {

	private static final long serialVersionUID = -8178546814501086639L;

	@JsonProperty("code")
	@JsonView(BaseView.Base.class)
	private String code;

	@JsonProperty("msg")
	@JsonView(BaseView.Base.class)
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorFiledEO() {
		super();
	}

	public ErrorFiledEO(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorFiledEO other = (ErrorFiledEO) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ErrorFiledDTO [code=" + code + ", message=" + message + "]";
	}

}
