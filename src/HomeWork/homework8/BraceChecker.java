package HomeWork.homework8;
import FullLessons.lesson6.Stack.Stack;

public class BraceChecker {
    String info;
    private Stack stack = new Stack();

    public BraceChecker(String info) {
        this.info = info;
    }

    public void check() {
        for (int i = 0; i < info.length(); i++) {
            if (info.charAt(i) == '[' || info.charAt(i) == '{' || info.charAt(i) == '(') {
                stack.push(info.charAt(i));
            }


            if (info.charAt(i) == ']') {
                if (stack.tos < 0) {
                    System.out.println("Error: closed ] but not opened index = " + i);
                } else {
                    char savepop = (char) stack.pop();
                    if (savepop != '[') {
                        System.out.println("Error: opened " + savepop + " but closed " + info.charAt(i) + " index or " + i);
                    }}}


            if (info.charAt(i) == '}') {
                if (stack.tos < 0) {
                    System.out.println("Error: closed } but not opened index = " + i);
                } else {
                    char savepop = (char) stack.pop();
                    if (savepop != '{') {
                        System.out.println("Error: opened " + savepop + " but closed " + info.charAt(i) + " index or " + i);

                    }}}

            if (info.charAt(i) == ')') {
                if (stack.tos < 0) {
                    System.out.println("Error: closed ) but not opened index = " + i);
                } else {
                    char savepop = (char) stack.pop();
                    if (savepop != '(') {
                        System.out.println("Error: opened " + savepop + " but closed " + info.charAt(i) + " index or " + i);

                    }}}


        }

        while(stack.tos >= 0){
            char save = (char) stack.pop();
            System.out.println("Error: была открыта скобка " + save + " но нет закрывающей ее скобки");
            }
        }


    }
