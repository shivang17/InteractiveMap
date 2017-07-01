package createmap2;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class test extends PApplet {
	UnfoldingMap map1;
	UnfoldingMap map2;
	private static boolean offline=false;
	public void setup()
	{
		size(800,600,OPENGL);
		this.background(200,200,200);
		AbstractMapProvider provider=new Google.GoogleTerrainProvider();
		map1= new UnfoldingMap(this,50,50,350,500,provider);
		int zoomlevel=5;
		map1.zoomAndPanTo(zoomlevel,new Location(32.9f,-112.7f));
		MapUtils.createDefaultEventDispatcher(this, map1);
		map2=new UnfoldingMap(this,550,50,350,500,provider);
		int zoomlevel1=5;
		map2.zoomAndPanTo(zoomlevel1,new Location(22.9f,43.2f));
		MapUtils.createDefaultEventDispatcher(this, map2);
	}
	public void draw()
	{
		map1.draw();
		map2.draw();
	}

}
