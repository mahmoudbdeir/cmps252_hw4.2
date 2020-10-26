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

@Tag("24")
class Record_1684 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1684: FirstName is Blaine")
	void FirstNameOfRecord1684() {
		assertEquals("Blaine", customers.get(1683).getFirstName());
	}

	@Test
	@DisplayName("Record 1684: LastName is Chamberland")
	void LastNameOfRecord1684() {
		assertEquals("Chamberland", customers.get(1683).getLastName());
	}

	@Test
	@DisplayName("Record 1684: Company is Infern O Therm Corp")
	void CompanyOfRecord1684() {
		assertEquals("Infern O Therm Corp", customers.get(1683).getCompany());
	}

	@Test
	@DisplayName("Record 1684: Address is 7th Ave")
	void AddressOfRecord1684() {
		assertEquals("7th Ave", customers.get(1683).getAddress());
	}

	@Test
	@DisplayName("Record 1684: City is Penns Grove")
	void CityOfRecord1684() {
		assertEquals("Penns Grove", customers.get(1683).getCity());
	}

	@Test
	@DisplayName("Record 1684: County is Salem")
	void CountyOfRecord1684() {
		assertEquals("Salem", customers.get(1683).getCounty());
	}

	@Test
	@DisplayName("Record 1684: State is NJ")
	void StateOfRecord1684() {
		assertEquals("NJ", customers.get(1683).getState());
	}

	@Test
	@DisplayName("Record 1684: ZIP is 08069")
	void ZIPOfRecord1684() {
		assertEquals("08069", customers.get(1683).getZIP());
	}

	@Test
	@DisplayName("Record 1684: Phone is 856-299-2587")
	void PhoneOfRecord1684() {
		assertEquals("856-299-2587", customers.get(1683).getPhone());
	}

	@Test
	@DisplayName("Record 1684: Fax is 856-299-3083")
	void FaxOfRecord1684() {
		assertEquals("856-299-3083", customers.get(1683).getFax());
	}

	@Test
	@DisplayName("Record 1684: Email is blaine@chamberland.com")
	void EmailOfRecord1684() {
		assertEquals("blaine@chamberland.com", customers.get(1683).getEmail());
	}

	@Test
	@DisplayName("Record 1684: Web is http://www.blainechamberland.com")
	void WebOfRecord1684() {
		assertEquals("http://www.blainechamberland.com", customers.get(1683).getWeb());
	}
}
