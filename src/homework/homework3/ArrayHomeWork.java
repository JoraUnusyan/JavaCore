package homework.homework3;

public class ArrayHomeWork {
    int[] array = {6, 8, 1, 2, 6, 5, 7, 8, 1, 6};

    int repeatingNumber(int n) {
        int count = 0;
        for (int x : array) {
            if (x == n) {
                count++;
            }
        }
        return count;

    }

    void reNumber() {
        int endindex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[endindex];
            array[endindex--] = temp;
            for (int x : array) {
                System.out.print(x + " ");


            }

        }
    }

    int count() {
        int doublicatecount = 0;
        int[] doubleheader = new int[array.length];
        int doubliceatearrayindex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    boolean existDuplicate = false;
                    for (int x : doubleheader) {
                        if (array[i] == x) {
                            existDuplicate = true;
                            break;
                        }

                    }
                    if (!existDuplicate) {
                        doublicatecount++;
                        doubleheader[doubliceatearrayindex++] = array[i];
                        break;
                    }
                }
            }

        }
        return doublicatecount;
    }

    int vowels() {
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'է', 'ը', 'ի', 'օ', 'ո'};
        int vowelscount = 0;
        for (char c : chars) {
            for (char v : vowels) {
                if (c == v) {
                    vowelscount++;
                    break;
                }

            }

        }
        return vowelscount;
    }

}
