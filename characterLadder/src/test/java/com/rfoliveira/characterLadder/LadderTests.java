package com.rfoliveira.characterLadder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderTests {
    @Test
    public void TestBuildLadderNEqualsOne(){
        String ladder = Ladder.buildLadder(1);
        assertEquals("*", ladder);
    }

    @Test
    public void TestBuildLadderNLargerOne(){
        String ladder = Ladder.buildLadder(3);
        assertEquals("  *\n **\n***", ladder);
    }

    @Test
    public void TestBuildLadderNEqualsZero(){
        String ladder = Ladder.buildLadder(0);
        assertEquals("", ladder);
    }

    @Test
    public void TestBuildLadderNSmallerZero(){
        String ladder = Ladder.buildLadder(-1);
        assertEquals("", ladder);
    }

    @Test
    public void TestBuildLadderExample(){
        String ladder = Ladder.buildLadder(6);
        assertEquals("     *\n    **\n   ***\n  ****\n *****\n******", ladder);
    }

}
