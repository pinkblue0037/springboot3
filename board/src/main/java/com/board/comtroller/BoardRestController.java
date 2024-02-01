package com.board.comtroller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.Entity.Board;
import com.board.repository.BoardRepository;
import com.board.service.BoardService;

@RestController
public class BoardRestController {
	
	  public BoardRestController(BoardService boardService) { 
		  super();
		  this.boardService = boardService;
	  }
	  
	  private BoardService boardService;
	  
	  //1. getList
		/*
		 * @RequestMapping("/getBoardList") public List<Board> getList (){ return
		 * boardService.findAll(); }
		 */

	  //1. getList jpa
	  @RequestMapping("/getBoardList") 
	  public List<Board> getList (){
		  return boardService.findAll();
	  }
	 
	//2. update
	
	//3. delete
}
