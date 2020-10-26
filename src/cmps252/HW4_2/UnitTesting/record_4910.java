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

@Tag("6")
class Record_4910 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4910: FirstName is Kathryn")
	void FirstNameOfRecord4910() {
		assertEquals("Kathryn", customers.get(4909).getFirstName());
	}

	@Test
	@DisplayName("Record 4910: LastName is Margolin")
	void LastNameOfRecord4910() {
		assertEquals("Margolin", customers.get(4909).getLastName());
	}

	@Test
	@DisplayName("Record 4910: Company is Executive Vinyl Window Co")
	void CompanyOfRecord4910() {
		assertEquals("Executive Vinyl Window Co", customers.get(4909).getCompany());
	}

	@Test
	@DisplayName("Record 4910: Address is 7905 Southern Blvd")
	void AddressOfRecord4910() {
		assertEquals("7905 Southern Blvd", customers.get(4909).getAddress());
	}

	@Test
	@DisplayName("Record 4910: City is Youngstown")
	void CityOfRecord4910() {
		assertEquals("Youngstown", customers.get(4909).getCity());
	}

	@Test
	@DisplayName("Record 4910: County is Mahoning")
	void CountyOfRecord4910() {
		assertEquals("Mahoning", customers.get(4909).getCounty());
	}

	@Test
	@DisplayName("Record 4910: State is OH")
	void StateOfRecord4910() {
		assertEquals("OH", customers.get(4909).getState());
	}

	@Test
	@DisplayName("Record 4910: ZIP is 44512")
	void ZIPOfRecord4910() {
		assertEquals("44512", customers.get(4909).getZIP());
	}

	@Test
	@DisplayName("Record 4910: Phone is 330-758-2790")
	void PhoneOfRecord4910() {
		assertEquals("330-758-2790", customers.get(4909).getPhone());
	}

	@Test
	@DisplayName("Record 4910: Fax is 330-758-3086")
	void FaxOfRecord4910() {
		assertEquals("330-758-3086", customers.get(4909).getFax());
	}

	@Test
	@DisplayName("Record 4910: Email is kathryn@margolin.com")
	void EmailOfRecord4910() {
		assertEquals("kathryn@margolin.com", customers.get(4909).getEmail());
	}

	@Test
	@DisplayName("Record 4910: Web is http://www.kathrynmargolin.com")
	void WebOfRecord4910() {
		assertEquals("http://www.kathrynmargolin.com", customers.get(4909).getWeb());
	}
}
