package ac.kr.ajou.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public List<String> filterString(List<String> stringList, String filterString) {
        return stringList.stream()
                .filter(string -> string.equals(filterString))
                .collect(Collectors.toList()); //결과값이 여러개가 나와서 list로 반환하니까 list에 알아서 넣어서 반혼하겟다

        /*List<String> resultString = new ArrayList<>();
        for(String string : stringList)
        {
            if(string.equals(filterString))
            {
                resultString.add(string);
            }
        }
        return resultString;*/ //stream을 쓰기전
    }


    /*public List<String> filterByName(List<Person> personList, String filterName) {
        return personList.stream()
                .filter(p -> p.getName().equals(filterName))
                .map(person -> person.getAddress()) //map을 이용해서 값을 변경해서 output을 원하는 값으로, 객체로 볌환할 수 있도록
                 // 이런식으로 map을 이용해서 person에서 getaddress로 해서 필터링된 person들의 주소로 리스트를 만들어서 반환하도록
                .collect(Collectors.toList()); //filter바로 collect하면  person 객체로 리스트 반환
    }

    public int getAggregationaAge(List<Person> personList, String filterName){
        return personList.stream()
                .filter(person -> person.getName().equals(filterName))
                .mapToInt(person -> person.getAge())
                .sum(); //int age로 값을 map을 이용해서 변경한다음에 sum을 이용해서  그 필터링 된 나이들을 더함

        /*personList.stream()
                .filter(person -> person.getName().equals(filterName))
                .map(person -> person.getAddress())
                .sorted();*/
        //map으로 person에서 get address로 변경한다음에 sort를 이용해서 정렬을 할 수 있ㄷ. //stream api 모음 보기


}
