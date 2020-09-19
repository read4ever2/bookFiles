package ch02.apps;

import ch02.stacks.ArrayBoundedStack01;
import ch02.stacks.StackInterface;

public class StackDriver {
  public static void main(String[] args) {
    StackInterface<String> test;
    test = new ArrayBoundedStack01<String>();
  }
}