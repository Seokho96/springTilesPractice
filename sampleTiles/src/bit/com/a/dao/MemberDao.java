package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.MemberDto;

public interface MemberDao {

	public boolean addMember(MemberDto dto) throws Exception;
	
	public MemberDto loginMember(MemberDto dto) throws Exception;
	
	public int idCheck(String id) throws Exception;
}
