//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package thePACKAGE;

public class Vehicle 
{
	private String lPlate;
	private String OwnerLaName;
	private String OwnerPhone;
	
	Vehicle(String lPlate , String OwnerLaName , String OwnerPhone)
	{
		this.lPlate = lPlate;
		this.OwnerLaName = OwnerLaName;
		this.OwnerPhone = OwnerPhone;
	}
	
	public String getLPlate() {
		return lPlate;
	}
	public void setLPlate(String plate) {
		lPlate = plate;
	}
	public String getOwnerLaName() {
		return OwnerLaName;
	}
	public void setOwnerLaName(String ownerLaName) {
		OwnerLaName = ownerLaName;
	}
	public String getOwnerPhone() {
		return OwnerPhone;
	}
	public void setOwnerPhone(String ownerPhone) {
		OwnerPhone = ownerPhone;
	}
}
