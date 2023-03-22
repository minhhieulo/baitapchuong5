
package câu2;


public class HinhTron extends HinhHoc{
    public float r;
	public void HinhTron(float r) {

}
	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "HinhTron [r=" + r + "]";
	}
    @Override
	public double dienTich() {
		return Math.PI*2*r;	
	}
}


