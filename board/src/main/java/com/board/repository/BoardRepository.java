package com.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.board.Entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer>{

}
