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

@Tag("4")
class Record_4877 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4877: FirstName is Shannon")
	void FirstNameOfRecord4877() {
		assertEquals("Shannon", customers.get(4876).getFirstName());
	}

	@Test
	@DisplayName("Record 4877: LastName is Peterman")
	void LastNameOfRecord4877() {
		assertEquals("Peterman", customers.get(4876).getLastName());
	}

	@Test
	@DisplayName("Record 4877: Company is Lite Specialty Metal Works Inc")
	void CompanyOfRecord4877() {
		assertEquals("Lite Specialty Metal Works Inc", customers.get(4876).getCompany());
	}

	@Test
	@DisplayName("Record 4877: Address is 221 9th Ave N")
	void AddressOfRecord4877() {
		assertEquals("221 9th Ave N", customers.get(4876).getAddress());
	}

	@Test
	@DisplayName("Record 4877: City is Seattle")
	void CityOfRecord4877() {
		assertEquals("Seattle", customers.get(4876).getCity());
	}

	@Test
	@DisplayName("Record 4877: County is King")
	void CountyOfRecord4877() {
		assertEquals("King", customers.get(4876).getCounty());
	}

	@Test
	@DisplayName("Record 4877: State is WA")
	void StateOfRecord4877() {
		assertEquals("WA", customers.get(4876).getState());
	}

	@Test
	@DisplayName("Record 4877: ZIP is 98109")
	void ZIPOfRecord4877() {
		assertEquals("98109", customers.get(4876).getZIP());
	}

	@Test
	@DisplayName("Record 4877: Phone is 206-624-1628")
	void PhoneOfRecord4877() {
		assertEquals("206-624-1628", customers.get(4876).getPhone());
	}

	@Test
	@DisplayName("Record 4877: Fax is 206-624-2577")
	void FaxOfRecord4877() {
		assertEquals("206-624-2577", customers.get(4876).getFax());
	}

	@Test
	@DisplayName("Record 4877: Email is shannon@peterman.com")
	void EmailOfRecord4877() {
		assertEquals("shannon@peterman.com", customers.get(4876).getEmail());
	}

	@Test
	@DisplayName("Record 4877: Web is http://www.shannonpeterman.com")
	void WebOfRecord4877() {
		assertEquals("http://www.shannonpeterman.com", customers.get(4876).getWeb());
	}
}
