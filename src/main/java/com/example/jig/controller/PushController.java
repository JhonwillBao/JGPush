package com.example.jig.controller;

import com.example.jig.dto.JGPushDTO;
import com.example.jig.entity.PushBean;
import com.example.jig.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/push")
public class PushController {
	
	@Autowired
	private PushService pushService;
	
	/**
	 * 推送全部(包括ios和android)
	 * @param pushBean
	 * @return
	 */
	@RequestMapping(value="/all", method=RequestMethod.POST)
	public boolean pushAll(@RequestBody PushBean pushBean) {
		return pushService.pushAll(pushBean);
	}

	/**
	 * 推送指定(包括ios和android)
	 * @param dto
	 * @return
	 */
	@RequestMapping(value="/some", method=RequestMethod.POST)
	public boolean pushSome(@RequestBody JGPushDTO dto) {
		return pushService.pushSome(dto.getPushBean(), dto.getRegisterIds());
	}

	/**
	 * 推送全部ios
	 * @param pushBean
	 * @return
	 */
	@RequestMapping(value="/ios/all", method=RequestMethod.POST)
	public boolean pushIos(PushBean pushBean){
		return pushService.pushIos(pushBean);
	}

	/**
	 * 推送指定ios
	 * @param dto
	 * @return
	 */
	@RequestMapping(value="/ios", method=RequestMethod.POST)
	public boolean pushIos(@RequestBody JGPushDTO dto){
		PushBean pushBean = dto.getPushBean();
		String[] registerIds = dto.getRegisterIds();
		return pushService.pushIos(pushBean, registerIds);
	}

//	@RequestMapping(value="/ios", method=RequestMethod.POST)
//	public boolean pushIos(@RequestParam PushBean pushBean, @RequestParam String[] registerids){
//		return pushService.pushIos(pushBean, registerids);
//	}
	
	/**
	 * 推送全部android
	 * @param pushBean
	 * @return
	 */
	@RequestMapping(value="/android/all", method=RequestMethod.POST)
	public boolean pushAndroid(PushBean pushBean){
		return pushService.pushAndroid(pushBean);
	}
	
	/**
	 * 推送指定android
	 * @param dto
	 * @return
	 */
	@RequestMapping(value="/android", method=RequestMethod.POST)
	public boolean pushAndroid(@RequestBody JGPushDTO dto){
		return pushService.pushAndroid(dto.getPushBean(), dto.getRegisterIds());
	}

}
