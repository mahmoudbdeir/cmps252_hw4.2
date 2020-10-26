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
class Record_3547 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3547: FirstName is Ellis")
	void FirstNameOfRecord3547() {
		assertEquals("Ellis", customers.get(3546).getFirstName());
	}

	@Test
	@DisplayName("Record 3547: LastName is Clinkscales")
	void LastNameOfRecord3547() {
		assertEquals("Clinkscales", customers.get(3546).getLastName());
	}

	@Test
	@DisplayName("Record 3547: Company is Danny Daniels Photography")
	void CompanyOfRecord3547() {
		assertEquals("Danny Daniels Photography", customers.get(3546).getCompany());
	}

	@Test
	@DisplayName("Record 3547: Address is 2104 Zimmerly Rd")
	void AddressOfRecord3547() {
		assertEquals("2104 Zimmerly Rd", customers.get(3546).getAddress());
	}

	@Test
	@DisplayName("Record 3547: City is Erie")
	void CityOfRecord3547() {
		assertEquals("Erie", customers.get(3546).getCity());
	}

	@Test
	@DisplayName("Record 3547: County is Erie")
	void CountyOfRecord3547() {
		assertEquals("Erie", customers.get(3546).getCounty());
	}

	@Test
	@DisplayName("Record 3547: State is PA")
	void StateOfRecord3547() {
		assertEquals("PA", customers.get(3546).getState());
	}

	@Test
	@DisplayName("Record 3547: ZIP is 16509")
	void ZIPOfRecord3547() {
		assertEquals("16509", customers.get(3546).getZIP());
	}

	@Test
	@DisplayName("Record 3547: Phone is 814-864-4365")
	void PhoneOfRecord3547() {
		assertEquals("814-864-4365", customers.get(3546).getPhone());
	}

	@Test
	@DisplayName("Record 3547: Fax is 814-864-8356")
	void FaxOfRecord3547() {
		assertEquals("814-864-8356", customers.get(3546).getFax());
	}

	@Test
	@DisplayName("Record 3547: Email is ellis@clinkscales.com")
	void EmailOfRecord3547() {
		assertEquals("ellis@clinkscales.com", customers.get(3546).getEmail());
	}

	@Test
	@DisplayName("Record 3547: Web is http://www.ellisclinkscales.com")
	void WebOfRecord3547() {
		assertEquals("http://www.ellisclinkscales.com", customers.get(3546).getWeb());
	}
}
