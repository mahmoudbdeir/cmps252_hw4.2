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

@Tag("2")
class Record_1560 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1560: FirstName is Gregory")
	void FirstNameOfRecord1560() {
		assertEquals("Gregory", customers.get(1559).getFirstName());
	}

	@Test
	@DisplayName("Record 1560: LastName is Brinn")
	void LastNameOfRecord1560() {
		assertEquals("Brinn", customers.get(1559).getLastName());
	}

	@Test
	@DisplayName("Record 1560: Company is Kpcr Radio")
	void CompanyOfRecord1560() {
		assertEquals("Kpcr Radio", customers.get(1559).getCompany());
	}

	@Test
	@DisplayName("Record 1560: Address is 41 Village Park Rd")
	void AddressOfRecord1560() {
		assertEquals("41 Village Park Rd", customers.get(1559).getAddress());
	}

	@Test
	@DisplayName("Record 1560: City is Cedar Grove")
	void CityOfRecord1560() {
		assertEquals("Cedar Grove", customers.get(1559).getCity());
	}

	@Test
	@DisplayName("Record 1560: County is Essex")
	void CountyOfRecord1560() {
		assertEquals("Essex", customers.get(1559).getCounty());
	}

	@Test
	@DisplayName("Record 1560: State is NJ")
	void StateOfRecord1560() {
		assertEquals("NJ", customers.get(1559).getState());
	}

	@Test
	@DisplayName("Record 1560: ZIP is 7009")
	void ZIPOfRecord1560() {
		assertEquals("7009", customers.get(1559).getZIP());
	}

	@Test
	@DisplayName("Record 1560: Phone is 973-857-0238")
	void PhoneOfRecord1560() {
		assertEquals("973-857-0238", customers.get(1559).getPhone());
	}

	@Test
	@DisplayName("Record 1560: Fax is 973-857-5673")
	void FaxOfRecord1560() {
		assertEquals("973-857-5673", customers.get(1559).getFax());
	}

	@Test
	@DisplayName("Record 1560: Email is gregory@brinn.com")
	void EmailOfRecord1560() {
		assertEquals("gregory@brinn.com", customers.get(1559).getEmail());
	}

	@Test
	@DisplayName("Record 1560: Web is http://www.gregorybrinn.com")
	void WebOfRecord1560() {
		assertEquals("http://www.gregorybrinn.com", customers.get(1559).getWeb());
	}
}
