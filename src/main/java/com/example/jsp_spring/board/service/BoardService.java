package com.example.jsp_spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsp_spring.board.dao.BoardMapper;
import com.example.jsp_spring.board.domain.BoardResponseDTO;
import com.example.jsp_spring.board.domain.UserBoardResponseDTO;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public List<BoardResponseDTO> list(){
        System.out.println("debug >>> BoardService list");
        return boardMapper.listRow();
    }

     public List<UserBoardResponseDTO> history(String id){
        System.out.println("debug >>> BoardService history");
        return boardMapper.myHistoryRow(id);
    }
}
