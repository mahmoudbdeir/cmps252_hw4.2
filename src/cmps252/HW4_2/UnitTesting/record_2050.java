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

@Tag("20")
class Record_2050 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2050: FirstName is Efren")
	void FirstNameOfRecord2050() {
		assertEquals("Efren", customers.get(2049).getFirstName());
	}

	@Test
	@DisplayName("Record 2050: LastName is Swaby")
	void LastNameOfRecord2050() {
		assertEquals("Swaby", customers.get(2049).getLastName());
	}

	@Test
	@DisplayName("Record 2050: Company is Lessards Trophies & Awards")
	void CompanyOfRecord2050() {
		assertEquals("Lessards Trophies & Awards", customers.get(2049).getCompany());
	}

	@Test
	@DisplayName("Record 2050: Address is 610 E 11th St")
	void AddressOfRecord2050() {
		assertEquals("610 E 11th St", customers.get(2049).getAddress());
	}

	@Test
	@DisplayName("Record 2050: City is Austin")
	void CityOfRecord2050() {
		assertEquals("Austin", customers.get(2049).getCity());
	}

	@Test
	@DisplayName("Record 2050: County is Travis")
	void CountyOfRecord2050() {
		assertEquals("Travis", customers.get(2049).getCounty());
	}

	@Test
	@DisplayName("Record 2050: State is TX")
	void StateOfRecord2050() {
		assertEquals("TX", customers.get(2049).getState());
	}

	@Test
	@DisplayName("Record 2050: ZIP is 78701")
	void ZIPOfRecord2050() {
		assertEquals("78701", customers.get(2049).getZIP());
	}

	@Test
	@DisplayName("Record 2050: Phone is 512-469-3649")
	void PhoneOfRecord2050() {
		assertEquals("512-469-3649", customers.get(2049).getPhone());
	}

	@Test
	@DisplayName("Record 2050: Fax is 512-469-6995")
	void FaxOfRecord2050() {
		assertEquals("512-469-6995", customers.get(2049).getFax());
	}

	@Test
	@DisplayName("Record 2050: Email is efren@swaby.com")
	void EmailOfRecord2050() {
		assertEquals("efren@swaby.com", customers.get(2049).getEmail());
	}

	@Test
	@DisplayName("Record 2050: Web is http://www.efrenswaby.com")
	void WebOfRecord2050() {
		assertEquals("http://www.efrenswaby.com", customers.get(2049).getWeb());
	}
}
