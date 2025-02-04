package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyService {
	public int register(ReplyVO vo);

	public ReplyVO get(Long rno);

	public int modify(ReplyVO vo);

	public int remove(Long rno);
	
    // 특정 게시글의 댓글을 페이징하여 가져오는 메서드
	public List<ReplyVO> getList(Criteria cri, Long bno);
}
