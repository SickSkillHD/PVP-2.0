package com.fl0W.blackwizard.util.message;

import com.fl0W.blackwizard.main.BWMainClass;

public enum BWErrorData {
	
	UNKNOWN("Ein Fehler ist aufgetreten!"),
	CLAN_EXISTS("Dieser Clan existiert bereits!"),
	CLAN_TAG_EXISTS("Dieser Clantag existiert bereits!"),
	NO_PLAYER("Du bist kein Spieler!"),
	NOT_AVAIBLE_IN_REGION("Deine Angabe kann nicht in dieser Region ausgeführt werden!"),
	NUMBER("Du musst eine Zahl angeben!"),
	ALREADY_IN_CLAN("Dieser Spieler ist bereits in einem Clan!"),
	ALREADY_IN_CLAN_PLAYER("Du bist bereits in einem Clan!"),
	NOT_ONLINE("Dieser Spieler ist nicht online!"),
	NO_CLAN("Du besitzt keinen Clan"),
	NO_ITEM_IN_HAND("Du hast kein Item in deiner Hand!"),
	ITEM_ALREADY_ENCHANTED("Das Item ist bereits enchanted!"),
	ITEM_NOT_EQUAL_TO_HARMOR("Das Item in deiner Hand entspricht keiner Art von Pferderüstung!"),
	TOO_LESS_MONEY("Du hast zu wenig Coins!"),
	TOO_LESS_MONEY_OF_ENTITY("Dieser Spieler hat zu wenig Geld!"),
	TOO_LESS_MONEY_ON_ECO("Dein Clan hat zu wenig Money!"),
	PERMISSION("Du hast keine Berechtigung!"), 
	WRONG_INPUT("Deine Angabe ist ungültig!"), 
	NOT_REGISTERED("Dieses Element ist nicht in der Library erfasst!"),
	NOT_IMPLEMENTED("Dieses Element wurde noch nicht eingebunden!"),
	CONTACT_STAFF("Bitte kontaktiere das Team!"),
	AVAIBLE_SPAWNER_TYPES("Zulässige Typen - Zombie, Pig, Cow, Spider, Skeleton");
	
	private final String error;
	
	public static String err = BWMainClass.prefix + "§7Fehler: §c";
	
	private BWErrorData(String error) {
		this.error = BWMainClass.prefix + "§7Fehler: §c" + error;
	}
	
	private String getName() {
		return error;
	}
	
	@Override
	public String toString() {
		return error;
	}
}
