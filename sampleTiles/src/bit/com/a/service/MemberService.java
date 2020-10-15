package bit.com.a.service;

import java.util.List;

import bit.com.a.dto.MemberDto;

public interface MemberService {

	public boolean addMember(MemberDto dto) throws Exception;
	
	public MemberDto loginMember(MemberDto dto) throws Exception;
	
	public int idCheck(String id) throws Exception;
}
