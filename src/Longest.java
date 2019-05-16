public class Longest {
    String longestLine(Line lineA, Line lineB) {
        if (lineLenght(lineA) == lineLenght(lineB)) {
            return lineA.name +" = " +lineB.name;
        }
        if (lineLenght(lineA) > lineLenght(lineB)) {
            return "Dłuższy odcienk to odcinek " +lineA.name +" początek w punkcie " +lineA.pointStart.point +", a koniec w punkcie "
                    +lineA.pointEnd.point +", długość odcinak to " +lineLenght(lineA);
        } else return "Dłuższy odcienk to odcinek " +lineB.name +" początek w punkcie " +lineB.pointStart.point +", a koniec w punkcie "
                +lineB.pointEnd.point +", długość odcinak to " +lineLenght(lineB);
    }
        double lineLenght(Line line) {
        if (line.pointEnd.point > line.pointStart.point) {
            return line.pointEnd.point - line.pointStart.point;
        } else return line.pointStart.point - line.pointEnd.point;
    }
    boolean isEqueal (Line lineA, Line lineB) {
        if (lineLenght(lineA) == lineLenght(lineB));
        return true;
    }
}

