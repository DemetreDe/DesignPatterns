package com.practice;

import com.practice.memento.Editor;
import com.practice.memento.History;
import com.practice.state.BrushTool;
import com.practice.state.Canvas;
import com.practice.state.EraserTool;
import com.practice.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}