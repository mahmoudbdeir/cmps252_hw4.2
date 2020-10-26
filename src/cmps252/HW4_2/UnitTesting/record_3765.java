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

@Tag("34")
class Record_3765 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3765: FirstName is Concetta")
	void FirstNameOfRecord3765() {
		assertEquals("Concetta", customers.get(3764).getFirstName());
	}

	@Test
	@DisplayName("Record 3765: LastName is Clyburn")
	void LastNameOfRecord3765() {
		assertEquals("Clyburn", customers.get(3764).getLastName());
	}

	@Test
	@DisplayName("Record 3765: Company is Lynn Stephens Klyn")
	void CompanyOfRecord3765() {
		assertEquals("Lynn Stephens Klyn", customers.get(3764).getCompany());
	}

	@Test
	@DisplayName("Record 3765: Address is 3325 Fort Worth Ave")
	void AddressOfRecord3765() {
		assertEquals("3325 Fort Worth Ave", customers.get(3764).getAddress());
	}

	@Test
	@DisplayName("Record 3765: City is Dallas")
	void CityOfRecord3765() {
		assertEquals("Dallas", customers.get(3764).getCity());
	}

	@Test
	@DisplayName("Record 3765: County is Dallas")
	void CountyOfRecord3765() {
		assertEquals("Dallas", customers.get(3764).getCounty());
	}

	@Test
	@DisplayName("Record 3765: State is TX")
	void StateOfRecord3765() {
		assertEquals("TX", customers.get(3764).getState());
	}

	@Test
	@DisplayName("Record 3765: ZIP is 75211")
	void ZIPOfRecord3765() {
		assertEquals("75211", customers.get(3764).getZIP());
	}

	@Test
	@DisplayName("Record 3765: Phone is 214-333-9366")
	void PhoneOfRecord3765() {
		assertEquals("214-333-9366", customers.get(3764).getPhone());
	}

	@Test
	@DisplayName("Record 3765: Fax is 214-333-3381")
	void FaxOfRecord3765() {
		assertEquals("214-333-3381", customers.get(3764).getFax());
	}

	@Test
	@DisplayName("Record 3765: Email is concetta@clyburn.com")
	void EmailOfRecord3765() {
		assertEquals("concetta@clyburn.com", customers.get(3764).getEmail());
	}

	@Test
	@DisplayName("Record 3765: Web is http://www.concettaclyburn.com")
	void WebOfRecord3765() {
		assertEquals("http://www.concettaclyburn.com", customers.get(3764).getWeb());
	}
}
