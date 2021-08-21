package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
//import org.junit.Assert;
import org.junit.Assert;
import ru.job4j.chess.firuges.Cell;
//import org.junit.Test;
import static org.junit.Assert.assertThat;



public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack one =  new BishopBlack(Cell.F8);
        Cell expected = Cell.F8;
        Assert.assertEquals(one.position(), expected);
    }

    public void testCopy() {
        BishopBlack second = new BishopBlack(Cell.F5);
        Cell expected = Cell.F5;
        Assert.assertEquals(second.position(), expected);
    }
}