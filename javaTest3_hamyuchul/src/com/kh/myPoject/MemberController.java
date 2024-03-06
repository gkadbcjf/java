package com.kh.myPoject;

import java.util.HashMap;
import java.util.Set;

public class MemberController {
	public HashMap<String, Member> map = new HashMap();

	public boolean joinMembership(String id, Member m) { //회원가입한 사용자 MAP에 저장
		if (map.containsKey(id)) 
			return false;
		else {
			map.put(id, m);
			int result =new LMemberService().insertLMember(id,m);
			if(result>0)
				return true;
			else
				return false;
		}
		

	}

	public String login(String id, String password) { //사용자 로그인

		if(map.containsKey(id)) {
			Member mb = map.get(id);
			if(mb.getPassword().equals(password))
				return mb.getName();  
		}
		return null;
	}

	public boolean changePassword(String id, String oldPw, String newPw) { //사용자 비번 변경
		if(map.containsKey(id)) {
			Member br =map.get(id);
			if(br.getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				int result = new LMemberService().changePassword(id,newPw);
				if(result>0) {
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}

	public void changeName(String id, String newName) { //사용자 이름 변경
		if(map.containsKey(id)) {
			
			map.get(id).setName(newName);
			new LMemberService().changeName(id,newName);
			
		}
	}

	public void printMember() { // 사용자 전체출력
		Set<String>keys =map.keySet();
		for(String key :keys) {
			Member m =map.get(key);
			System.out.println(m.getName()+"-"+key+'\n');
		}
	}
	
	
}
