public class OccurenceCount {
    public static void main(String[] args) {
       char [] letters ={'A','C','E','C','A','C','B','A','D'};
       char searchLetter='A';
        System.out.println(countOccurence(letters,searchLetter));
    }
    static int countOccurence(char[]letters, char searchLetter){
        int count =0;
        for (int i = 0; i < letters.length; i++) {
                if(letters[i]==searchLetter){
                    count ++;
                }
        }
        return count;
    }
}
