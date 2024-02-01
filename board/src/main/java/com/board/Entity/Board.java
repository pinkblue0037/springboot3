package com.board.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Board {
	
	public Board() {
		
	}
	
	public Board(int num, String title, String description, LocalDate date, String writer) {
		super();
		this.num = num;
		this.title = title;
		this.description = description;
		this.date = date;
		this.writer = writer;
	}
	
	@Id
	@GeneratedValue
	private int num;
	private String title;
	private String description;
	private LocalDate date;
	private String writer;
}
