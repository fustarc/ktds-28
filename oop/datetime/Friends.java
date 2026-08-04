package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Friends {

	private List<Friend> friendList;

	public Friends() {
		this.friendList = new ArrayList<>();
	}

	public void addFriend(Friend friend) {
		this.friendList.add(friend);
	}

	public Friend get(int index) {
		if (index >= this.friendList.size() && index < 0) {
			return null;
		}
		return this.friendList.get(index);
	}

	/**
	 * 생일이 다가오거나, 생일이거나, 생일이 지난 친구 찾아 반환
	 * @param days 범위
	 * @return 
	 */
	
	
	public List<Friend> findFriendsBy(int days) {
		List<Friend> foundFriends = new ArrayList<>();
		LocalDate now = LocalDate.now();
		
				
		// 오늘 날짜에서 days 일 이전의 날짜 구한다.
		LocalDate past = now.plusDays(-days);
		// 오늘 날짜에서 days 일 이후의 날짜 구한다.
		LocalDate future = now.plusDays(days);
		// 친구들의 생일 날짜에서 연도만 현재로 바꾼다.
		
		LocalDate birthdate = null;
		Friend friend = null;
		for (int i = 0; i < this.friendList.size(); i++) {
			friend = this.friendList.get(i);
			
			birthdate = friend.getBirthdate().withYear( now.getYear() );
			
			if (birthdate.isAfter(past) && birthdate.isBefore(now)) {
				// 친구들의 생일이 오늘의 days 일 이전날짜보다 이후이면서, 오늘보다 이전이면 foundFriends에 추가.
				foundFriends.add(friend);
			} else if (birthdate.isBefore(future) && birthdate.isAfter(now)) {
				// 친구들의 생일이 오늘의 days 일 이후날짜보다 이전이면서, 오늘보다 이후이면 foundFriends에 추가.
				foundFriends.add(friend);
			} else if (birthdate.isEqual(now)) {
				// 친구들의 생일이 오늘과 같으면 foundFriends에 추가.
				foundFriends.add(friend);
			}
			
		}
		
		
		
		
		
		
		return foundFriends;
	}

	@Override
	public String toString() {
		return "Friends [friendList=" + friendList + "]";
	}

}
