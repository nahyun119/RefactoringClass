package ac.kr.ajou.longmethod;

import org.junit.Test;

public class LongMethodTest {

    public static final String CORRECT_SOCIAL_STRING = "abcdes";

  //  LongMethod longMethod;
    @Test(expected = RuntimeException.class)
    public void doSomethind_소셜스트링이_8자리면_에러() {
        LongMethod longMethod = new LongMethod();
        boolean result = longMethod.doSomething("11111111","hihi","15151");
    }

    @Test(expected = RuntimeException.class)
    public void doSomethind_소셜스트링에_숫자가없으면_에러() {
        LongMethod longMethod = new LongMethod();
        boolean result = longMethod.doSomething("abcdes","ab","15151");
    }

    @Test(expected = RuntimeException.class)
    public void doSomethind_이름이_5자리_이상이면_에러() {
        LongMethod longMethod = new LongMethod();
        boolean result = longMethod.doSomething(CORRECT_SOCIAL_STRING,"abbbbb","15151");
    }

    @Test(expected = RuntimeException.class)
    public void doSomethind_이름이_5자리_이하이고_숫자가있으면_에러() {
        LongMethod longMethod = new LongMethod();
        boolean result = longMethod.doSomething("abcdes","ab","15151");
    }

}
