// Princípio do Menor Privilégio
// Princípio Zero, Um ou Infinito (ZOI - Zero One Infinity Principle)
class WebUtil {
  static String tag(String... args) { // varargs
    // String[]
    // 0 1 2 3 4 5 6 7
    // a b c d e f g h
    String res = "";
    // iterar array de trás para frente
    for (int i = args.length - 1; i > 0; i--) {
      if (i == args.length - 1) {
        res = tag(args[i - 1], args[i]);
      } else {
        res = tag(args[i - 1], res);
      }
    }
    return res;
  }

  static String tag(String tag1,
                    String tag2,
                    String body) {

                            // tag body
                    // <div> <p>texto</p> </div>
                    // tag       body
    // compondo e encadeando
    // (usar saída de uma como entrada de outra)
    return tag(tag1, tag(tag2, body));
  }

  static String tag(String tag, String body) {
    tag = tag.toLowerCase();
    return "<" + tag + ">"
      + body + "</" + tag + ">";
  }

  // composição de funções/métodos
  static String tag(String tag) {
    return tag(tag, "");
  }

}
