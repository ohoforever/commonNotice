package com.hummingbird.payment.vo;

public class NotifyQueryBodyVO {
	private Integer notifyId;

	public Integer getNotifyId() {
		return notifyId;
	}

	public void setNotifyId(Integer notifyId) {
		this.notifyId = notifyId;
	}

	@Override
	public String toString() {
		return " NotifyQueryBodyVO[notifyId=" + notifyId + "]";
	}
}
