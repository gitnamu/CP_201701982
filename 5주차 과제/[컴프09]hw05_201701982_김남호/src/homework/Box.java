package homework;

class Box {
		//���� ���� ����
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
	public void print()	{	System.out.println("���δ�: "+getWide());
							System.out.println("���δ�: "+getColumn());
							System.out.println("���̴�: "+getHeight());
							System.out.println("���Ǵ�: "+getVolume());
						}
}