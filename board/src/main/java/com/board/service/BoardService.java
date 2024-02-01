package com.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.Entity.Board;
import com.board.repository.BoardRepository;

@Service
public class BoardService {
	
	public BoardService(BoardRepository boardRepository) {
		super();
		this.boardRepository = boardRepository;
	}
	
	private BoardRepository boardRepository;

	public List<Board> findAll(){
		return boardRepository.findAll();
	}
	
	/**
	public List<Board> addNewList(Board board){
		lists.add(new Board(7, board.getTitle(), board.getDesc(), LocalDate.now(), "admin"));
		return lists;
	}
	**/
}
