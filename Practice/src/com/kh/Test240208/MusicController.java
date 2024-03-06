package com.kh.Test240208;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.naming.ldap.SortControl;

public class MusicController {
	List<Music> list = new ArrayList<Music>();

	public int addList(Music music) {

		if (list.size() == 0) {
			list.add(0, music);
		} else
			list.add(list.size(), music);

		return 1;
	}

	public int addAtZero(Music music) {
		// 첫 번째 리스트에 객체 저장, 1 리턴
		list.add(0, music);
		return 1;
	}

	public List printAll() {
		return list;
		// List 반환
	}

	public Music searchMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		for (int i = 0; i < list.size(); i++) {
			if (((Music) (list.get(i))).getTitle().equals(title))
				return (Music) (list.get(i));
		}
		return null;
	}

	public Music removeMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		for (int i = 0; i < list.size(); i++) {
			if (((Music) (list.get(i))).getTitle().equals(title))
				return (Music) (list.remove(i));
		}
		return null;
	}

	public Music setMusic(String title, Music music) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		for (int i = 0; i < list.size(); i++) {
			if (((Music) (list.get(i))).getTitle().equals(title))
				return (Music) (list.set(i, music));
		}
		return null;
	}

	public int ascTitle() {
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		list.sort(new AscTitle());
		return 1;

	}

	public int descSinger() {
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		
		list.sort((o1, o2) -> ((Music) o2).getSinger().compareTo(((Music) o1).getSinger()));
		return 1;
	}
}
