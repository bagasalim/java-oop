package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showToDoList() {

        Todolist[] model = todolistRepository.getAll();

        System.out.println("TO DO LIST");
        for (int i = 0; i < model.length; i++) {
            Todolist todolist = model[i];
            int No = i + 1;

            if (todolist != null) {
                System.out.println(No + ". " + todolist.getTodo());
            }
        }
    }

    @Override
    public void addToDoList(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("Berhasil Menambah Todo: " + todo);
    }

    @Override
    public void deleteToDoList(Integer number) {
        boolean success = todolistRepository.delete(number);

        if (success) {
            System.out.println("Berhasil Menghapus Todo: " + number);
        } else {
            System.out.println("Gagal Menghapus Todo: " + number);
        }
    }
}
