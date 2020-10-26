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

@Tag("45")
class Record_2965 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2965: FirstName is Orval")
	void FirstNameOfRecord2965() {
		assertEquals("Orval", customers.get(2964).getFirstName());
	}

	@Test
	@DisplayName("Record 2965: LastName is Kaaz")
	void LastNameOfRecord2965() {
		assertEquals("Kaaz", customers.get(2964).getLastName());
	}

	@Test
	@DisplayName("Record 2965: Company is Restorr Technology")
	void CompanyOfRecord2965() {
		assertEquals("Restorr Technology", customers.get(2964).getCompany());
	}

	@Test
	@DisplayName("Record 2965: Address is 1621 E 82nd Ave")
	void AddressOfRecord2965() {
		assertEquals("1621 E 82nd Ave", customers.get(2964).getAddress());
	}

	@Test
	@DisplayName("Record 2965: City is Anchorage")
	void CityOfRecord2965() {
		assertEquals("Anchorage", customers.get(2964).getCity());
	}

	@Test
	@DisplayName("Record 2965: County is Anchorage")
	void CountyOfRecord2965() {
		assertEquals("Anchorage", customers.get(2964).getCounty());
	}

	@Test
	@DisplayName("Record 2965: State is AK")
	void StateOfRecord2965() {
		assertEquals("AK", customers.get(2964).getState());
	}

	@Test
	@DisplayName("Record 2965: ZIP is 99507")
	void ZIPOfRecord2965() {
		assertEquals("99507", customers.get(2964).getZIP());
	}

	@Test
	@DisplayName("Record 2965: Phone is 907-349-9064")
	void PhoneOfRecord2965() {
		assertEquals("907-349-9064", customers.get(2964).getPhone());
	}

	@Test
	@DisplayName("Record 2965: Fax is 907-349-9055")
	void FaxOfRecord2965() {
		assertEquals("907-349-9055", customers.get(2964).getFax());
	}

	@Test
	@DisplayName("Record 2965: Email is orval@kaaz.com")
	void EmailOfRecord2965() {
		assertEquals("orval@kaaz.com", customers.get(2964).getEmail());
	}

	@Test
	@DisplayName("Record 2965: Web is http://www.orvalkaaz.com")
	void WebOfRecord2965() {
		assertEquals("http://www.orvalkaaz.com", customers.get(2964).getWeb());
	}
}
