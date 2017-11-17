import java.awt.Color;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;
import Felter.*;

public class Spilbræt {

	private Felt[] felter = new Felt[24];	
	
	public Spilbræt() {
		initializeFields();
	}

	private void initializeFields() {	
		GUI gui = new GUI();
		GUI_Field[] f = new GUI_Field[24];
				
		felter[0] = new StartFelt(1, 1, 1, 8, "Spiller0", "Turkis", "START!", 2);
		GUI_Field a= new GUI_Street();
		a.setTitle(felter[1].hentFeltTekst());
		a.setBackGroundColor(Color.pink);
		f[0] = a;
		
		felter[1] = new NormalFelt(2, 1, 1, 1, "Spiller0", "blue", "Balkon boden", 3);	
		GUI_Field b= new GUI_Street();
		b.setTitle(felter[2].hentFeltTekst());
		b.setBackGroundColor(Color.blue);
		f[1] = b;
				
		felter[2] = new NormalFelt(3, 1, 1, 1, "Spiller0", "blue", "Candyfloss", 2);
		
		felter[3] = new TogFelt(4, 1, 1, 2, "Spiller0", "yellow", "Du får en ekstra tur");
		
		felter[4] = new NormalFelt(5, 2, 1, 1, "Spiller0", "yellow", "Dukkeforestillingen", 6);
		
		felter[5] = new NormalFelt(6, 2, 1, 1, "Spiller0", "yellow", "Trylleshowet", 5);
		
		felter[6] = new FyrværkeriEllerDelfinerFelt(7, 1, 1, 7, "Spiller0", "yellow", "Fyrværkeri", 2);
		
		felter[7] = new NormalFelt(8, 1, 1, 1, "Spiller0", "yellow", "Teater", 9);
		
		felter[8] = new NormalFelt(9, 1, 1, 1, "Spiller0", "yellow", "Legetøjsbutikken", 8);
		
		felter[9] = new CafeFelt(10, 1, 1, 5, "Spiller0", "yellow", "Du går på cafe", 3);
		
		felter[10] = new NormalFelt(11, 1, 1, 1, "Spiller0", "yellow", "Biografen", 12);
		
		felter[13] = new NormalFelt(12, 1, 1, 1, "Spiller0", "yellow", "Spillehallen", 11);
		
		felter[14] = new OnkelMangePengeFelt(13, 1, 1, 1, "Spiller0", "yellow", "Spillehallen", 2);
		
		felter[15] = new NormalFelt(14, 1, 1, 1, "Spiller0", "yellow", "Bowlinghallen", 15);
		
		felter[16] = new NormalFelt(15, 1, 1, 1, "Spiller0", "yellow", "Zoologisk have", 14);
		
		felter[17] = new TogFelt(16, 1, 1, 2, "Spiller0", "yellow", "Du får en ekstra tur");
		
		felter[18] = new NormalFelt(17, 1, 1, 1, "Spiller0", "yellow", "Vandlandet", 18);
		
		felter[19] = new NormalFelt(18, 1, 1, 1, "Spiller0", "yellow", "Strandpromenaden", 17);
		
		felter[20] = new FyrværkeriEllerDelfinerFelt(19, 1, 1, 7, "Spiller0", "yellow", "Delfiner", 2);
		
		felter[21] = new NormalFelt(20, 1, 1, 1, "Spiller0", "yellow", "Pizzaria", 21);
		
		felter[22] = new NormalFelt(21, 1, 1, 1, "Spiller0", "yellow", "Burgerbaren", 20);
		
		felter[23] = new GåTilCafeFelt(22, 1, 1, 7, "Spiller0", "yellow", "Delfiner", 10);
		
		felter[24] = new NormalFelt(23, 1, 1, 1, "Spiller0", "yellow", "Slikbutikken", 24);
		
		felter[25] = new NormalFelt(24, 1, 1, 1, "Spiller0", "yellow", "Isboden", 23);
		
	}
	
	public void opretSpilleBrætIGUI() {
		
		
	}
	
	public GUI hentSpilleBræt() {

		

		
		GUI_Field[] f = new GUI_Field[1];
		f[0] = g;
		new GUI(f);
		gui.showMessage("test");
		return gui;
	}

	public int hentType (int position) {
		int felttype;
		felttype = felter[position].hentType();
		return felttype;
	}
	
	
}
