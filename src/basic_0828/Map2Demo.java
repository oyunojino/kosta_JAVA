package basic_0828;

public class Map2Demo {
  public static void main(String[] args) {
    Nation.nations.stream()
        .map(x -> x.getName())
        .limit(4)
        .forEach(Util::printWithParenthesis);

    System.out.println();

    Nation.nations.stream()
        .map(x -> x.getGdpRank())
        .forEach(Util::printWithParenthesis);
  }
}
