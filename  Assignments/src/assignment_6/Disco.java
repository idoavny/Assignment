package assignment_6;

public class Disco {
LightBulb _bulb1;
LightBulb _bulb2;
LightBulb _bulb3;
LightBulb _bulb4;

	public Disco(LightBulb b1, LightBulb b2, LightBulb b3, LightBulb b4)
	{
		this._bulb1 = b1;
		this._bulb2 = b2;
		this._bulb3 = b3;
		this._bulb4 = b4;
	}

	public LightBulb getFirstBulb()
	{
		return _bulb1;
	}
	
	public LightBulb getSecondBulb()
	{
		return _bulb2;
	}
	
	public LightBulb getThirdBulb() 
	{
		return _bulb3;
	}
	
	public LightBulb getFourthBulb()
	{
		return _bulb4;
	}

	public void switchBulb(int num)
	{
		switch(num)
		{
		case 1: _bulb1.switchLight();
		break;
		
		case 2: _bulb2.switchLight();
		break;
		
		case 3: _bulb3.switchLight();
		break;
		
		case 4: _bulb4.switchLight();
		break;
		}
	}
	
	public void turnAllOn()
	{
		_bulb1._switchedOn = true;
		_bulb2._switchedOn = true;
		_bulb3._switchedOn = true;
		_bulb4._switchedOn = true;
	}

	public void turnAllOff()
	{
		_bulb1._switchedOn = false;
		_bulb2._switchedOn = false;
		_bulb3._switchedOn = false;
		_bulb4._switchedOn = false;
	}

	public boolean areAllOn()
	{
		if(_bulb1._switchedOn == true&&_bulb2._switchedOn == true&&_bulb3._switchedOn == true&&_bulb4._switchedOn == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean areAllOff()
	{
		if(_bulb1._switchedOn == false&&_bulb2._switchedOn == false&&_bulb3._switchedOn == false&&_bulb4._switchedOn == false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean allSameColor()
	{
		if(_bulb1._color == _bulb2._color && _bulb1._color == _bulb3._color && _bulb1._color == _bulb4._color)
		{
		return true;	
		}
		else
		{
			return false;
		}
	}
	
}



















