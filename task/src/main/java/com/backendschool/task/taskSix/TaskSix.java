package com.backendschool.task.taskSix;

import java.util.Scanner;

public class TaskSix {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CommandMapper commandMapper = CommandMapper.getCommandMapper();
        boolean needAnotherCommand = true;

        while (needAnotherCommand) {
            System.out.print("명령어 ) ");
            String command = scanner.nextLine();
            needAnotherCommand = commandMapper.executeCommand(command.strip());
        }
        scanner.close();
    }
}
