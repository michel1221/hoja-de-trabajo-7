public class BinaryTree2 { 
	protected Node raiz;
	public void addNode(String ingles, String espanol) {
		Node newNode = new Node(ingles, espanol);
		if (raiz == null) {
			raiz = newNode;
		} 
		else {
			Node focusNode = raiz;
			Node parent;
			while (true) {
				parent = focusNode;
				if (ingles.compareTo(focusNode.ingles) < 0) {
					focusNode = focusNode.nodoIzquierda;
					if (focusNode == null) {
						parent.nodoIzquierda = newNode;
						return;
					}
				} 
				else {
					focusNode = focusNode.nodoDerecha;
					if (focusNode == null) {
						parent.nodoDerecha = newNode;
						return;
					}
				}
			}
		}
	}
	 public Node findNode(String ingles) {
		Node focusNode = raiz;
		while ((focusNode.ingles).compareTo(ingles) !=0) {
			if (ingles.compareTo(focusNode.ingles) < 0) {
				focusNode = focusNode.nodoIzquierda;
			} 
			else {
				focusNode = focusNode.nodoDerecha;
			}
			if (focusNode == null)
				return null;
		}
		return focusNode;
	}
	public String traducirPalabra(String ingles) {
		Node focusNode = raiz;
		int cont = 0;
		while(cont < 3){
			if (recursiveTraducir(focusNode,ingles) != 5){
				if (recursiveTraducir(focusNode, ingles) == 0){
					String res = focusNode.espanol;
					return res;
				} 
				if (recursiveTraducir(focusNode, ingles) < 0){
					try{
						focusNode = focusNode.nodoIzquierda;
						//System.out.println(focusNode.ingles);
					}
					catch( NullPointerException name){
						return null;
					}
					cont++;
				}
				else{
					try{
						focusNode = focusNode.nodoDerecha;
						//System.out.println(focusNode.ingles);
					}
					catch( NullPointerException name){
						return null;
					}
					cont++;
				}
			}
			else{
				return null;
			}
		}
		return null;
	}
	private static int recursiveTraducir(Node nod, String ing){
		try{
			return ing.compareTo(nod.ingles);
		}
		catch( NullPointerException name){
		}
		return 5;
	}
	
	public void inOrder(Node nodoOrdenar) { //Metodo recursivo tomado de http://www.programmerinterview.com/index.php/data-structures/inorder-traversal/
		if (nodoOrdenar != null) {
			inOrder(nodoOrdenar.nodoIzquierda);
			System.out.println(nodoOrdenar);
			inOrder(nodoOrdenar.nodoDerecha);
		}
	}
}