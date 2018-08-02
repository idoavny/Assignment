package assignment_6;

public class RGBColor 
{
private int _red, _green, _blue;
final int black = 0;
static final double grayScaleRed = 0.3;
static final double grayScaleGreen = 0.59;
static final double grayScaleBlue = 0.11;
	public RGBColor()
	{
	_red = black;
	_green = black;
	_blue = black;
	}
	
	public RGBColor(int red, int green, int blue) 
	{
		if(red >= 0 && red <=255)
		{
		this._red = red;
		}
		
		else
		{
			this._red = black;	
		}
		
		if(green >= 0 && green <=255)
		{
			this._green = green;
		}
		
		else
		{
			this._green = black;
		}
	
		if(blue >= 0 && blue <=255)
		{
			this._blue = blue;
		}
		
		else
		{
			this._blue = black;
		}
	}	
	
	public RGBColor(RGBColor other)
	{
		this._red = other._red;
		this._green = other._green;
		this._blue = other._blue;
	}
	
	public int getRed() 
	{
		return _red;
	}
	
	public int getGreen() 
	{
	return _green;	
	}
	
	public int getBlue() 
	{
	return _blue;
	}

	void setRed(int num) 
	{
		if(num >= 0 && num <=255)
		{
		this._red = num;
		}
		
		else
		{
			this._red = black;	
		}
	}

	void setGreen(int num) 
	{
		if(num >= 0 && num <=255)
		{
		this._green = num;
		}
		
		else
		{
			this._green = black;	
		}
	}
	
	void setBlue(int num) 
	{
		if(num >= 0 && num <=255)
		{
		this._blue = num;
		}
		
		else
		{
			this._blue = black;	
		}
	}
	
	public String toString()
	{
		String stringRed = Integer.toString(_red);
		String stringGreen = Integer.toString(_green);
		String stringBlue = Integer.toString(_blue);
	return "("+stringRed+","+stringGreen+","+stringBlue+")";
	}

	public boolean equals(RGBColor other)
	{
		if(_red == other._red && _green == other._green && _blue == other._blue)
		{
			return true;
		}
		
		else
		{
		return false;	
		}
	
	}	
	
	public void mix(RGBColor other)
	{
		_red += other._red;
		_red = (int)(_red/2);
		
		_green += other._green;
		_green = (int)(_green/2);
	
		_blue += other._blue;
		_blue = (int)(_blue/2);
	}

	public double convertToGrayscale() 
	{
	return (_red*grayScaleRed) + (_green*grayScaleGreen) + (_blue*grayScaleBlue);
	}

	public void invert()
	{
		_red = 225- _red; 
		_green = 225-_green;
		 _blue = 225-_blue;
	
	}

}
