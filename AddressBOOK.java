package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class student {
	int id ;
	String name ;
	String address;
	String state;
	long phonenum;
	String Lastname;
	int zipcode;
	
	ArrayList list = new ArrayList();
	Iterator<Person> iterator = list.listIterator();
	
	
	public void student(int id, String Firstname,String Lastname , String address, String state, int phonenum , int zipcode) {
		this.id = id;
		this.name = Firstname;
		this.address = address;
		this.state = state;
		this.phonenum = phonenum;
		this.Lastname=Lastname;
		
	}
		
		public String toString() {
	        return this.id + "," + this.name + " ," + this.address +","+ this.state +","+this.phonenum  ;
	}

		
		
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public long getPhonenum() {
			return phonenum;
		}

		public void setPhonenum(long phonenum) {
			this.phonenum = phonenum;
		}

		public String getLastname() {
			return Lastname;
		}

		public void setLastname(String lastname) {
			Lastname = lastname;
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}


		public void add() 
		{	
			 
				System.out.println("enter a new entry");
				Scanner s = new Scanner (System.in);
				student sr = new student ();
				
				ArrayList list= new ArrayList();
				list.add(sr);
				
				System.out.println("Enter the id:");
				int id = s.nextInt();
				setId(id);
				
		
				System.out.println("Enter the name:");
				String name = s.next();
				setName(name);
				
				System.out.println("Enter the address:");
				String lastname = s.next();
				setLastname( lastname);
				
				
				System.out.println("Enter the address:");
				String address = s.next();
				setAddress( address);
				
				
				System.out.println("Enter the state:");
				String state = s.next();
				setState( state);
				
				
				System.out.println("Enter the phone number:");
				int phonenum = s.nextInt();
				setPhonenum (phonenum);
				
				System.out.println("Enter the zipcode:");
				int zipcode = s.nextInt();
				setZipcode(zipcode);
				
				
			}
		
		public void edit() {
			Scanner s = new Scanner (System.in);
			System.out.println("Enter your First name:");
			String Firstname = s.next();
			
					System.out.println("Choose field you want to add:");
					System.out
							.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
					switch (s.nextInt()) {
					case 1:
						System.out.println("Re-Correct your lastname");
						address.setLastname(s.next());
						break;
					case 2:
						System.out.println("Re-Correct your Phone Number");
						address.setPhonenumber(s.nextLong());
						break;
					case 3:
						System.out.println("Re-Correct your City");
						address.setCity(s.next());
						break;
					case 4:
						System.out.println("Re-Correct your Zip");
						address.setZipcode(s.nextLong());
						break;
					case 5:
						System.out.println("Re-Correct your State");
						address.setState(s.next());
						break;
					}

				}
		
		public void delete() {
			System.out.println("Enter your First name:");
			Scanner s = new Scanner (System.in);
			String fname = s.next();

			Iterator<Person> iterator = list.listIterator();
			while (iterator.hasNext()) {
				Person person = iterator.next();

				if (fname.equals(person.getFname())) {
					list.remove(person);
				}
			}

		}
	}