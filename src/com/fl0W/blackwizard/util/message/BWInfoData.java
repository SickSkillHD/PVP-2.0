package com.fl0W.blackwizard.util.message;

import com.fl0W.blackwizard.main.BWMainClass;

public enum BWInfoData {
	
	IS_USER_PLUS("Du bist jetzt ein §eUSER+"),
	NOT_USER_PLUS_ANYMORE("Du bist jetzt kein §eUSER+ §7mehr!");
	
	private final String info;
	
	private final String symbol = "[INFO]: ";
	
	private BWInfoData(String info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return BWMainClass.prefix + symbol + info;
	}
	
	public String outP() {
		return BWMainClass.prefix + "§cINFO: §7" + info;
	}
	
	public static String prefix() {
		return BWMainClass.prefix + "§7INFO: ";
	}
}
