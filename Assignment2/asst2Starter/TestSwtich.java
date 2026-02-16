class Def {
public  void exec(int n) {
	switch (n) {
	  case 1: abc = 3;
	    break;
	  case 48: abc = 4;
	    break;
	  default:
	    abc = 12;
	    break;
	  case 4: case 8:
	    abc = 23;
	    break;
	  case 15: case 82:
	    abc = 33;
	  case 415: case 2212:
            abc = 21;
	}
    }
}
