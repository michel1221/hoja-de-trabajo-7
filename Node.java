public class Node {
	protected String ingles;
	protected String espanol;
	protected Node nodoIzquierda;
	protected Node nodoDerecha;
	
	Node(String ingles, String espanol) {
		this.ingles = ingles;
		this.espanol = espanol;
	}
	
	public String toString() {
		return espanol + " es en ingles: " + ingles;
	}
	public String getIngles(){
		return ingles;
	}
	public String getEspanol(){
		return espanol;
	}
}
