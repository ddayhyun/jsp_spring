package com.example.jsp_spring.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.jsp_spring.board.domain.BoardResponseDTO;
import com.example.jsp_spring.board.domain.UserBoardResponseDTO;
@Mapper
public interface BoardMapper {
    
    public List<BoardResponseDTO> listRow();
    public List<UserBoardResponseDTO> myHistoryRow(String id);
}
