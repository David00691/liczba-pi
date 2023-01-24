public class watek  extends Thread {

    double result = 0;
    @Override
    public void run() {
        double rand_x, rand_y, origin_dist, pi=0;
        int circle_points = 0, square_points = 0;
        for (int i = 0; i < (GFG.INTERVAL * GFG.INTERVAL); i++) {
            rand_x = Math.random()*2-1;
            rand_y = Math.random()*2-1;
            origin_dist = rand_x * rand_x + rand_y * rand_y;
            if (origin_dist <= 1)
                circle_points++;
            square_points++;
            pi = ((4.0 * circle_points) / square_points);
            result = pi;
        }
        System.out.println("Final Estimation of Pi = " + pi);

    }
}
