package CalculatorDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class MyFirstWBA {

	public static void main(String[] args) throws MalformedURLException {
	
		DesktopOptions opt = new DesktopOptions();
		opt.setApplicationPath("C:\\Windows\\System32\\cacls.exe");

		WiniumDriver driver = new WiniumDriver(new URL("https://localhost:9999"), opt);
	}

}
