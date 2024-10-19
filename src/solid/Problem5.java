package solid;

 class Macbook {
 /**
  * It states that class should depend on interface rather than concrete class
  * 
  * 
  */
	 
	 public WiredMouse wiredMouse;
	 public WiredKeyBoard wiredKeyBoard;
}
class WiredMouse {
	
	//some methods
}
class WiredKeyBoard {
	
}
/*
 * If in future we want to use some different mouse like wireless mouse then we have 
 * to change all the instances of that
 * so its better to create a mouse interface and and extend that to new classes, i.e.,
 * WiredMouse, WirelessMouse like
 *
 */

interface Mouse{ 
	// and so on
}