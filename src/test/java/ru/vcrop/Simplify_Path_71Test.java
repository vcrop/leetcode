package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Simplify_Path_71Test {

    Simplify_Path_71 simplify_path_71;

    @BeforeEach
    void setUp() {
        simplify_path_71 = new Simplify_Path_71();
    }

    @Test
    void simplifyPath1() {
        Assertions.assertEquals("/c", simplify_path_71.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    void simplifyPath2() {
        Assertions.assertEquals("/home", simplify_path_71.simplifyPath("/home/"));
    }

    @Test
    void simplifyPath3() {
        Assertions.assertEquals("/", simplify_path_71.simplifyPath("/../"));
    }

    @Test
    void simplifyPath4() {
        Assertions.assertEquals("/home/foo", simplify_path_71.simplifyPath("/home//foo/"));
    }
}