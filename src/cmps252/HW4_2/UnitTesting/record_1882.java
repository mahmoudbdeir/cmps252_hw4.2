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

@Tag("28")
class Record_1882 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1882: FirstName is Rosetta")
	void FirstNameOfRecord1882() {
		assertEquals("Rosetta", customers.get(1881).getFirstName());
	}

	@Test
	@DisplayName("Record 1882: LastName is Kudej")
	void LastNameOfRecord1882() {
		assertEquals("Kudej", customers.get(1881).getLastName());
	}

	@Test
	@DisplayName("Record 1882: Company is Southwest National Bank Of Pa")
	void CompanyOfRecord1882() {
		assertEquals("Southwest National Bank Of Pa", customers.get(1881).getCompany());
	}

	@Test
	@DisplayName("Record 1882: Address is 5530 E 52nd Ave")
	void AddressOfRecord1882() {
		assertEquals("5530 E 52nd Ave", customers.get(1881).getAddress());
	}

	@Test
	@DisplayName("Record 1882: City is Commerce City")
	void CityOfRecord1882() {
		assertEquals("Commerce City", customers.get(1881).getCity());
	}

	@Test
	@DisplayName("Record 1882: County is Adams")
	void CountyOfRecord1882() {
		assertEquals("Adams", customers.get(1881).getCounty());
	}

	@Test
	@DisplayName("Record 1882: State is CO")
	void StateOfRecord1882() {
		assertEquals("CO", customers.get(1881).getState());
	}

	@Test
	@DisplayName("Record 1882: ZIP is 80022")
	void ZIPOfRecord1882() {
		assertEquals("80022", customers.get(1881).getZIP());
	}

	@Test
	@DisplayName("Record 1882: Phone is 303-287-3188")
	void PhoneOfRecord1882() {
		assertEquals("303-287-3188", customers.get(1881).getPhone());
	}

	@Test
	@DisplayName("Record 1882: Fax is 303-287-7597")
	void FaxOfRecord1882() {
		assertEquals("303-287-7597", customers.get(1881).getFax());
	}

	@Test
	@DisplayName("Record 1882: Email is rosetta@kudej.com")
	void EmailOfRecord1882() {
		assertEquals("rosetta@kudej.com", customers.get(1881).getEmail());
	}

	@Test
	@DisplayName("Record 1882: Web is http://www.rosettakudej.com")
	void WebOfRecord1882() {
		assertEquals("http://www.rosettakudej.com", customers.get(1881).getWeb());
	}
}
