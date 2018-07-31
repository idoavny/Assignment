package assignment_5;

public class Box {
	
	private int _width,_length,_height;
	static final int variabledefault = 10;
    int arr[] = {_width,_length,_height};
	public Box() {
		_width = variabledefault;
		_length = variabledefault;
		_height = variabledefault;
	}
	
	public Box(int val) {
		if(val>0) {
			_width = val;
			_length = val;
			_height = val;
		}
		else {
		
		}
	}
	public Box(int width, int length, int height) {
			
		if(width>0) {
			_width = width;
		}	else {
				_width = variabledefault;
			}
		if(length>0) {
			_length = length;
		}	else {
			_length = variabledefault;
			}
		if(height>0) {
			_height = height;
		}	else {
			_height = variabledefault;
			}
			
		
	}

	public void setLength (int val) {
		
		if(val>0) {
			_length = val;
		}	
	}
	public void setHeight (int val) {
		if(val>0) {
			_height = val;
		}	
	}
	public void setWidth (int val) {
		if(val>0) {
			_width = val;
		}	
	
	}

	public int getLength() {
		return(_length);
	}
	public int getHeight() {
		return(_height);
	}
	public int getWidth() {
		return(_width);
	}

	public void resize(int factor) {
		if(factor>0) {
			_width *= factor;
			_length *= factor;
			_height *= factor;
		}	
	}
	 public void resizeToLength() {
			_width = _length;
			
			_height =_length;
	 }
	 public void resizeToHeight() {
			_width = _height;
			_length =_height;
			
	 }
	 public void resizeToWidth() {
		 	
			_length =_width;
			_height =_width;
	 }
	 public int volume() {
		 return(_width * _length * _height);
	 }
	 public int surfaceArea() {
		 return(2*(_width * _height) + 2*(_width * _length) + 2*(_length * _height));
	 }


}


	
	

