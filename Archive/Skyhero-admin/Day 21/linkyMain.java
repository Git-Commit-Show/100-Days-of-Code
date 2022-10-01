class linkyMain{
	public static void main(String[] args) {
		linkyListy list=new linkyListy();

		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(5);
		list.insertLast(10);
		list.insertFirst(40);
		list.insertLast(30);
		list.insert(100,3);
		list.deleteFirst();
		list.deleteLast();
		list.delete(3);
		list.display();
	}
}