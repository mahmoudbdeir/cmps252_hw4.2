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

@Tag("11")
class Record_1712 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1712: FirstName is Anita")
	void FirstNameOfRecord1712() {
		assertEquals("Anita", customers.get(1711).getFirstName());
	}

	@Test
	@DisplayName("Record 1712: LastName is Sowle")
	void LastNameOfRecord1712() {
		assertEquals("Sowle", customers.get(1711).getLastName());
	}

	@Test
	@DisplayName("Record 1712: Company is Key Business Systems Inc")
	void CompanyOfRecord1712() {
		assertEquals("Key Business Systems Inc", customers.get(1711).getCompany());
	}

	@Test
	@DisplayName("Record 1712: Address is 9321 Marsh Creek Rd")
	void AddressOfRecord1712() {
		assertEquals("9321 Marsh Creek Rd", customers.get(1711).getAddress());
	}

	@Test
	@DisplayName("Record 1712: City is Clayton")
	void CityOfRecord1712() {
		assertEquals("Clayton", customers.get(1711).getCity());
	}

	@Test
	@DisplayName("Record 1712: County is Contra Costa")
	void CountyOfRecord1712() {
		assertEquals("Contra Costa", customers.get(1711).getCounty());
	}

	@Test
	@DisplayName("Record 1712: State is CA")
	void StateOfRecord1712() {
		assertEquals("CA", customers.get(1711).getState());
	}

	@Test
	@DisplayName("Record 1712: ZIP is 94517")
	void ZIPOfRecord1712() {
		assertEquals("94517", customers.get(1711).getZIP());
	}

	@Test
	@DisplayName("Record 1712: Phone is 925-672-3307")
	void PhoneOfRecord1712() {
		assertEquals("925-672-3307", customers.get(1711).getPhone());
	}

	@Test
	@DisplayName("Record 1712: Fax is 925-672-5915")
	void FaxOfRecord1712() {
		assertEquals("925-672-5915", customers.get(1711).getFax());
	}

	@Test
	@DisplayName("Record 1712: Email is anita@sowle.com")
	void EmailOfRecord1712() {
		assertEquals("anita@sowle.com", customers.get(1711).getEmail());
	}

	@Test
	@DisplayName("Record 1712: Web is http://www.anitasowle.com")
	void WebOfRecord1712() {
		assertEquals("http://www.anitasowle.com", customers.get(1711).getWeb());
	}
}
