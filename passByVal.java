package Training;

public class passByVal 
{
	public static void main(String[] args)
	{
		int sId=25;
		passByVal val = new passByVal();
		System.out.println(sId);
		val.passThevalueMethod(sId);
		System.out.println("the sId are" + sId);
		
	}
	public void passThevalueMethod(int sid)
	{
		int sId=10;
		System.out.println("the sId ate"+ sId);
	}

}
