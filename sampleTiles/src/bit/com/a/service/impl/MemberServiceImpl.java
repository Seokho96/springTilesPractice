package bit.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.MemberDao;
import bit.com.a.dto.MemberDto;
import bit.com.a.service.MemberService;

@Service	// controller, dao 중간에 위치.... DB데이터 가공
public class MemberServiceImpl implements MemberService {

	@Autowired				// ioc
	MemberDao memberDao;	// MemberDao memberDao = new MemberDaoImpl();
	
	@Override
	public boolean addMember( MemberDto dto) throws Exception {		
		boolean isS = memberDao.addMember(dto);
		return isS;
	}

	public MemberDto loginMember(MemberDto dto) throws Exception{
		MemberDto rdto = memberDao.loginMember(dto);
		return rdto;
	}
	
	public int idCheck(String id) throws Exception {
		int count = memberDao.idCheck(id);
		return count;
	}
}





