package ua.goit.timonov.practice.practice_3;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Testing class for method parseFullPath
 */
public class UnixPathTest {
    UnixPath unixPath = new UnixPath();

    @Test
    public void testSimplifyNormal_1() {
        String fullPath = "/home/../var/./lib//file.txt";
        String expected = "/var/lib/file.txt";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyNormal_2() {
        String fullPath = "/home/user_kolia/foo/bar.txt";
        String expected = "/home/user_kolia/foo/bar.txt";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyNormal_3() {
        String fullPath = "/home/user_kolia/./foo/../../bar.txt";
        String expected = "/home/bar.txt";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyNormal_4() {
        String fullPath = "/home/user/../var/log/../run/../../file.txt";
        String expected = "/home/file.txt";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyBorder_1() {
        String fullPath = "/file.txt";
        String expected = "/file.txt";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyBorder_2() {
        String fullPath = "/home/user/../var/log/../run/../../../file.txt";
        String expected = "/file.txt";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyBorder_3() {
        String fullPath = "//";
        String expected = "/";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyBorder_4() {
        String fullPath = "/../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../...";
        String expected = "/";
        String actual = unixPath.simplify(fullPath);
        assertEquals(expected, actual);
    }

    @Test(expected = NoSuchElementException.class)
    public void testSimplifyAbnormal_1() {
        String fullPath = "/home/user/../var/../../../file.txt";
        unixPath.simplify(fullPath);
    }
}