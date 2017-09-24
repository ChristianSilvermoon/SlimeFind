import java.util.Random;

public class SlimeFind {

	public static void main(String[] args) {
		//No Arguments or "--help" = Show help message & Exit
		if ( args.length == 0 || args[0].equals("--help") ) {
			System.out.println("USAGE: java SlimeFind <Seed> <Chunk X1> <Chunk Z1> <Chunk X2> <Chunk Z2>\n");
			return;
		}

		//Process Arguments
			//Seed
				//Ensure Numerical
				if ( ! args[0].matches("^[0-9,-]+$") ) {
					System.out.println("\"" + args[0] + "\" is NOT a numerical value!\nPlease use a NUMERICAL Minecraft Seed!");
					return;
				}

				//Evaluate '-' to '0'
				if ( args[0].equals("-")) {
					System.out.println("Seed: \"" + args[0] + "\" defaults to \"0\"");
					args[0] = "0";
				}

			//Chunk X1
				//Evaluate '-' to '0'
				if ( args.length >= 2 && args[1].equals("-") ) {
					System.out.println("Chunk X1: \"" + args[1] + "\" defaults to \"0\"");
					args[1] = "0";
				}

				//Default to '-31' if not given
				if ( args.length >= 2 && args[1].equals("")) {
					System.out.println("Chunk X1: No argument specified, defaulting to \"-31\"...");
					args[1] = "-31";
				}

			//Chunk Z1
				//Evaluate '-' to '0'
				if ( args.length >= 3 && args[2].equals("-") ) {
					System.out.println("Chunk Z1: \"" + args[2] + "\" defaults to \"0\"");
					args[2] = "0";
				}

				//Default to '-31' if not given
				if ( args.length >= 3 && args[2].equals("")) {
					System.out.println("Chunk Z1: No argument specified, defaulting to \"-31\"");
					args[2] = "-31";
				}

			//Chunk X2
				//Evaluate '-' to '0'
				if ( args.length >= 4 && args[3].equals("-") ) {
					System.out.println("Chunk X2: \"" + args[3] + "\" defaults to \"0\"");
					args[3] = "0";
				}

				//Default to '-31' if not given
				if ( args.length >= 4 && args[3].equals("")) {
					System.out.println("Chunk X2: No argument specified, defaulting to \"-31\"");
					args[3] = "-31";
				}

			//Chunk Z2
				//Evaluate '-' to '0'
				if ( args.length >= 5 && args[4].equals("-") ) {
					System.out.println("Chunk Z2: \"" + args[4] + "\" defaults to \"0\"");
					args[4] = "0";
				}

				//Default to '-31' if not given
				if ( args.length >= 5 && args[4].equals("")) {
					System.out.println("Chunk Z2: No argument specified, defaulting to \"-31\"");
					args[4] = "-31";
				}



		long seed = Long.parseLong(args[0]);
		int xPosition = Integer.parseInt(args[1]);
		int zPosition = Integer.parseInt(args[2]);
		int xFinal = Integer.parseInt(args[3]);
		int zFinal = Integer.parseInt(args[4]);
		int origZPosition = zPosition;

		while ( xPosition != xFinal ) {
			zPosition = origZPosition;
			while ( zPosition != zFinal ) {
				Random rnd = new Random(seed +
		                        (long) (xPosition * xPosition * 0x4c1906) +
		                        (long) (xPosition * 0x5ac0db) +
		                        (long) (zPosition * zPosition) * 0x4307a7L +
		                        (long) (zPosition * 0x5f24f) ^ 0x3ad8025f);

				if ( rnd.nextInt(10) == 0 ) {
					System.out.println( "Slime Chunk: x" + Integer.toString(xPosition * 16) + " z" + Integer.toString(zPosition * 16) );
				}
				zPosition++;
			}
			xPosition++;
		}
		return;
	}
}
