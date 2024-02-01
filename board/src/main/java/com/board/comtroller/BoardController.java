package com.board.comtroller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.board.Entity.Board;
import com.board.service.BoardService;

@Controller
public class BoardController {
	
	private BoardService boardService;
	
	public BoardController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	@GetMapping("/add-list")
	public String getAddList(ModelMap model) {
		Board board = new Board(0, "", "", LocalDate.now(), "");
		model.addAttribute("board", board);
		return "addList";
	}
	
	/**
	@PostMapping("/add-list")
	public String postAddList(ModelMap model, Board board) {
		boardService.addNewList(board);
		return "redirect:getBoardList";
	}
	**/
}
