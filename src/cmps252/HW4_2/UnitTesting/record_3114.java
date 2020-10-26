package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("13")
class Record_3114 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3114: FirstName is Kenton")
	void FirstNameOfRecord3114() {
		assertEquals("Kenton", customers.get(3113).getFirstName());
	}

	@Test
	@DisplayName("Record 3114: LastName is Brathwaite")
	void LastNameOfRecord3114() {
		assertEquals("Brathwaite", customers.get(3113).getLastName());
	}

	@Test
	@DisplayName("Record 3114: Company is Ashleys")
	void CompanyOfRecord3114() {
		assertEquals("Ashleys", customers.get(3113).getCompany());
	}

	@Test
	@DisplayName("Record 3114: Address is 7150 W Central Ave")
	void AddressOfRecord3114() {
		assertEquals("7150 W Central Ave", customers.get(3113).getAddress());
	}

	@Test
	@DisplayName("Record 3114: City is Toledo")
	void CityOfRecord3114() {
		assertEquals("Toledo", customers.get(3113).getCity());
	}

	@Test
	@DisplayName("Record 3114: County is Lucas")
	void CountyOfRecord3114() {
		assertEquals("Lucas", customers.get(3113).getCounty());
	}

	@Test
	@DisplayName("Record 3114: State is OH")
	void StateOfRecord3114() {
		assertEquals("OH", customers.get(3113).getState());
	}

	@Test
	@DisplayName("Record 3114: ZIP is 43617")
	void ZIPOfRecord3114() {
		assertEquals("43617", customers.get(3113).getZIP());
	}

	@Test
	@DisplayName("Record 3114: Phone is 419-843-3889")
	void PhoneOfRecord3114() {
		assertEquals("419-843-3889", customers.get(3113).getPhone());
	}

	@Test
	@DisplayName("Record 3114: Fax is 419-843-7982")
	void FaxOfRecord3114() {
		assertEquals("419-843-7982", customers.get(3113).getFax());
	}

	@Test
	@DisplayName("Record 3114: Email is kenton@brathwaite.com")
	void EmailOfRecord3114() {
		assertEquals("kenton@brathwaite.com", customers.get(3113).getEmail());
	}

	@Test
	@DisplayName("Record 3114: Web is http://www.kentonbrathwaite.com")
	void WebOfRecord3114() {
		assertEquals("http://www.kentonbrathwaite.com", customers.get(3113).getWeb());
	}
}
