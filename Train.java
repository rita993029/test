package homework;

public class Train implements Comparable<Train>{
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public void setNumber() {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	public void setType() {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setStart() {
		this.start = start;
	}
	public String getStart() {
		return start;
	}
	
	public void setDest() {
		this.dest = dest;
	}
	public String getDest() {
		return dest;
	}
	
	
	public void setPrice() {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	} 
	
	@Override
	public String toString() {
		return  number + "," + type + "," + start + "," + dest + "," + price ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + number;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (number != other.number)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	public int compareTo(Train aTrain) {
		if(this.number > aTrain.number) {
			return 1;
		}else if(this.number < aTrain.number) {
		    return -1;
		}else {
		    return 0;
		}    
	}
	
	
//	乾淨寫法
//	public int compareTo(Train aTrain) {
//		return this.number - aTrain.number;
//	}
	
	
	
	
	
	
	
	
	
	
}
