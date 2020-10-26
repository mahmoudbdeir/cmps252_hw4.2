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

@Tag("10")
class Record_729 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 729: FirstName is Rhonda")
	void FirstNameOfRecord729() {
		assertEquals("Rhonda", customers.get(728).getFirstName());
	}

	@Test
	@DisplayName("Record 729: LastName is Badura")
	void LastNameOfRecord729() {
		assertEquals("Badura", customers.get(728).getLastName());
	}

	@Test
	@DisplayName("Record 729: Company is Busch, Stephen D Esq")
	void CompanyOfRecord729() {
		assertEquals("Busch, Stephen D Esq", customers.get(728).getCompany());
	}

	@Test
	@DisplayName("Record 729: Address is 1425 Armitage Ave")
	void AddressOfRecord729() {
		assertEquals("1425 Armitage Ave", customers.get(728).getAddress());
	}

	@Test
	@DisplayName("Record 729: City is Melrose Park")
	void CityOfRecord729() {
		assertEquals("Melrose Park", customers.get(728).getCity());
	}

	@Test
	@DisplayName("Record 729: County is Cook")
	void CountyOfRecord729() {
		assertEquals("Cook", customers.get(728).getCounty());
	}

	@Test
	@DisplayName("Record 729: State is IL")
	void StateOfRecord729() {
		assertEquals("IL", customers.get(728).getState());
	}

	@Test
	@DisplayName("Record 729: ZIP is 60160")
	void ZIPOfRecord729() {
		assertEquals("60160", customers.get(728).getZIP());
	}

	@Test
	@DisplayName("Record 729: Phone is 708-345-9951")
	void PhoneOfRecord729() {
		assertEquals("708-345-9951", customers.get(728).getPhone());
	}

	@Test
	@DisplayName("Record 729: Fax is 708-345-6676")
	void FaxOfRecord729() {
		assertEquals("708-345-6676", customers.get(728).getFax());
	}

	@Test
	@DisplayName("Record 729: Email is rhonda@badura.com")
	void EmailOfRecord729() {
		assertEquals("rhonda@badura.com", customers.get(728).getEmail());
	}

	@Test
	@DisplayName("Record 729: Web is http://www.rhondabadura.com")
	void WebOfRecord729() {
		assertEquals("http://www.rhondabadura.com", customers.get(728).getWeb());
	}
}
