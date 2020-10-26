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

@Tag("8")
class Record_4998 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4998: FirstName is Gale")
	void FirstNameOfRecord4998() {
		assertEquals("Gale", customers.get(4997).getFirstName());
	}

	@Test
	@DisplayName("Record 4998: LastName is Prazeres")
	void LastNameOfRecord4998() {
		assertEquals("Prazeres", customers.get(4997).getLastName());
	}

	@Test
	@DisplayName("Record 4998: Company is Pacific Circuits Assembly")
	void CompanyOfRecord4998() {
		assertEquals("Pacific Circuits Assembly", customers.get(4997).getCompany());
	}

	@Test
	@DisplayName("Record 4998: Address is 2686 Lisbon Rd")
	void AddressOfRecord4998() {
		assertEquals("2686 Lisbon Rd", customers.get(4997).getAddress());
	}

	@Test
	@DisplayName("Record 4998: City is Cleveland")
	void CityOfRecord4998() {
		assertEquals("Cleveland", customers.get(4997).getCity());
	}

	@Test
	@DisplayName("Record 4998: County is Cuyahoga")
	void CountyOfRecord4998() {
		assertEquals("Cuyahoga", customers.get(4997).getCounty());
	}

	@Test
	@DisplayName("Record 4998: State is OH")
	void StateOfRecord4998() {
		assertEquals("OH", customers.get(4997).getState());
	}

	@Test
	@DisplayName("Record 4998: ZIP is 44104")
	void ZIPOfRecord4998() {
		assertEquals("44104", customers.get(4997).getZIP());
	}

	@Test
	@DisplayName("Record 4998: Phone is 216-721-7412")
	void PhoneOfRecord4998() {
		assertEquals("216-721-7412", customers.get(4997).getPhone());
	}

	@Test
	@DisplayName("Record 4998: Fax is 216-721-3035")
	void FaxOfRecord4998() {
		assertEquals("216-721-3035", customers.get(4997).getFax());
	}

	@Test
	@DisplayName("Record 4998: Email is gale@prazeres.com")
	void EmailOfRecord4998() {
		assertEquals("gale@prazeres.com", customers.get(4997).getEmail());
	}

	@Test
	@DisplayName("Record 4998: Web is http://www.galeprazeres.com")
	void WebOfRecord4998() {
		assertEquals("http://www.galeprazeres.com", customers.get(4997).getWeb());
	}
}
