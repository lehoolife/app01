package com.psd.app01.util;

import android.media.MediaPlayer;

/**
 * ý�岥��
 * @author YuF
 */
public class MediaUtil {
	private static MediaPlayer player = null;

	/**
	 * ����
	 * 
	 * @param path
	 */
	public static void play(String path) {
		// path = "http://127.0.0.1:8080/1.mp3";
		try {
			if (player == null) {
				player = new MediaPlayer();
				player.setDataSource(path);
				player.prepare();
			}
			player.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ֹͣ
	 * 
	 * @param path
	 */
	public static void pause() {
		try {
			if (player != null && player.isPlaying()) {
				player.pause();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ֹͣ
	 * 
	 * @param path
	 */
	public static void stop() {
		try {
			if (player != null) {
				player.stop();
				player.reset();
				player.release();
				player = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
