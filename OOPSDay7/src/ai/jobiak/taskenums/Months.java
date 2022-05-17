package ai.jobiak.taskenums;

public enum Months {

	January(31), February(28, 29), March(31), April(30), May(31), June(30), July(31), August(31), September(30),
	October(31), November(30), December(31);

	int days, leapYear, nonLeapYear;

	Months(int days) {
		this.days = days;
	}

	private Months(int leapYear, int nonLeapYear) {

		this.leapYear = leapYear;
		this.nonLeapYear = nonLeapYear;
	}

	int showDays() {
		return this.days;
	}

	int showLeap() {
		return leapYear;
	}

	int showNonLeap() {
		return nonLeapYear;
	}

}
