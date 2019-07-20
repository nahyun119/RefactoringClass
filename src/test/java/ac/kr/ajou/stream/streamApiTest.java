package ac.kr.ajou.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class streamApiTest {

    @Test
    public void filterString_제대로_필터된스트링을반환하는지()
    {
        StreamApi streamApi = new StreamApi();
        List<String> testStringList = new ArrayList<>();
        testStringList.add("a");
        testStringList.add("b");
        testStringList.add("c");
        testStringList.add("b");
        testStringList.add("c");

        List<String> resultList = streamApi.filterString(testStringList,"c");
        assertTrue(resultList.size() == 2);
        assertTrue(resultList.get(0) == "c");
        assertTrue(resultList.get(1) == "c");


    }


}
