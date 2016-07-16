public class CrossLine {
	public boolean checkCrossLine(double s1,double s2,double y1,double y2)
	{
		if(s1==y1&&s2!=y2)
		{
			return false;
		}
		return true;
	}
}
