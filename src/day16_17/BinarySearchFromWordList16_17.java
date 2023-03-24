package day16_17;
import java.util.Arrays;
public class BinarySearchFromWordList16_17 {
    public static int search(String []words, String sample){
        int min =0;
        int max = words.length-1;
        while (min<=max){
            int mid =(min+max)/2;
            int comparison = sample.compareTo(words[mid]);
            if (comparison == 0) {
                return mid; // Found the word
            } else if (comparison < 0) {
                max = mid - 1; // The word must be in the lower half of the list
            } else {
                min = mid + 1; // The word must be in the upper half of the list
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    String word[]={"test","employee","Name","Id","Moue"};
        Arrays.sort(word);
    int index = search(word,"Mouse");

    if(index==-1){
        System.out.println("Not found");
    }else {
        System.out.println("found at "+index);
    }

    }
}
