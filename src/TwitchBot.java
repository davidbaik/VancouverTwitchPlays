import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;

import org.jibble.pircbot.*;

public class TwitchBot extends PircBot {
	private static FileWriter fw = null;
	
	public TwitchBot() {
		this.setName("VancouverTwitchPlays");
		try {
			initLog();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void initLog() throws IOException {
		fw = new FileWriter("log.txt");
		fw.close();
		fw = new FileWriter("log.txt");
		fw.close();
		fw = new FileWriter("log.txt");
		fw.close();
		fw = new FileWriter("log.txt");
		fw.close();
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message) {
		boolean validMsg = false;
		if (message.equalsIgnoreCase("up")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_W);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_W);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("down")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_S);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_S);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("left")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_A);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_A);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("right")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_D);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_D);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("a")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_K);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_K);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("b")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_J);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_J);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("l")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_U);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_U);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("r")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_I);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_I);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("start")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_B);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_B);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (message.equalsIgnoreCase("select")) {
			validMsg = true;
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_V);
				r.delay(325);
				r.keyRelease(KeyEvent.VK_V);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (validMsg) {
			String name = null;
			
			if (sender.length() >= 10) {
				name = sender.substring(0, 9) + "..";
			} else {
				name = sender;
			}
			
			try {
				writeMsg("<" + name + "> " + message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void writeMsg(String msg) throws IOException {
		try {
			fw = new FileWriter("log.txt", true);
			fw.append(msg + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
