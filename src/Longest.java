public class Longest {
    String longestLine(Line lineA, Line lineB) {
        if (lineLenght(lineA) == lineLenght(lineB)) {
            return lineA.name +" = " +lineB.name;
        }
        if (lineLenght(lineA) > lineLenght(lineB)) {
            return lineA.name;
        } else return lineB.name;
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

