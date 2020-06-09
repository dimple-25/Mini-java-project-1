package radio;

public class Radio {

String power;
int vol;
double channel;
double[] channelarr = new double[] {90.1,92.7,93.5,94.3,95};
int i=0;
Radio()
{
	power="OFF";
	vol=0;
	channel=channelarr[i];
	System.out.println("Current_state: channel: "+channel+" volume: "+vol+" power: "+power);
}
public void chup()
{
	if(i<4)
	{
		++i;
	}
	else
	{
		i=0;
	}
	this.channel=channelarr[i];
	System.out.println("Current_state: channel: "+channel+" volume: "+vol+" power: "+power);
}
public void chdn()
{
	if(i>0)
	{
		--i;
	}
	else
	{
		i=4;
	}
	this.channel=channelarr[i];
	System.out.println("Current_state: channel: "+channel+" volume: "+vol+" power: "+power);
}
public void volup()
{
	if(vol<30)
	{
		this.vol=++vol;
		
	}
	else
	{
		System.out.println("Maximum volume reached");
	}
	System.out.println("Current_state: channel: "+channel+" volume: "+vol+" power: "+power);
}
public void voldown()
{
	if(vol>0)
	{
		this.vol=--vol;
	}
	
	else
	{
		System.out.println("Minimum volume reached");
	}
	System.out.println("Current_state: channel: "+channel+" volume: "+vol+" power: "+power);
}

}
