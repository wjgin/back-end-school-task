package com.backendschool.task.taskSix;

import java.util.*;

public class CommandMapper {

    static final CommandMapper commandMapper = new CommandMapper();
    BoardRepository boardRepository = BoardRepository.getBoardRepository();

    protected CommandMapper() {}

    public static CommandMapper getCommandMapper() {
        return commandMapper;
    }

    public boolean executeCommand(String command) {
        if (command.equals("등록")) return register();
        else if (command.equals("목록")) return getAll();
        else if (command.equals("종료")) return exitProgram();
        return true;
    }

    public boolean exitProgram() {
        System.out.println("프로그램을 종료합니다.");
        return false;
    }

    public boolean getAll() {
        ArrayList<Map> boardList = boardRepository.getBoardList();
        StringBuilder sb = new StringBuilder();

        int index = boardList.size();
        sb.append("번호 / 제목\n-------------------");
        while (index > 0) {
            Map board = boardList.get(index - 1);
            sb.append("\n" + index + " / " + board.get("제목"));
            index --;
        }
        System.out.println(sb);
        return true;
    }

    public boolean register() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Map> boardList = boardRepository.getBoardList();
        HashMap<String, String> board = new HashMap<>();

        System.out.print("제목 : ");
        String title = scanner.nextLine();
        System.out.print("내용 : ");
        String content = scanner.nextLine();

        board.put("제목", title);
        board.put("내용", content);

        boolean add = boardList.add(board);
        if (add) {
            int index = boardList.size();
            System.out.println("[알림] " + index + "번글이 등록되었습니다.");
        }
        return true;
    }
}
