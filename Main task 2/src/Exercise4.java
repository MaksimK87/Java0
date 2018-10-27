import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int day = 0, month = 0, year = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����:");
		day = in.nextInt();
		System.out.println("������� �����:");
		month = in.nextInt();
		System.out.println("������� ���:");
		year = in.nextInt();
		if(year%4==0) {
			System.out.println(leapYear(day,month,year));
		}
		if(year%4==0&&year%400==0) {
			System.out.println(leapYear(day,month,year));
		}
			
		if(year%4!=0) {
			System.out.println(nonleapYear(day,month,year));
		}
		if(year%4==0&&year%100==0)
			System.out.println(nonleapYear(day,month,year));


	}

	static String leapYear(int day, int month, int year) {
		
		int rateDay31 = 31, rateDay30 = 30, rateDay29 = 29, monthNext = 0;
		if (day == 31 && month == 12) {
			year++;
		}
		
			if (month % 2 == 0 && month < 8 && month > 2) {
				for (int rate = 1; rate <= rateDay30; rate++) {
					if (rate == day && day < rateDay30) {
						day++;
						monthNext = month + 1;
						break;
					} else if (day == rateDay30) {
						day = 1;
						monthNext = month + 1;
						break;
					}

				}

			} else if (month == 2) {
				for (int rate = 1; rate <= rateDay29; rate++) {
					if (rate == day && day != rateDay29) {
						day++;
						if (day == 29) {
							monthNext = 2;
						}
						break;
					} else if (day == rateDay29) {
						day = 1;
						monthNext = month + 1;
						break;

					}

				}
			} else if (month == 1) {

				for (int rate = 1; rate <= rateDay31; rate++) {
					if (rate == day && day != rateDay31) {
						day++;
						monthNext = month + 1;
						;
						break;
					} else if (day == rateDay31) {
						day = 1;
						monthNext = month + 1;
						;
						break;
					}

				}

			}
			if (month % 2 != 0 && month < 8 && month > 2) {
				for (int rate = 1; rate <= rateDay31; rate++) {
					if (rate == day && day != rateDay31) {
						day++;
						monthNext = month + 1;
						;
						break;
					} else if (day == rateDay31) {
						day = 1;
						monthNext = month + 1;
						;
						break;

					}
				}
			}
				if (month % 2 == 0 && month >= 8 && month <= 12) {
					for (int rate = 1; rate <= rateDay31; rate++) {
						if (rate == day && day != rateDay31) {
							day++;
							if (month == 12) {
								monthNext = 12;
							}
							break;
						} else if (day == rateDay31) {
							day = 1;
							if (month != 12) {
								monthNext = month + 1;
								break;
							} else {
								monthNext = 1;
								break;

							}
						}
					}
				} else if (month % 2 != 0 && month >= 8 && month <= 12) {
					for (int rate = 1; rate <= rateDay30; rate++) {
						if (rate == day && day != rateDay30) {
							day++;
							if (month == 12) {
								monthNext = 12;
							}
							break;
						} else if (day == rateDay30) {
							day = 1;
							if (month != 12) {
								monthNext = month + 1;
							} else {
								monthNext = 1;
								break;
							}

						}

					}
				}
				return "���� ���������� ���: " + day + " " + monthNext + " " + " " + year;
			}

	

	static String nonleapYear(int day, int month, int year) {
		int rateDay31 = 31, rateDay30 = 30, rateDay28 = 28, 
				monthNext = 0;
		if (day == 31 && month == 12) {
			year++;
		}
			if (month % 2 == 0 && month < 8 && month > 2) {
				for (int rate = 1; rate <= rateDay30; rate++) {
					if (rate == day && day < rateDay30) {
						day++;
						monthNext = month + 1;
						
						break;
					} else if (day == rateDay30) {
						day = 1;
						monthNext = month + 1;
						
						break;
					}

				}

			} else if (month == 2) {
				for (int rate = 1; rate <= rateDay28; rate++) {
					if (rate == day && day != rateDay28) {
						day++;
						if (day == 28) {
							monthNext = 2;
						}
						break;
					} else if (day == rateDay28) {
						day = 1;
						monthNext = month + 1;
						break;
					}

				}
			} else if (month == 1) {

				for (int rate = 1; rate <= rateDay31; rate++) {
					if (rate == day && day != rateDay31) {
						day++;
						monthNext = month + 1;
						break;
					} else if (day == rateDay31) {
						day = 1;
						monthNext = month + 1;
						break;
					}

				}

			}
			if (month % 2 != 0 && month < 8 && month > 2) {
				for (int rate = 1; rate <= rateDay31; rate++) {
					if (rate == day && day != rateDay31) {
						day++;
						monthNext = month + 1;
						break;
					} else if (day == rateDay31) {
						day = 1;
						monthNext = month + 1;
						break;

					}
				}
			}
			if (month % 2 == 0 && month >= 8 && month <= 12) {
				for (int rate = 1; rate <= rateDay31; rate++) {
					if (rate == day && day != rateDay31) {
						day++;
						if (month == 12) {
							monthNext = 12;
						}
						break;
					} else if (day == rateDay31) {
						day = 1;
						if (month != 12) {
							monthNext = month + 1;
							break;
						} else {
							monthNext = 1;
							break;
						}
					}
				}
			} else if (month % 2 != 0 && month >= 8 && month <= 12) {
				for (int rate = 1; rate <= rateDay30; rate++) {
					if (rate == day && day != rateDay30) {
						day++;
						if (month == 12) {
							monthNext = 12;
						}
						break;
					} else if (day == rateDay30) {
						day = 1;
						if (month != 12) {
							monthNext = month + 1;
							break;
						} else {
							monthNext = 1;
							break;
						}

					}

				}
			}

		
		return "���� ���������� ���: " + day + " " + monthNext + " " + " " +year;
	}

}