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

@Tag("4")
class Record_2318 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2318: FirstName is Kerri")
	void FirstNameOfRecord2318() {
		assertEquals("Kerri", customers.get(2317).getFirstName());
	}

	@Test
	@DisplayName("Record 2318: LastName is Gaslin")
	void LastNameOfRecord2318() {
		assertEquals("Gaslin", customers.get(2317).getLastName());
	}

	@Test
	@DisplayName("Record 2318: Company is J D Schwarts & Company Inc")
	void CompanyOfRecord2318() {
		assertEquals("J D Schwarts & Company Inc", customers.get(2317).getCompany());
	}

	@Test
	@DisplayName("Record 2318: Address is 2303 2nd Ave")
	void AddressOfRecord2318() {
		assertEquals("2303 2nd Ave", customers.get(2317).getAddress());
	}

	@Test
	@DisplayName("Record 2318: City is New York")
	void CityOfRecord2318() {
		assertEquals("New York", customers.get(2317).getCity());
	}

	@Test
	@DisplayName("Record 2318: County is New York")
	void CountyOfRecord2318() {
		assertEquals("New York", customers.get(2317).getCounty());
	}

	@Test
	@DisplayName("Record 2318: State is NY")
	void StateOfRecord2318() {
		assertEquals("NY", customers.get(2317).getState());
	}

	@Test
	@DisplayName("Record 2318: ZIP is 10035")
	void ZIPOfRecord2318() {
		assertEquals("10035", customers.get(2317).getZIP());
	}

	@Test
	@DisplayName("Record 2318: Phone is 212-534-6420")
	void PhoneOfRecord2318() {
		assertEquals("212-534-6420", customers.get(2317).getPhone());
	}

	@Test
	@DisplayName("Record 2318: Fax is 212-534-4195")
	void FaxOfRecord2318() {
		assertEquals("212-534-4195", customers.get(2317).getFax());
	}

	@Test
	@DisplayName("Record 2318: Email is kerri@gaslin.com")
	void EmailOfRecord2318() {
		assertEquals("kerri@gaslin.com", customers.get(2317).getEmail());
	}

	@Test
	@DisplayName("Record 2318: Web is http://www.kerrigaslin.com")
	void WebOfRecord2318() {
		assertEquals("http://www.kerrigaslin.com", customers.get(2317).getWeb());
	}
}
