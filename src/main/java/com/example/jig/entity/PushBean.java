package com.example.jig.entity;

import lombok.Data;

import java.util.Map;
@Data
public class PushBean {

	// 必填, 通知内容, 内容可以为空字符串，则表示不展示到通知栏。
	private String alert;
	// iOS10+使用// 可选, 通知副标题。
	private String subtitle;
	// 可选, 如果无此字段，则此消息无声音提示；有此字段，如果找到了指定的声音就播放该声音，否则播放默认声音,如果此字段为空字符串，iOS 7 为默认声音，iOS 8及以上系统为无声音。(消息) 说明：JPush 官方 API Library (SDK) 会默认填充声音字段。提供另外的方法关闭声音。
	private String sound;
	// 可选, 附加信息, 供业务使用。
	private Map<String, String> extras;
	//android专用// 可选, 通知标题	如果指定了，则通知里原来展示 App名称的地方，将展示成这个字段。
	private String title;
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	public Map<String, String> getExtras() {
		return extras;
	}
	public void setExtras(Map<String, String> extras) {
		this.extras = extras;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() { return subtitle; }
	public void setSubtitle(String subtitle) { this.subtitle = subtitle; }
}
