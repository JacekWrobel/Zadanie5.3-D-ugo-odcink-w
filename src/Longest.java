public class Longest {

    Line longestLine(Line lineA, Line lineB) {
        //      if (lineLenghtNew(lineA) == lineLenghtNew(lineB)) {
        //          return lineA && lineB;}
        if (lineLenghtNew(lineA) > lineLenghtNew(lineB)) {
            return lineA;
        }
        if (lineLenghtNew(lineA) < lineLenghtNew(lineB)) {
            return lineB;
        } else return null;
    }


    double lineLenghtNew(Line line) {
        double lenght =
                (((line.pointStart.getX() - line.pointEnd.getX()))
                        * ((line.pointStart.getX() - line.pointEnd.getX()))
                ) + (((line.pointStart.getY() - line.pointEnd.getY()))
                        * ((line.pointStart.getY() - line.pointEnd.getY())));
        return Math.sqrt(lenght);

    }
}

