package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack one =  new BishopBlack(Cell.F8);
        assertThat(one.position(), is(Cell.F8));
    }

    @Test
    public void testCopy() {
        BishopBlack second = new BishopBlack(Cell.F5);
       assertThat(second.copy(Cell.F5).position(), is(Cell.F5));
    }

    @Test
    public void testisDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C2);
        boolean check = bishopBlack.isDiagonal(bishopBlack.position(), Cell.E4);
        assertThat(check, is(true));
    }

    @Test
    public void testWay() throws ImpossibleMoveException {
       BishopBlack bishopBlack = new BishopBlack(Cell.C2);
       Cell[] array = bishopBlack.way(Cell.E4);
       Cell[] expected = {Cell.D3, Cell.E4};
       assertThat(expected, is(array));
    }
}