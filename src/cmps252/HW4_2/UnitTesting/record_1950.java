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

@Tag("22")
class Record_1950 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1950: FirstName is Theo")
	void FirstNameOfRecord1950() {
		assertEquals("Theo", customers.get(1949).getFirstName());
	}

	@Test
	@DisplayName("Record 1950: LastName is Furness")
	void LastNameOfRecord1950() {
		assertEquals("Furness", customers.get(1949).getLastName());
	}

	@Test
	@DisplayName("Record 1950: Company is Vasquez, Raul Reza Esq")
	void CompanyOfRecord1950() {
		assertEquals("Vasquez, Raul Reza Esq", customers.get(1949).getCompany());
	}

	@Test
	@DisplayName("Record 1950: Address is 925 Schwab Rd")
	void AddressOfRecord1950() {
		assertEquals("925 Schwab Rd", customers.get(1949).getAddress());
	}

	@Test
	@DisplayName("Record 1950: City is Hatfield")
	void CityOfRecord1950() {
		assertEquals("Hatfield", customers.get(1949).getCity());
	}

	@Test
	@DisplayName("Record 1950: County is Montgomery")
	void CountyOfRecord1950() {
		assertEquals("Montgomery", customers.get(1949).getCounty());
	}

	@Test
	@DisplayName("Record 1950: State is PA")
	void StateOfRecord1950() {
		assertEquals("PA", customers.get(1949).getState());
	}

	@Test
	@DisplayName("Record 1950: ZIP is 19440")
	void ZIPOfRecord1950() {
		assertEquals("19440", customers.get(1949).getZIP());
	}

	@Test
	@DisplayName("Record 1950: Phone is 215-855-7238")
	void PhoneOfRecord1950() {
		assertEquals("215-855-7238", customers.get(1949).getPhone());
	}

	@Test
	@DisplayName("Record 1950: Fax is 215-855-2451")
	void FaxOfRecord1950() {
		assertEquals("215-855-2451", customers.get(1949).getFax());
	}

	@Test
	@DisplayName("Record 1950: Email is theo@furness.com")
	void EmailOfRecord1950() {
		assertEquals("theo@furness.com", customers.get(1949).getEmail());
	}

	@Test
	@DisplayName("Record 1950: Web is http://www.theofurness.com")
	void WebOfRecord1950() {
		assertEquals("http://www.theofurness.com", customers.get(1949).getWeb());
	}
}
