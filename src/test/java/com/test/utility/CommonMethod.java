package com.test.utility;

import com.test.drivers.BaseDriver;

public class CommonMethod extends BaseDriver {
	public static void timeout() throws InterruptedException {
		Thread.sleep(300);
	}
	public static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
}
}
