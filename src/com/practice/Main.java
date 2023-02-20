package com.practice;

import com.practice.memento.Editor;
import com.practice.memento.History;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("1");
        history.push(editor.createState());
        editor.setContent("2");
        history.push(editor.createState());
        editor.setContent("3");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}