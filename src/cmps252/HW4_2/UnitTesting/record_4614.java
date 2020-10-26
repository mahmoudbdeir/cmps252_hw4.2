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

@Tag("30")
class Record_4614 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4614: FirstName is Randell")
	void FirstNameOfRecord4614() {
		assertEquals("Randell", customers.get(4613).getFirstName());
	}

	@Test
	@DisplayName("Record 4614: LastName is Lovenduski")
	void LastNameOfRecord4614() {
		assertEquals("Lovenduski", customers.get(4613).getLastName());
	}

	@Test
	@DisplayName("Record 4614: Company is Griffin Companies")
	void CompanyOfRecord4614() {
		assertEquals("Griffin Companies", customers.get(4613).getCompany());
	}

	@Test
	@DisplayName("Record 4614: Address is 7135 James St")
	void AddressOfRecord4614() {
		assertEquals("7135 James St", customers.get(4613).getAddress());
	}

	@Test
	@DisplayName("Record 4614: City is Philadelphia")
	void CityOfRecord4614() {
		assertEquals("Philadelphia", customers.get(4613).getCity());
	}

	@Test
	@DisplayName("Record 4614: County is Philadelphia")
	void CountyOfRecord4614() {
		assertEquals("Philadelphia", customers.get(4613).getCounty());
	}

	@Test
	@DisplayName("Record 4614: State is PA")
	void StateOfRecord4614() {
		assertEquals("PA", customers.get(4613).getState());
	}

	@Test
	@DisplayName("Record 4614: ZIP is 19135")
	void ZIPOfRecord4614() {
		assertEquals("19135", customers.get(4613).getZIP());
	}

	@Test
	@DisplayName("Record 4614: Phone is 215-338-0292")
	void PhoneOfRecord4614() {
		assertEquals("215-338-0292", customers.get(4613).getPhone());
	}

	@Test
	@DisplayName("Record 4614: Fax is 215-338-9512")
	void FaxOfRecord4614() {
		assertEquals("215-338-9512", customers.get(4613).getFax());
	}

	@Test
	@DisplayName("Record 4614: Email is randell@lovenduski.com")
	void EmailOfRecord4614() {
		assertEquals("randell@lovenduski.com", customers.get(4613).getEmail());
	}

	@Test
	@DisplayName("Record 4614: Web is http://www.randelllovenduski.com")
	void WebOfRecord4614() {
		assertEquals("http://www.randelllovenduski.com", customers.get(4613).getWeb());
	}
}
