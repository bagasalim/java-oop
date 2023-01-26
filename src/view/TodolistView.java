package view;

import service.TodolistService;
import utility.InputUtil;

public class TodolistView {
    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodoList(){
        while (true){
            System.out.println("To Do List");
            todolistService.showToDoList();
            System.out.println("Menu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            String input = InputUtil.input("Pilih: ");

            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                deleteTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilih input yang valid");
            }
        }

    }

    public void addTodoList(){
        System.out.println("Tambah To Do List");

        String todo = InputUtil.input("Todo (x) Jika Batal");

        if (todo.equals("x")){

        } else{
           todolistService.addToDoList(todo);
        }
    }

    public void deleteTodoList(){
        System.out.println("Menghapus Todo List");
        String number = InputUtil.input("Input Nomor Todo yang Ingin Dihapus (x) Jika Batal");

        if (number.equals("x")){

        } else{
            todolistService.deleteToDoList(Integer.valueOf(number));
        }
    }
}
