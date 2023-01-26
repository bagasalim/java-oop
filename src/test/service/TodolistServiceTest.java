package test.service;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {

    public static void main(String[] args) {
        testDeleteTodoList();
    }

    public static void testShowTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showToDoList();
    }

    public static void testAddTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addToDoList("Belajar Java OOP");
        todolistService.addToDoList("Membuat Aplikasi TodoList");

        todolistService.showToDoList();
    }

    public static void testDeleteTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addToDoList("Belajar Java OOP");
        todolistService.addToDoList("Membuat Aplikasi TodoList");

        todolistService.showToDoList();

        todolistService.deleteToDoList(5);
        todolistService.deleteToDoList(1);

        todolistService.showToDoList();
    }
}
