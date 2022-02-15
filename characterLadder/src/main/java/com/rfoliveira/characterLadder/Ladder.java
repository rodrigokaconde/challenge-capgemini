package com.rfoliveira.characterLadder;

public class Ladder {
    static String buildLadder(int n) {
        String ladder = "";
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                ladder += " ";
            for (int j = 1; j <= i; j++)
                ladder += "*";
            ladder += "\n";
        }
        return ladder;
    }
}
