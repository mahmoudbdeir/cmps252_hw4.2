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

@Tag("0")
class Record_3657 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3657: FirstName is Nicholas")
	void FirstNameOfRecord3657() {
		assertEquals("Nicholas", customers.get(3656).getFirstName());
	}

	@Test
	@DisplayName("Record 3657: LastName is Serravalli")
	void LastNameOfRecord3657() {
		assertEquals("Serravalli", customers.get(3656).getLastName());
	}

	@Test
	@DisplayName("Record 3657: Company is Lacey & Jones")
	void CompanyOfRecord3657() {
		assertEquals("Lacey & Jones", customers.get(3656).getCompany());
	}

	@Test
	@DisplayName("Record 3657: Address is 4625 S 33rd Pl")
	void AddressOfRecord3657() {
		assertEquals("4625 S 33rd Pl", customers.get(3656).getAddress());
	}

	@Test
	@DisplayName("Record 3657: City is Phoenix")
	void CityOfRecord3657() {
		assertEquals("Phoenix", customers.get(3656).getCity());
	}

	@Test
	@DisplayName("Record 3657: County is Maricopa")
	void CountyOfRecord3657() {
		assertEquals("Maricopa", customers.get(3656).getCounty());
	}

	@Test
	@DisplayName("Record 3657: State is AZ")
	void StateOfRecord3657() {
		assertEquals("AZ", customers.get(3656).getState());
	}

	@Test
	@DisplayName("Record 3657: ZIP is 85040")
	void ZIPOfRecord3657() {
		assertEquals("85040", customers.get(3656).getZIP());
	}

	@Test
	@DisplayName("Record 3657: Phone is 602-232-3606")
	void PhoneOfRecord3657() {
		assertEquals("602-232-3606", customers.get(3656).getPhone());
	}

	@Test
	@DisplayName("Record 3657: Fax is 602-232-8263")
	void FaxOfRecord3657() {
		assertEquals("602-232-8263", customers.get(3656).getFax());
	}

	@Test
	@DisplayName("Record 3657: Email is nicholas@serravalli.com")
	void EmailOfRecord3657() {
		assertEquals("nicholas@serravalli.com", customers.get(3656).getEmail());
	}

	@Test
	@DisplayName("Record 3657: Web is http://www.nicholasserravalli.com")
	void WebOfRecord3657() {
		assertEquals("http://www.nicholasserravalli.com", customers.get(3656).getWeb());
	}
}
