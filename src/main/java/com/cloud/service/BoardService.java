package com.cloud.service;

import java.util.List;

import com.cloud.vo.BoardVO;


public interface BoardService {

	  public void insert(BoardVO board) throws Exception;

	  public BoardVO read(Integer bno) throws Exception;

	  public void update(BoardVO board) throws Exception;
	  
	  public void updateHit(Integer bno) throws Exception;

	  public void delete(Integer bno) throws Exception;

	  public List<BoardVO> listAll() throws Exception;
	
	
}
