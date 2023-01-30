public class lowercased_vowel {
    public static int countlowvowel(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':count++;
                            break;
                default: break;
            }
            
        }
        return count;
    }
        
    public static void main(String args[]){
        String str="the qUick brown fox Jumps Over the lazy White DoG";
        int i=countlowvowel(str);
        System.out.println("There are "+i+" vowels in the given strings.");

    }
}
