
class Link {
	private Node root;

	class Node {
		private String data;
		private Node next;

		Node(String data) {
			this.data = data;
		}

		public void add(Node nextNode) {
			if (this.next == null) {
				this.next = nextNode;
			} else {
				this.next.add(nextNode);
			}
		}

		public void delete(Node previous, String data) {
			if (data.equals(this.data)) {
				previous.next = next;
			} else {
				if (this.next != null) {
					this.next.delete(this, data);
				}
			}
		}

		public boolean search(String data) {
			if (data.equals(this.data)) {
				return true;
			} else {
				if (this.next != null) {
					return this.next.search(data);
				} else {
					return false;
				}
			}

		}
		public void print(){
			System.out.println(data);
			if(this.next!=null){
				this.next.print();
			}
		}
	};

	public void addNode(String data) {
		Node newNode = new Node(data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.add(newNode);
		}
	}

	public void deleteNode(String data) {
		while(this.contains(data)){
			if(this.root.data.equals(data)){
				this.root=root.next;
			}
			else{
				this.root.next.delete(root, data);
			}
		}
	}
	public boolean	contains(String name){
		return this.root.search(name);
	}
	public	void printNode(){
		if(this.root!=null){
			this.root.print();
		}
	}
};

public class whj_no_jeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link p=new Link();
		p.addNode("1");
		p.addNode("2");
		p.addNode("3");
		p.addNode("3");
		p.addNode("4");
		p.addNode("5");
		p.deleteNode("3");
		p.printNode();
	}
}
