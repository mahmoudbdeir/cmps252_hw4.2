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

@Tag("25")
class Record_2762 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2762: FirstName is Allison")
	void FirstNameOfRecord2762() {
		assertEquals("Allison", customers.get(2761).getFirstName());
	}

	@Test
	@DisplayName("Record 2762: LastName is Mihalco")
	void LastNameOfRecord2762() {
		assertEquals("Mihalco", customers.get(2761).getLastName());
	}

	@Test
	@DisplayName("Record 2762: Company is Cummings Electric Inc")
	void CompanyOfRecord2762() {
		assertEquals("Cummings Electric Inc", customers.get(2761).getCompany());
	}

	@Test
	@DisplayName("Record 2762: Address is 33rd")
	void AddressOfRecord2762() {
		assertEquals("33rd", customers.get(2761).getAddress());
	}

	@Test
	@DisplayName("Record 2762: City is Boulder")
	void CityOfRecord2762() {
		assertEquals("Boulder", customers.get(2761).getCity());
	}

	@Test
	@DisplayName("Record 2762: County is Boulder")
	void CountyOfRecord2762() {
		assertEquals("Boulder", customers.get(2761).getCounty());
	}

	@Test
	@DisplayName("Record 2762: State is CO")
	void StateOfRecord2762() {
		assertEquals("CO", customers.get(2761).getState());
	}

	@Test
	@DisplayName("Record 2762: ZIP is 80303")
	void ZIPOfRecord2762() {
		assertEquals("80303", customers.get(2761).getZIP());
	}

	@Test
	@DisplayName("Record 2762: Phone is 303-443-6631")
	void PhoneOfRecord2762() {
		assertEquals("303-443-6631", customers.get(2761).getPhone());
	}

	@Test
	@DisplayName("Record 2762: Fax is 303-443-7992")
	void FaxOfRecord2762() {
		assertEquals("303-443-7992", customers.get(2761).getFax());
	}

	@Test
	@DisplayName("Record 2762: Email is allison@mihalco.com")
	void EmailOfRecord2762() {
		assertEquals("allison@mihalco.com", customers.get(2761).getEmail());
	}

	@Test
	@DisplayName("Record 2762: Web is http://www.allisonmihalco.com")
	void WebOfRecord2762() {
		assertEquals("http://www.allisonmihalco.com", customers.get(2761).getWeb());
	}
}
