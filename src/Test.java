public class Test{
    public static void main(String[] args) {
        Point pointAStart  = new Point(3, 5);//
        Point pointAEnd = new Point(0, 3);
        Point pointBStart = new Point(3, -5);
        Point pointBEnd = new Point(3, 0);

        Line lineA = new Line("lineA", pointAStart, pointAEnd);
        Line lineB = new Line("lineB", pointBStart, pointBEnd);

        Longest longest = new Longest();


        Line longer = longest.longestLine(lineA, lineB);
 /*      System.out.println(longest.longestLine(lineA,lineB).pointStart.getX() +" "
                +longest.longestLine(lineA,lineB).pointStart.getY() +" "
                +longest.longestLine(lineA,lineB).pointEnd.getX() +" "
                +longest.longestLine(lineA,lineB).pointEnd.getY() +" "
                + longest.lineLenghtNew(longest.longestLine(lineA, lineB)));
*/
        System.out.println(longer.name +" " +longer.pointStart.getX() +" " +longer.pointStart.getY()+ " "
        + longer.pointEnd.getX() +" " + longer.pointEnd.getY() +" " + longest.lineLenghtNew(longer));


        System.out.println(lineA.name +" długość: " +longest.lineLenghtNew(lineA));
        System.out.println(lineB.name +" długość: " +longest.lineLenghtNew(lineB));

    }
}