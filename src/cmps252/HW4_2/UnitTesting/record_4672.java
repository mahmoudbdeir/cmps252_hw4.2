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

@Tag("43")
class Record_4672 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4672: FirstName is Carmel")
	void FirstNameOfRecord4672() {
		assertEquals("Carmel", customers.get(4671).getFirstName());
	}

	@Test
	@DisplayName("Record 4672: LastName is Harvest")
	void LastNameOfRecord4672() {
		assertEquals("Harvest", customers.get(4671).getLastName());
	}

	@Test
	@DisplayName("Record 4672: Company is Burpee Co")
	void CompanyOfRecord4672() {
		assertEquals("Burpee Co", customers.get(4671).getCompany());
	}

	@Test
	@DisplayName("Record 4672: Address is 311 Angell St")
	void AddressOfRecord4672() {
		assertEquals("311 Angell St", customers.get(4671).getAddress());
	}

	@Test
	@DisplayName("Record 4672: City is Providence")
	void CityOfRecord4672() {
		assertEquals("Providence", customers.get(4671).getCity());
	}

	@Test
	@DisplayName("Record 4672: County is Providence")
	void CountyOfRecord4672() {
		assertEquals("Providence", customers.get(4671).getCounty());
	}

	@Test
	@DisplayName("Record 4672: State is RI")
	void StateOfRecord4672() {
		assertEquals("RI", customers.get(4671).getState());
	}

	@Test
	@DisplayName("Record 4672: ZIP is 2906")
	void ZIPOfRecord4672() {
		assertEquals("2906", customers.get(4671).getZIP());
	}

	@Test
	@DisplayName("Record 4672: Phone is 401-621-4790")
	void PhoneOfRecord4672() {
		assertEquals("401-621-4790", customers.get(4671).getPhone());
	}

	@Test
	@DisplayName("Record 4672: Fax is 401-621-6095")
	void FaxOfRecord4672() {
		assertEquals("401-621-6095", customers.get(4671).getFax());
	}

	@Test
	@DisplayName("Record 4672: Email is carmel@harvest.com")
	void EmailOfRecord4672() {
		assertEquals("carmel@harvest.com", customers.get(4671).getEmail());
	}

	@Test
	@DisplayName("Record 4672: Web is http://www.carmelharvest.com")
	void WebOfRecord4672() {
		assertEquals("http://www.carmelharvest.com", customers.get(4671).getWeb());
	}
}
