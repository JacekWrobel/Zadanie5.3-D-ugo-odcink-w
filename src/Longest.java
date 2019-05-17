public class Longest {

    String longestLine(Line lineA, Line lineB) {
        if (lineLenghtNew(lineA) == lineLenghtNew(lineB)) {
            return lineA.name + " = " + lineB.name;
        }
        if (lineLenghtNew(lineA) > lineLenghtNew(lineB)) {
            return "Dłuższy odcienk to odcinek " + lineA.name + " początek w punkcie (" + lineA.pointStart.getX() + ", "
                    + lineA.pointStart.getY() + "), a koniec w punkcie ("
                    + lineA.pointEnd.getX() + ", " + lineA.pointEnd.getY() + ", długość tego odcinak to "
                    + lineLenghtNew(lineA);
        } else
            return "Dłuższy odcienk to odcinek " + lineB.name + " początek w punkcie (" + lineB.pointStart.getX() + ", "
                    + lineB.pointStart.getY() + "), a koniec w punkcie ("
                    + lineB.pointEnd.getX() + ", " + lineB.pointEnd.getY() + "), długość tego odcinka to "
                    + lineLenghtNew(lineB);
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

