package com.example.jig.dto;
import com.example.jig.entity.PushBean;
public class JGPushDTO {

    //应用pushNo数组
    private String[] registerIds;
    //消息构造
    private PushBean pushBean;
    public JGPushDTO() {	}
    public String[] getRegisterIds() {
        return registerIds;
    }
    public void setRegisterIds(String[] registerIds) {
        this.registerIds = registerIds;
    }
    public PushBean getPushBean() {
        return pushBean;
    }
    public void setPushBean(PushBean pushBean) {
        this.pushBean = pushBean;
    }
}
