package static2;

public class DecoUtil1 {

    public String deco(String str) {
        return "*" + str + "*";
    }

    /* `deco()` 라는 기능은 멤버 변수도 없고, 단순히 기능만 제공할 뿐
       인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수)등을 사용하는 목적이 큰데,
       이 메서드는 사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.
     */
}
