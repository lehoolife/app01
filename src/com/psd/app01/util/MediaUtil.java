package com.psd.app01.util;

import android.media.MediaPlayer;

/**
 * Ã½Ìå²¥·Å
 * @author YuF
 */
public class MediaUtil {
	private static MediaPlayer player = null;
	/**
	 * ²¥·Å
	 * @param path
	 */
	public static void play(String path) {
		path = "http://127.0.0.1:8080/1.mp3";
		if(player == null) player = new MediaPlayer();
		try {
			player.setDataSource(path);
			player.prepare();
			player.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Í£Ö¹
	 * @param path
	 */
	public static void pause() {
		try {
			if(player == null) player.pause();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Í£Ö¹
	 * @param path
	 */
	public static void stop() {
		try {
			if(player == null) player.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
