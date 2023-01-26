package test.view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class TodolistViewTest {
    public static void main(String[] args) {
        testDeleteTodoList();
    }

    public static void testShowTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addToDoList("Belajar Java");
        todolistService.addToDoList("Belajar Javascript");
        todolistService.addToDoList("Belajar Standar Classes Java");

        todolistView.showTodoList();
    }

    public static void testAddTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);


        todolistView.addTodoList();
        todolistView.showTodoList();
        todolistView.addTodoList();
    }

    public static void testDeleteTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addToDoList("Belajar Java");
        todolistService.addToDoList("Belajar Javascript");
        todolistService.addToDoList("Belajar Standar Classes Java");

        todolistView.showTodoList();
        todolistView.deleteTodoList();
    }
}
