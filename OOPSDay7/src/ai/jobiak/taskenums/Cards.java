package ai.jobiak.taskenums;

public enum Cards {

Diamond(13),Heart(13),Club(13),Spade(13);
	int noofcards;
Cards(int noofcards) {
	this.noofcards=noofcards;
}
int showcards() {
	return this.noofcards;
}
}
