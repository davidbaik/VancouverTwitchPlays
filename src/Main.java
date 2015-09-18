public class Main {
	public static void main(String[] args) {
		TwitchBot bot = new TwitchBot();
		AuthKey key = new AuthKey();
		bot.setVerbose(true);
		try {			
			bot.connect("irc.twitch.tv", 6667, key.getKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
		bot.joinChannel("#vancouvertwitchplays");
	}
}
