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

@Tag("47")
class Record_1552 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1552: FirstName is Jason")
	void FirstNameOfRecord1552() {
		assertEquals("Jason", customers.get(1551).getFirstName());
	}

	@Test
	@DisplayName("Record 1552: LastName is Dozer")
	void LastNameOfRecord1552() {
		assertEquals("Dozer", customers.get(1551).getLastName());
	}

	@Test
	@DisplayName("Record 1552: Company is Price Waterhouse Cpa Prac Ofc")
	void CompanyOfRecord1552() {
		assertEquals("Price Waterhouse Cpa Prac Ofc", customers.get(1551).getCompany());
	}

	@Test
	@DisplayName("Record 1552: Address is Deer Run Subdivision")
	void AddressOfRecord1552() {
		assertEquals("Deer Run Subdivision", customers.get(1551).getAddress());
	}

	@Test
	@DisplayName("Record 1552: City is Eagle Pass")
	void CityOfRecord1552() {
		assertEquals("Eagle Pass", customers.get(1551).getCity());
	}

	@Test
	@DisplayName("Record 1552: County is Maverick")
	void CountyOfRecord1552() {
		assertEquals("Maverick", customers.get(1551).getCounty());
	}

	@Test
	@DisplayName("Record 1552: State is TX")
	void StateOfRecord1552() {
		assertEquals("TX", customers.get(1551).getState());
	}

	@Test
	@DisplayName("Record 1552: ZIP is 78852")
	void ZIPOfRecord1552() {
		assertEquals("78852", customers.get(1551).getZIP());
	}

	@Test
	@DisplayName("Record 1552: Phone is 830-773-9058")
	void PhoneOfRecord1552() {
		assertEquals("830-773-9058", customers.get(1551).getPhone());
	}

	@Test
	@DisplayName("Record 1552: Fax is 830-773-2366")
	void FaxOfRecord1552() {
		assertEquals("830-773-2366", customers.get(1551).getFax());
	}

	@Test
	@DisplayName("Record 1552: Email is jason@dozer.com")
	void EmailOfRecord1552() {
		assertEquals("jason@dozer.com", customers.get(1551).getEmail());
	}

	@Test
	@DisplayName("Record 1552: Web is http://www.jasondozer.com")
	void WebOfRecord1552() {
		assertEquals("http://www.jasondozer.com", customers.get(1551).getWeb());
	}
}
