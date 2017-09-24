import java.util.Random;

public class SlimeFind {

	public static void main(String[] args) {
		long seed = Long.parseLong(args[0]);
		int xPosition = Integer.parseInt(args[1]);
		int zPosition = Integer.parseInt(args[2]);
		//xPosition = xPosition / 16;
		//zPosition = zPosition / 16;
		Random rnd = new Random(seed +
                        (long) (xPosition * xPosition * 0x4c1906) +
                        (long) (xPosition * 0x5ac0db) + 
                        (long) (zPosition * zPosition) * 0x4307a7L +
                        (long) (zPosition * 0x5f24f) ^ 0x3ad8025f);
		System.out.println(rnd.nextInt(10) == 0);
	}
}
