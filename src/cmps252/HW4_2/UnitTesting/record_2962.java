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

@Tag("40")
class Record_2962 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2962: FirstName is Wilda")
	void FirstNameOfRecord2962() {
		assertEquals("Wilda", customers.get(2961).getFirstName());
	}

	@Test
	@DisplayName("Record 2962: LastName is Freme")
	void LastNameOfRecord2962() {
		assertEquals("Freme", customers.get(2961).getLastName());
	}

	@Test
	@DisplayName("Record 2962: Company is High School")
	void CompanyOfRecord2962() {
		assertEquals("High School", customers.get(2961).getCompany());
	}

	@Test
	@DisplayName("Record 2962: Address is 9601 N Allen Rd")
	void AddressOfRecord2962() {
		assertEquals("9601 N Allen Rd", customers.get(2961).getAddress());
	}

	@Test
	@DisplayName("Record 2962: City is Peoria")
	void CityOfRecord2962() {
		assertEquals("Peoria", customers.get(2961).getCity());
	}

	@Test
	@DisplayName("Record 2962: County is Peoria")
	void CountyOfRecord2962() {
		assertEquals("Peoria", customers.get(2961).getCounty());
	}

	@Test
	@DisplayName("Record 2962: State is IL")
	void StateOfRecord2962() {
		assertEquals("IL", customers.get(2961).getState());
	}

	@Test
	@DisplayName("Record 2962: ZIP is 61615")
	void ZIPOfRecord2962() {
		assertEquals("61615", customers.get(2961).getZIP());
	}

	@Test
	@DisplayName("Record 2962: Phone is 309-243-4264")
	void PhoneOfRecord2962() {
		assertEquals("309-243-4264", customers.get(2961).getPhone());
	}

	@Test
	@DisplayName("Record 2962: Fax is 309-243-9771")
	void FaxOfRecord2962() {
		assertEquals("309-243-9771", customers.get(2961).getFax());
	}

	@Test
	@DisplayName("Record 2962: Email is wilda@freme.com")
	void EmailOfRecord2962() {
		assertEquals("wilda@freme.com", customers.get(2961).getEmail());
	}

	@Test
	@DisplayName("Record 2962: Web is http://www.wildafreme.com")
	void WebOfRecord2962() {
		assertEquals("http://www.wildafreme.com", customers.get(2961).getWeb());
	}
}
