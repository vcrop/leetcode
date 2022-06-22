package ru.vcrop;

import java.util.Deque;
import java.util.function.Consumer;



interface Token extends Consumer<Deque<Numerical>> {
    enum Priority{
        NONE, LOW, HIGH
    }

    Priority priority();
}

interface Numerical extends Token{
    int intValue();
}

class Digits implements Numerical{

    int value;

    public Digits(int value) {
        this.value = value;
    }

    @Override
    public Priority priority() {
        return Priority.NONE;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public void accept(Deque<Numerical> numerical) {
        numerical.push(this);
    }
}

class OpenBracket implements Token{

    @Override
    public Priority priority() {
        return Priority.NONE;
    }

    @Override
    public void accept(Deque<Numerical> numerical) {
    }
}

class ClosedBracket implements Token{

    @Override
    public Priority priority() {
        return Priority.NONE;
    }

    @Override
    public void accept(Deque<Numerical> numerical) {
    }
}


public class Basic_Calculator_224 {

    public int calculate(String s) {
        return 0;
    }
}
