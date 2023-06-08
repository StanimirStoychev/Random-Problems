package Easy;

import java.util.Stack;

public class ValidParentheses {

        public static void main(String[] args) {

            String test1 = "{[()]}";
            printResult(test1);

            String test2 = "{}[]()";
            printResult(test2);

            String test3 = "{)";
            printResult(test3);

            String test4 = "";
            printResult(test4);

            String test5 = "{[(";
            printResult(test5);

            String test6 = "}])";
            printResult(test6);

            String test7 = """
                public class Main {
                        public static void main(String[] args) {
                            System.out.println("Hello World!");
                        }
                    }""";
            printResult(test7);

        }


        static final String DELIMITER = "-";
        private static void printDelimiter() {

            System.out.println(DELIMITER.repeat(20));
        }

        private static void printResult(String test) {
            System.out.println(test + " -> " + isValidParentheses(test));
            printDelimiter();
        }

        private static boolean isValidParentheses(String input) {

            if (input.length() == 0) {
                return false;
            }

            Stack<Character> lastOpen = new Stack<>();

            for (int i = 0; i < input.length(); i++) {

                char currentChar = input.charAt(i);

                if (isClosing(currentChar) && lastOpen.isEmpty()) {
                    return false;
                }

                if (isOpen(currentChar)) {
                    lastOpen.push(currentChar);
                }

                if (isClosing(currentChar) && !isMatching(lastOpen.pop(), currentChar)) {
                    return false;
                }
            }

            return lastOpen.isEmpty();
        }

        private static boolean isOpen(char c) {
            return c == '{' || c == '[' || c == '(';
        }

        private static boolean isClosing(char c) {
            return c == '}' || c == ']' || c == ')';
        }

        private static boolean isMatching(char open, char closing) {

            return open == '{' && closing == '}' ||
                    open == '[' && closing == ']' ||
                    open == '(' && closing == ')';
        }
    }