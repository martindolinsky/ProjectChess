package sk.itsovy.dolinsky.chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Martin Dolinsky
 */
class ChessTest {
	Chess chess;

    @BeforeEach
    void setUp() {
    	chess = new Chess();
    }

    @Test
    void normalize() {
    	assertEquals("A1",chess.normalize("1a"));
    	assertEquals("A2",chess.normalize("2a"));
    	assertEquals("A3",chess.normalize("3a"));
    	assertEquals("A4",chess.normalize("4a"));
    	assertEquals("A5",chess.normalize("5a"));
    	assertEquals("A6",chess.normalize("6a"));
    	assertEquals("A7",chess.normalize("7a"));
    	assertEquals("A8",chess.normalize("8a"));

    	assertEquals("B1",chess.normalize("1b"));
    	assertEquals("B2",chess.normalize("2b"));
    	assertEquals("B3",chess.normalize("3b"));
    	assertEquals("B4",chess.normalize("4b"));
    	assertEquals("B5",chess.normalize("5b"));
    	assertEquals("B6",chess.normalize("6b"));
    	assertEquals("B7",chess.normalize("7b"));
    	assertEquals("B8",chess.normalize("8b"));

    	assertEquals("C1",chess.normalize("1c"));
    	assertEquals("C2",chess.normalize("2c"));
    	assertEquals("C3",chess.normalize("3c"));
    	assertEquals("C4",chess.normalize("4c"));
    	assertEquals("C5",chess.normalize("5c"));
    	assertEquals("C6",chess.normalize("6c"));
    	assertEquals("C7",chess.normalize("7c"));
    	assertEquals("C8",chess.normalize("8c"));

    	assertEquals("D1",chess.normalize("1d"));
    	assertEquals("D2",chess.normalize("2d"));
    	assertEquals("D3",chess.normalize("3d"));
    	assertEquals("D4",chess.normalize("4d"));
    	assertEquals("D5",chess.normalize("5d"));
    	assertEquals("D6",chess.normalize("6d"));
    	assertEquals("D7",chess.normalize("7d"));
    	assertEquals("D8",chess.normalize("8d"));

    	assertEquals("E1",chess.normalize("1e"));
    	assertEquals("E2",chess.normalize("2e"));
    	assertEquals("E3",chess.normalize("3e"));
    	assertEquals("E4",chess.normalize("4e"));
    	assertEquals("E5",chess.normalize("5e"));
    	assertEquals("E6",chess.normalize("6e"));
    	assertEquals("E7",chess.normalize("7e"));
    	assertEquals("E8",chess.normalize("8e"));

    	assertEquals("F1",chess.normalize("1f"));
    	assertEquals("F2",chess.normalize("2f"));
    	assertEquals("F3",chess.normalize("3f"));
    	assertEquals("F4",chess.normalize("4f"));
    	assertEquals("F5",chess.normalize("5f"));
    	assertEquals("F6",chess.normalize("6f"));
    	assertEquals("F7",chess.normalize("7f"));
    	assertEquals("F8",chess.normalize("8f"));

    	assertEquals("G1",chess.normalize("1g"));
    	assertEquals("G2",chess.normalize("2g"));
    	assertEquals("G3",chess.normalize("3g"));
    	assertEquals("G4",chess.normalize("4g"));
    	assertEquals("G5",chess.normalize("5g"));
    	assertEquals("G6",chess.normalize("6g"));
    	assertEquals("G7",chess.normalize("7g"));
    	assertEquals("G8",chess.normalize("8g"));

    	assertEquals("H1",chess.normalize("1h"));
    	assertEquals("H2",chess.normalize("2h"));
    	assertEquals("H3",chess.normalize("3h"));
    	assertEquals("H4",chess.normalize("4h"));
    	assertEquals("H5",chess.normalize("5h"));
    	assertEquals("H6",chess.normalize("6h"));
    	assertEquals("H7",chess.normalize("7h"));
    	assertEquals("H8",chess.normalize("8h"));

    	assertNull(chess.normalize("A9"));
    	assertNull(chess.normalize("9a"));
    	assertNull(chess.normalize("10a"));
    	assertNull(chess.normalize("10j"));
    	assertNull(chess.normalize("10@"));
    	assertNull(chess.normalize("2@"));
    	assertNull(chess.normalize(null));
    }

    @Test
    void checkBishop() {
    	assertTrue(chess.checkBishop("C1","D2"));
    	assertTrue(chess.checkBishop("C1","2b"));
    	assertTrue(chess.checkBishop("4d","1g"));
    	assertTrue(chess.checkBishop("4d","8h"));
    	assertTrue(chess.checkBishop("4d","7a"));
    	assertTrue(chess.checkBishop("4d","1a"));
    	assertTrue(chess.checkBishop("1f","2e"));
    	assertTrue(chess.checkBishop("1f","2g"));
    	assertTrue(chess.checkBishop("f1","6a"));
    	assertTrue(chess.checkBishop("f1","3h"));
    	assertTrue(chess.checkBishop("4e","8a"));
    	assertTrue(chess.checkBishop("4e","7h"));

    	assertFalse(chess.checkBishop("4e","6a"));
    	assertFalse(chess.checkBishop("1c","3c"));
    	assertFalse(chess.checkBishop("1c","5c"));
    	assertFalse(chess.checkBishop("1c","7c"));
    	assertFalse(chess.checkBishop("1f","3f"));
    	assertFalse(chess.checkBishop("1f","5h"));
    	assertFalse(chess.checkBishop("1f",null));
    }

    @Test
    void checkKing() {
    	assertTrue(chess.checkKing("e1","2f"));
    	assertTrue(chess.checkKing("e1","2d"));
    	assertTrue(chess.checkKing("e3","4d"));
    	assertTrue(chess.checkKing("e3","4e"));
    	assertTrue(chess.checkKing("e3","4f"));
    	assertTrue(chess.checkKing("e3","3d"));
    	assertTrue(chess.checkKing("e3","3f"));
    	assertTrue(chess.checkKing("e3","2d"));
    	assertTrue(chess.checkKing("e3","2e"));
    	assertTrue(chess.checkKing("e3","3f"));
    	assertTrue(chess.checkKing("e3","3f"));

    	assertFalse(chess.checkKing("e3","5e"));
    	assertFalse(chess.checkKing("e3","5f"));
    	assertFalse(chess.checkKing("e3",null));
    }

    @Test
    void checkQueen() {
    	assertTrue(chess.checkQueen("d1","d8"));
    	assertTrue(chess.checkQueen("d1","1a"));
    	assertTrue(chess.checkQueen("d1","1h"));
    	assertTrue(chess.checkQueen("d1","4a"));
    	assertTrue(chess.checkQueen("d1","5h"));
    	assertTrue(chess.checkQueen("d4","4h"));
    	assertTrue(chess.checkQueen("d4","4a"));
    	assertTrue(chess.checkQueen("d4","1a"));
    	assertTrue(chess.checkQueen("d4","7a"));
    	assertTrue(chess.checkQueen("d4","8h"));
    	assertTrue(chess.checkQueen("d4","1g"));
    	assertTrue(chess.checkQueen("d4","1d"));
    	assertTrue(chess.checkQueen("d4","8d"));

    	assertFalse(chess.checkQueen("d4","f5"));
    	assertFalse(chess.checkQueen("d4","h5"));
    	assertFalse(chess.checkQueen("d4","c2"));
    	assertFalse(chess.checkQueen("d4","2e"));
    	assertFalse(chess.checkQueen("d4","6a"));
    	assertFalse(chess.checkQueen("d4",null));
    }

    @Test
	void checkRook() {
		assertTrue(chess.checkRook("d5","e5"));
		assertTrue(chess.checkRook("d5","f5"));
		assertTrue(chess.checkRook("d5","g5"));
		assertTrue(chess.checkRook("d5","h5"));
		assertTrue(chess.checkRook("d5","a5"));
		assertTrue(chess.checkRook("d5","b5"));
		assertTrue(chess.checkRook("d5","c5"));
		assertTrue(chess.checkRook("d5","d8"));
		assertTrue(chess.checkRook("d5","d7"));
		assertTrue(chess.checkRook("d5","d6"));
		assertTrue(chess.checkRook("d5","d4"));
		assertTrue(chess.checkRook("d5","d3"));
		assertTrue(chess.checkRook("d5","d2"));
		assertTrue(chess.checkRook("d5","d1"));

		assertFalse(chess.checkRook("d5","e8"));
		assertFalse(chess.checkRook("d5","h8"));
		assertFalse(chess.checkRook("d5","a8"));
		assertFalse(chess.checkRook("d5","d5"));
		assertFalse(chess.checkRook("d5","f1"));
		assertFalse(chess.checkRook("d5","f4"));
		assertFalse(chess.checkRook("d5","b4"));
		assertFalse(chess.checkRook("d5","g14"));
		assertFalse(chess.checkRook("d5",null));
		assertFalse(chess.checkRook("d5","d18"));
		assertFalse(chess.checkRook("d5","25"));
		assertFalse(chess.checkRook("d5","ff"));
	}

    @Test
    void checkKnight() {
    	assertTrue(chess.checkKnight("b1","3a"));
    	assertTrue(chess.checkKnight("b1","3c"));
    	assertTrue(chess.checkKnight("b1","2d"));
    	assertTrue(chess.checkKnight("g1","3h"));
    	assertTrue(chess.checkKnight("g1","3f"));
    	assertTrue(chess.checkKnight("g1","2e"));
    	assertTrue(chess.checkKnight("4e","2f"));
    	assertTrue(chess.checkKnight("4e","2d"));
    	assertTrue(chess.checkKnight("4e","6f"));
    	assertTrue(chess.checkKnight("4e","6d"));
    	assertTrue(chess.checkKnight("4e","5c"));
    	assertTrue(chess.checkKnight("4e","5g"));
    	assertTrue(chess.checkKnight("4e","3g"));
    	assertTrue(chess.checkKnight("4e","3c"));

    	assertFalse(chess.checkKnight("4e","5d"));
    	assertFalse(chess.checkKnight("4e","5e"));
    	assertFalse(chess.checkKnight("4e","5f"));
    	assertFalse(chess.checkKnight("4e","6c"));
    	assertFalse(chess.checkKnight("4e","6g"));
    	assertFalse(chess.checkKnight("4e","1b"));
    	assertFalse(chess.checkKnight("4e","1h"));
    	assertFalse(chess.checkKnight("4e",null));
    }
}
