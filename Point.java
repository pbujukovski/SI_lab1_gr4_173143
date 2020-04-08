class Point {
	String id
	double x,y;

	//TODO add new variable
	string color;
	//TODO constructor
	 Point(id,x,y,color){
		strcpy(this->adresa,adresa);
		this->x=x;
		this->y=y;
		this->color=color;

		}
	//TODO setters and getters
		string *getId(){
     		return id;
    		}	

		string *getColor(){
     		return color;
    		}	


	public void move (char xDirection, char yDirection) {
		//TODO
		if (id== xDiricton(L)) return left;
		else if (id== xDiricton(R)) return right;
		else if (id== xDiricton(D)) return down;
		else return top;	
	}

	public void draw () {
		//TODO
		for(int i=0; i<id; i++){
			syste.out.prinln("tockata vo momentot e " + id);
		}
	}



}