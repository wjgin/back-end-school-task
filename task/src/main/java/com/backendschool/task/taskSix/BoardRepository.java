package com.backendschool.task.taskSix;

import java.util.ArrayList;
import java.util.Map;

public class BoardRepository {
    static ArrayList<Map> boardList = new ArrayList<>();
    static final BoardRepository boardRepository = new BoardRepository();

    static public BoardRepository getBoardRepository(){
        return boardRepository;
    }

    public ArrayList<Map> getBoardList() {
        return boardList;
    }
}
