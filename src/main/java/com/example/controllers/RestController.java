//package com.example.controllers;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.TreeMap;
//
//@RestController
//public class RestController {
//    private TreeMap<Integer, String> todoList;
//
//    public RestController() {
//        todoList = new TreeMap<>();
//        todoList.put(1, "Выучить Java");
//        todoList.put(2, "Заработать $$$$");
//    }
//
//    @GetMapping(path = "/todoList")
//    public TreeMap<Integer, String> getTodoList() {
//        return todoList;
//    }
//
//    @PostMapping(path = "/todoList")
//    public ResponseEntity add(@RequestParam String item) {
//        if (item == null || item.isEmpty()) {
//            return new ResponseEntity(HttpStatus.BAD_REQUEST);
//        }
//
//        @PutMapping(path = "/todoList/{id}")
//        public ResponseEntity put(@PathVariable int id, @RequestParam String item){
//            todoList.put(id, item);
//            return new ResponseEntity(HttpStatus.OK);
//        }
//
//        @DeleteMapping(path = "/todoList/{id}")
//        public ResponseEntity delete(@PathVariable int id){
//            todoList.remove(id);
//            return new ResponseEntity(HttpStatus.OK);
//        }
//    }
//}
