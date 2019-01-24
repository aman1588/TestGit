class BoxWeight extends Box
{
	float weight;

	BoxWeight()
	{
		super();
		weight=0;
	}

	BoxWeight(float w,float h, float d,float we)
	{
		super(w,h,d);
		weight=wht;
	}

	void setWeight(float we)
	{
		weight = wht;
	}

	float getWeight()
	{
		return weight;
	}

	void display()
	{
		System.out.println(weight);
	}
}