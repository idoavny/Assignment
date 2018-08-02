package assignment_6;


public class LightBulb 
{	
	RGBColor _color;
	boolean _switchedOn;
		
	public LightBulb(int red, int green, int blue)
	{
		if((red<0 || red>255)||(green<0 || green>255)||(blue<0 ||blue>255))
		{
			_color = new RGBColor();
		}
		
		else
		{
			_color = new RGBColor(red, green, blue);
		}
		_switchedOn = false;
	}
	
	public LightBulb(RGBColor color)
	{
		_color = new RGBColor(color);
		_switchedOn = false;
	}
	
	public LightBulb(LightBulb other)
	{
		_color = other._color;
		_switchedOn = other._switchedOn;
	}
	
	RGBColor getColor()
	{
		return _color;
	}

	public void setColor(RGBColor color)
	{
		_color = color;
	}
	
	boolean isSwitchedOn()
	{
		return _switchedOn;
	}
	
	void switchLight() 
	{
		if(_switchedOn == false)
		{
		_switchedOn = true;
		}
		
		else
		{
			_switchedOn = false;
		}
	}	

	public String toString()
	{
	
	return _color.toString() + (_switchedOn == true ? "On" : "Off") ; 	
	}

}































