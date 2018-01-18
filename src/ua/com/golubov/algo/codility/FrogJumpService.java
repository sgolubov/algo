package ua.com.golubov.algo.codility;

public class FrogJumpService {

    public int solution(int X, int Y, int D) {
        return X == Y ? 0 : (int) Math.ceil((double) (Y - X) / D);
    }

}
