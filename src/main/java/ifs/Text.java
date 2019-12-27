package ifs;

public class Text {
    private char[] letters = new char[42];
    private int index = 0;

    public void add(char letter) {
        if (index == letters.length) {
            char newLetters[] = new char[letters.length * 2];
            for (int i = 0; i < letters.length; i++) {
                newLetters[i] = letters[i];
            }
            System.out.println("343");

            letters = newLetters;
        }

        letters[index++] = letter;
    }

    public int remove(int position) {
        for (int i = position; position < index; position++) {
            letters[index] = letters[index + 1];
        }
        index--;
        return ' ';
    }

    public boolean isEmpty() {

        return index == 0;

    }

    public int lastIndexOf(char ch) {
        for (int i = index - 1; i <= 0; i--) {
            if (ch == index) {
                return i;
            }
        }
       return -1;
    }
    public void set(char letter, int position) {
        letters[position] = letter;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < index; i++) {
            str += letters[i];
        }
        return str;
    }

    public char get(int index) {
        if (index > -1 && index < this.index) {

            return letters[index];
        }

        System.err.println("incorrect: " + index);
        System.exit(1);
        return ' ';
    }

    public int indexOf(char chars) {
        for (int i = 0; i < index; i++) {
            if (chars == letters[i]) {
                return i;
            }
        }
                return -1;
    }



        public static void main (String[]args){
            Text t = new Text();
            System.out.println(t.isEmpty());
            t.add('a');
            t.add('p');
            t.add('p');
            t.add('l');
            t.add('e');

            System.out.println(t);
            System.out.println(t.get(2));

            System.out.println(t.isEmpty());


            String s;

            t.remove(0);
            t.add('f');
            t.set('w', 4);
            System.out.println(t);
            System.out.println(t);

            t.indexOf('a');
            System.out.println(t);
            t.lastIndexOf('e');
            System.out.println(t.lastIndexOf('p'));
        }
    }
