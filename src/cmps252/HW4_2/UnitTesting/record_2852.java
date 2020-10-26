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

@Tag("6")
class Record_2852 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2852: FirstName is Merry")
	void FirstNameOfRecord2852() {
		assertEquals("Merry", customers.get(2851).getFirstName());
	}

	@Test
	@DisplayName("Record 2852: LastName is Adelmund")
	void LastNameOfRecord2852() {
		assertEquals("Adelmund", customers.get(2851).getLastName());
	}

	@Test
	@DisplayName("Record 2852: Company is Batten, David H Esq")
	void CompanyOfRecord2852() {
		assertEquals("Batten, David H Esq", customers.get(2851).getCompany());
	}

	@Test
	@DisplayName("Record 2852: Address is 202 E 26th Ave")
	void AddressOfRecord2852() {
		assertEquals("202 E 26th Ave", customers.get(2851).getAddress());
	}

	@Test
	@DisplayName("Record 2852: City is Anchorage")
	void CityOfRecord2852() {
		assertEquals("Anchorage", customers.get(2851).getCity());
	}

	@Test
	@DisplayName("Record 2852: County is Anchorage")
	void CountyOfRecord2852() {
		assertEquals("Anchorage", customers.get(2851).getCounty());
	}

	@Test
	@DisplayName("Record 2852: State is AK")
	void StateOfRecord2852() {
		assertEquals("AK", customers.get(2851).getState());
	}

	@Test
	@DisplayName("Record 2852: ZIP is 99503")
	void ZIPOfRecord2852() {
		assertEquals("99503", customers.get(2851).getZIP());
	}

	@Test
	@DisplayName("Record 2852: Phone is 907-276-4175")
	void PhoneOfRecord2852() {
		assertEquals("907-276-4175", customers.get(2851).getPhone());
	}

	@Test
	@DisplayName("Record 2852: Fax is 907-276-0833")
	void FaxOfRecord2852() {
		assertEquals("907-276-0833", customers.get(2851).getFax());
	}

	@Test
	@DisplayName("Record 2852: Email is merry@adelmund.com")
	void EmailOfRecord2852() {
		assertEquals("merry@adelmund.com", customers.get(2851).getEmail());
	}

	@Test
	@DisplayName("Record 2852: Web is http://www.merryadelmund.com")
	void WebOfRecord2852() {
		assertEquals("http://www.merryadelmund.com", customers.get(2851).getWeb());
	}
}
