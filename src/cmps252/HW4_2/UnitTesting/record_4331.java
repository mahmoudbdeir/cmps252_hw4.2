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

@Tag("19")
class Record_4331 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4331: FirstName is Cristina")
	void FirstNameOfRecord4331() {
		assertEquals("Cristina", customers.get(4330).getFirstName());
	}

	@Test
	@DisplayName("Record 4331: LastName is Mathey")
	void LastNameOfRecord4331() {
		assertEquals("Mathey", customers.get(4330).getLastName());
	}

	@Test
	@DisplayName("Record 4331: Company is Simons Dirctry Theatrcl Matl")
	void CompanyOfRecord4331() {
		assertEquals("Simons Dirctry Theatrcl Matl", customers.get(4330).getCompany());
	}

	@Test
	@DisplayName("Record 4331: Address is 150 Fayetteville Street Mall")
	void AddressOfRecord4331() {
		assertEquals("150 Fayetteville Street Mall", customers.get(4330).getAddress());
	}

	@Test
	@DisplayName("Record 4331: City is Ralygh")
	void CityOfRecord4331() {
		assertEquals("Ralygh", customers.get(4330).getCity());
	}

	@Test
	@DisplayName("Record 4331: County is Wake")
	void CountyOfRecord4331() {
		assertEquals("Wake", customers.get(4330).getCounty());
	}

	@Test
	@DisplayName("Record 4331: State is NC")
	void StateOfRecord4331() {
		assertEquals("NC", customers.get(4330).getState());
	}

	@Test
	@DisplayName("Record 4331: ZIP is 27601")
	void ZIPOfRecord4331() {
		assertEquals("27601", customers.get(4330).getZIP());
	}

	@Test
	@DisplayName("Record 4331: Phone is 919-833-1034")
	void PhoneOfRecord4331() {
		assertEquals("919-833-1034", customers.get(4330).getPhone());
	}

	@Test
	@DisplayName("Record 4331: Fax is 919-833-6848")
	void FaxOfRecord4331() {
		assertEquals("919-833-6848", customers.get(4330).getFax());
	}

	@Test
	@DisplayName("Record 4331: Email is cristina@mathey.com")
	void EmailOfRecord4331() {
		assertEquals("cristina@mathey.com", customers.get(4330).getEmail());
	}

	@Test
	@DisplayName("Record 4331: Web is http://www.cristinamathey.com")
	void WebOfRecord4331() {
		assertEquals("http://www.cristinamathey.com", customers.get(4330).getWeb());
	}
}
