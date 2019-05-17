public class Test{
    public static void main(String[] args) {
        Point pointAStart  = new Point(3, 5);//
        Point pointAEnd = new Point(0, 3);
        Point pointBStart = new Point(3, -5);
        Point pointBEnd = new Point(3, 0);

        Line lineA = new Line("lineA", pointAStart, pointAEnd);
        Line lineB = new Line("lineB", pointBStart, pointBEnd);

        Longest longest = new Longest();

        System.out.println(lineA.name +" długość: " +longest.lineLenghtNew(lineA));
        System.out.println(lineB.name +" długość: " +longest.lineLenghtNew(lineB));

        System.out.println(longest.longestLine(lineA, lineB));

    }
}