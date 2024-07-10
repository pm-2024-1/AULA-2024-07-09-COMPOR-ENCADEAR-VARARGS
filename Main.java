import java.util.HashMap;
import java.util.LinkedHashMap;

class Main {
  public static void main(String[] args) {
    System.out.println(WebUtil.tag("p", "asdfsadf"));
    System.out.println(WebUtil.tag("i"));
    // encadeamento de função
    // function chaining
    System.out.println(
      WebUtil.tag("section", WebUtil.tag("ul",WebUtil.tag("li"))));

    System.out.println(
      WebUtil.tag("div", "p", "texto"));
    // <div><p>texto</p></div>
    // parâmetros "infinitos" (parâmetros variáveis)
    // varargs: ...
    System.out.println(
        WebUtil.tag("div", "header", "main", "section", "article",  "texto"));

    HashMap mapa = new HashMap();
    mapa.put("type", "number");
    mapa.put("id", "codigo");
    mapa.put("placeholder", "123");
    System.out.println(mapa);
    // 
  }
}