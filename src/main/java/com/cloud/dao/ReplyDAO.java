package com.cloud.dao;


import java.util.List;

import com.cloud.vo.ReplyVO;


public interface ReplyDAO {

	public List<ReplyVO> selectReplies(Integer bno) throws Exception;

	public void insertReply(ReplyVO vo) throws Exception;

	public void updateReply(ReplyVO vo) throws Exception;

	public void deleteReply(Integer no) throws Exception;

	public int countReplies(Integer board_No) throws Exception;

}
