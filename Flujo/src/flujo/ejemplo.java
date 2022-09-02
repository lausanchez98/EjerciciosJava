package flujo;

//Reutilizar el mismo For
//Ubicar variables globales
//Refactorizar System.out

public class ejemplo {

	public static void main(String[] args) {
		String countryNews = "";
		String[] newsTitles ={
		        "China usara energia renovable", 
		        "La economía de USA continúa creciendo", 
		        "Hackers roban 1 millón de BTC.",
		        "Nueva batería eléctrica dura más", 
		        "Aprende a programar haciéndolo" 
		    };
	
		    for(int i = 0; i < newsTitles.length; i++) {
		        System.out.println("Noticias" + (i + 1) + ":" + newsTitles[i]);
		    }
		    
//		loopNews("USA");
//		System.out.println("USA News: " + countryNews);
//		loopNews("China");
//		System.out.println("China News: " + countryNews);
		    
	}// main
	
}// class
