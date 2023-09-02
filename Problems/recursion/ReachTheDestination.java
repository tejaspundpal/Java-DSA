package Java_DSA.Problems.recursion;

public class ReachTheDestination {
    public static boolean reachDestination(int sx, int sy, int dx, int dy) {
        // Write your code here
        if(sx == dx && sy == dy)
            return true;
        else if(dx < dy)
            return reachDestination(sx, sy, dx, dy-dx);
        else if(dy < dx)
            return reachDestination(sx, sy, dx-dy, dy);
        else
            return false;


        //brute force approach
        // if (sx == dx && sy == dy)
        // 	return true
        // if (sx > dx || sy > dy)
        // 	return false;
        // return reachDestination(sx + sy, sy, dx, dy) || reachDestination(sx, sy + sx, dx, dy);
    }
}

