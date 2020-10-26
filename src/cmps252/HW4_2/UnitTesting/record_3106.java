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

@Tag("23")
class Record_3106 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3106: FirstName is Silvia")
	void FirstNameOfRecord3106() {
		assertEquals("Silvia", customers.get(3105).getFirstName());
	}

	@Test
	@DisplayName("Record 3106: LastName is Siers")
	void LastNameOfRecord3106() {
		assertEquals("Siers", customers.get(3105).getLastName());
	}

	@Test
	@DisplayName("Record 3106: Company is Country Fresh Mushrooms")
	void CompanyOfRecord3106() {
		assertEquals("Country Fresh Mushrooms", customers.get(3105).getCompany());
	}

	@Test
	@DisplayName("Record 3106: Address is 6000 S Marginal Rd")
	void AddressOfRecord3106() {
		assertEquals("6000 S Marginal Rd", customers.get(3105).getAddress());
	}

	@Test
	@DisplayName("Record 3106: City is Cleveland")
	void CityOfRecord3106() {
		assertEquals("Cleveland", customers.get(3105).getCity());
	}

	@Test
	@DisplayName("Record 3106: County is Cuyahoga")
	void CountyOfRecord3106() {
		assertEquals("Cuyahoga", customers.get(3105).getCounty());
	}

	@Test
	@DisplayName("Record 3106: State is OH")
	void StateOfRecord3106() {
		assertEquals("OH", customers.get(3105).getState());
	}

	@Test
	@DisplayName("Record 3106: ZIP is 44103")
	void ZIPOfRecord3106() {
		assertEquals("44103", customers.get(3105).getZIP());
	}

	@Test
	@DisplayName("Record 3106: Phone is 216-361-2258")
	void PhoneOfRecord3106() {
		assertEquals("216-361-2258", customers.get(3105).getPhone());
	}

	@Test
	@DisplayName("Record 3106: Fax is 216-361-0493")
	void FaxOfRecord3106() {
		assertEquals("216-361-0493", customers.get(3105).getFax());
	}

	@Test
	@DisplayName("Record 3106: Email is silvia@siers.com")
	void EmailOfRecord3106() {
		assertEquals("silvia@siers.com", customers.get(3105).getEmail());
	}

	@Test
	@DisplayName("Record 3106: Web is http://www.silviasiers.com")
	void WebOfRecord3106() {
		assertEquals("http://www.silviasiers.com", customers.get(3105).getWeb());
	}
}
