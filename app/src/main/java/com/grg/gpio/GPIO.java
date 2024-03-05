package com.grg.gpio;

import android.zyapi.CommonApi;

public class GPIO {
	
	static CommonApi mCommonApi;  
	
	public static void openGPIO(int a){
		if(mCommonApi==null) {
			mCommonApi = new CommonApi();
		}
		mCommonApi.setGpioOut(a,1);
		mCommonApi.setGpioOut(a,1);
	}
	
	public static void colseGPIO(int a){

		if(mCommonApi==null) {
			mCommonApi = new CommonApi();
		}
	    mCommonApi.setGpioDir(a,1); 
		mCommonApi.setGpioOut(a,0);

	}
	

}
