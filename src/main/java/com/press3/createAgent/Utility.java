package com.press3.createAgent;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Utility {


	 public static void getUploadFile(String filepath) throws InterruptedException, AWTException {
	String s= filepath;
	Thread.sleep(2000);
	setClipboardData(s);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	}

	public static void setClipboardData(String string) throws InterruptedException {
	StringSelection stringSelection = new StringSelection(string);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	Thread.sleep(2000);
	}
}
