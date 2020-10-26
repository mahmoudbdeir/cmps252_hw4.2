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

@Tag("2")
class Record_4775 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4775: FirstName is Maurice")
	void FirstNameOfRecord4775() {
		assertEquals("Maurice", customers.get(4774).getFirstName());
	}

	@Test
	@DisplayName("Record 4775: LastName is Rickman")
	void LastNameOfRecord4775() {
		assertEquals("Rickman", customers.get(4774).getLastName());
	}

	@Test
	@DisplayName("Record 4775: Company is West Hawaii Today")
	void CompanyOfRecord4775() {
		assertEquals("West Hawaii Today", customers.get(4774).getCompany());
	}

	@Test
	@DisplayName("Record 4775: Address is 15400 Pearl Rd")
	void AddressOfRecord4775() {
		assertEquals("15400 Pearl Rd", customers.get(4774).getAddress());
	}

	@Test
	@DisplayName("Record 4775: City is Strongsville")
	void CityOfRecord4775() {
		assertEquals("Strongsville", customers.get(4774).getCity());
	}

	@Test
	@DisplayName("Record 4775: County is Cuyahoga")
	void CountyOfRecord4775() {
		assertEquals("Cuyahoga", customers.get(4774).getCounty());
	}

	@Test
	@DisplayName("Record 4775: State is OH")
	void StateOfRecord4775() {
		assertEquals("OH", customers.get(4774).getState());
	}

	@Test
	@DisplayName("Record 4775: ZIP is 44136")
	void ZIPOfRecord4775() {
		assertEquals("44136", customers.get(4774).getZIP());
	}

	@Test
	@DisplayName("Record 4775: Phone is 440-846-3142")
	void PhoneOfRecord4775() {
		assertEquals("440-846-3142", customers.get(4774).getPhone());
	}

	@Test
	@DisplayName("Record 4775: Fax is 440-846-4645")
	void FaxOfRecord4775() {
		assertEquals("440-846-4645", customers.get(4774).getFax());
	}

	@Test
	@DisplayName("Record 4775: Email is maurice@rickman.com")
	void EmailOfRecord4775() {
		assertEquals("maurice@rickman.com", customers.get(4774).getEmail());
	}

	@Test
	@DisplayName("Record 4775: Web is http://www.mauricerickman.com")
	void WebOfRecord4775() {
		assertEquals("http://www.mauricerickman.com", customers.get(4774).getWeb());
	}
}
