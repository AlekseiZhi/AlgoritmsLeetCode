package alexei.tasks.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindWordsThatCanBeFormedByCharacters_leetCode1160Test {
    private final FindWordsThatCanBeFormedByCharacters_leetCode1160 formed = new FindWordsThatCanBeFormedByCharacters_leetCode1160();

    @Test
    public void test1() {
        //given
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int expected = 6;
        //when
        int actual = formed.countCharacters(words, chars);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        int expected = 10;
        //when
        int actual = formed.countCharacters(words, chars);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        String[] words = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin", "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb", "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl", "boygirdlggnh", "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx", "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop", "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx", "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo", "oxgaskztzroxuntiwlfyufddl", "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp", "qnagrpfzlyrouolqquytwnwnsqnmuzphne", "eeilfdaookieawrrbvtnqfzcricvhpiv", "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz", "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue", "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv", "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo", "teyygdmmyadppuopvqdodaczob", "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs", "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        int expected = 0;
        //when
        int actual = formed.countCharacters(words, chars);
        //then
        assertEquals(expected, actual);
    }
}