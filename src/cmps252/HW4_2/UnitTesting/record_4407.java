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

@Tag("16")
class Record_4407 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4407: FirstName is Madelyn")
	void FirstNameOfRecord4407() {
		assertEquals("Madelyn", customers.get(4406).getFirstName());
	}

	@Test
	@DisplayName("Record 4407: LastName is Easey")
	void LastNameOfRecord4407() {
		assertEquals("Easey", customers.get(4406).getLastName());
	}

	@Test
	@DisplayName("Record 4407: Company is Lees Signs")
	void CompanyOfRecord4407() {
		assertEquals("Lees Signs", customers.get(4406).getCompany());
	}

	@Test
	@DisplayName("Record 4407: Address is 201 E Jackson St")
	void AddressOfRecord4407() {
		assertEquals("201 E Jackson St", customers.get(4406).getAddress());
	}

	@Test
	@DisplayName("Record 4407: City is Muncie")
	void CityOfRecord4407() {
		assertEquals("Muncie", customers.get(4406).getCity());
	}

	@Test
	@DisplayName("Record 4407: County is Delaware")
	void CountyOfRecord4407() {
		assertEquals("Delaware", customers.get(4406).getCounty());
	}

	@Test
	@DisplayName("Record 4407: State is IN")
	void StateOfRecord4407() {
		assertEquals("IN", customers.get(4406).getState());
	}

	@Test
	@DisplayName("Record 4407: ZIP is 47305")
	void ZIPOfRecord4407() {
		assertEquals("47305", customers.get(4406).getZIP());
	}

	@Test
	@DisplayName("Record 4407: Phone is 765-288-1723")
	void PhoneOfRecord4407() {
		assertEquals("765-288-1723", customers.get(4406).getPhone());
	}

	@Test
	@DisplayName("Record 4407: Fax is 765-288-0224")
	void FaxOfRecord4407() {
		assertEquals("765-288-0224", customers.get(4406).getFax());
	}

	@Test
	@DisplayName("Record 4407: Email is madelyn@easey.com")
	void EmailOfRecord4407() {
		assertEquals("madelyn@easey.com", customers.get(4406).getEmail());
	}

	@Test
	@DisplayName("Record 4407: Web is http://www.madelyneasey.com")
	void WebOfRecord4407() {
		assertEquals("http://www.madelyneasey.com", customers.get(4406).getWeb());
	}
}
