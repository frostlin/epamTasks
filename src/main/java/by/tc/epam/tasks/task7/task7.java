package by.tc.epam.tasks.task7;

class PairInt {
    int x, y;
    PairInt(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class task7 {
    PairInt a, b;
    private String result;

    public String Start(int x1, int y1, int x2, int y2) {
        SetTwoPoints(x1, y1, x2, y2);

        CalculateResult();

        return result;
    }

    private void CalculateResult(){
        int delta = (Math.abs(a.x) + Math.abs(a.y)) - (Math.abs(b.x) + Math.abs(b.y));
        if (delta == 0) result = "Equal";
        else if (delta > 0) result = "B";
        else result = "A";
    }

    private void SetTwoPoints(int x1,int y1,int x2,int y2){
        a = new PairInt(x1, y1);
        b = new PairInt(x2, y2);
    }
}
