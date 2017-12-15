package homework;

class Box {
		//가로 세로 높이
	private int wide;
	private int column;
	private int height;
	public int getWide()	{	return wide;	}
	public void setWide(int w)	{	wide = w;	}
	public int getColumn()	{	return column;	}
	public void setColumn(int c)	{	column = c;	}
	public int getHeight()	{	return height;	}
	public void setHeight(int h)	{	height = h;	}	
	public int getVolume()	{	return wide*column*height;	}
	public void print()	{	System.out.println("가로는: "+getWide());
							System.out.println("세로는: "+getColumn());
							System.out.println("높이는: "+getHeight());
							System.out.println("부피는: "+getVolume());
						}
}