package bit.com.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dao.MemberDao;
import bit.com.a.dto.MemberDto;

@Repository	// = 저장소
public class MemberDaoImpl implements MemberDao {

	@Autowired		// DI
	SqlSession sqlSession;		// SqlSession sqlSession = new SqlSessiontemplate();
	
	String namespace = "Member.";
	
	@Override
	public boolean addMember(MemberDto dto) throws Exception {
		 
		 try {
			 sqlSession.insert(namespace + "addMember", dto);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			
		}
	    return true;
	}
	
	@Override
	public MemberDto loginMember(MemberDto dto) throws Exception {
		MemberDto rdto = sqlSession.selectOne(namespace+"loginMember", dto);
		return rdto;
	}
	
	@Override
	public int idCheck(String id) throws Exception {
		int count = sqlSession.selectOne(namespace + "idCheck", id);
		return count;
	}

	
}









