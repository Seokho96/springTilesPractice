package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.BbsDto;
import bit.com.a.dto.BbsParam;

public interface BbsDao {
	
	public List<BbsDto> BbsList(BbsParam search) throws Exception;
	
	public boolean BbsWrite(BbsDto dto) throws Exception;
	
	public BbsDto BbsDetail(int seq) throws Exception;

	public void BbsDelete(int seq) throws Exception;
	
	public void BbsUpdate(BbsDto dto) throws Exception;

}
