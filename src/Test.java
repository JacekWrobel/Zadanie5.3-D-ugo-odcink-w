public class Test{
    public static void main(String[] args) {
        Point pointAStart = new Point(-5);//
        Point pointAEnd = new Point(5);
        Point pointBStart = new Point(5);
        Point pointBEnd = new Point(-5);

        Line lineA = new Line("lineA", pointAStart, pointAEnd);
        Line lineB = new Line("lineB", pointBStart, pointBEnd);

        Longest longest = new Longest();

        System.out.println(longest.lineLenght(lineA));
        System.out.println(longest.lineLenght(lineB));

        System.out.println(longest.longestLine(lineA, lineB));//wskazuje na dłuższy odcinek
        System.out.println(longest.isEqueal(lineA, lineB)); //dodatkowe badanie warunku równości
    }
}