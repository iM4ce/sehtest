package sehtest;

public class Ring {

	private String path;
	private String direction;

	public Ring(String direction) {

		this.direction = direction;
		if (direction.equals("N")) {
			this.path = "/img/NLandolt.png";
		} else if (direction.equals("NE")) {
			this.path = "/img/NELandolt.png";
		} else if (direction.equals("E")) {
			this.path = "/img/ELandolt.png";
		} else if (direction.equals("SE")) {
			this.path = "/img/SELandolt.png";
		} else if (direction.equals("S")) {
			this.path = "/img/SLandolt.png";
		} else if (direction.equals("SW")) {
			this.path = "/img/SWLandolt.png";
		} else if (direction.equals("W")) {
			this.path = "/img/WLandolt.png";
		} else if (direction.equals("NW")) {
			this.path = "/img/NWLandolt.png";
		}
	}

	public static String intToDirection(int i) {

		String direction = null;
		switch (i) {
		case '1':
			direction = "SW";
			break;
		case '2':
			direction = "S";
			break;
		case '3':
			direction = "SE";
			break;
		case '4':
			direction = "W";
			break;
		case '6':
			direction = "E";
			break;
		case '7':
			direction = "NW";
			break;
		case '8':
			direction = "N";
			break;
		case '9':
			direction = "NE";
			break;
		default:
			System.out.println("Ungültige Eingabe");
			break;
		}
		return direction;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPath() {
		return this.path;
	}

}
