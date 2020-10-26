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

@Tag("6")
class Record_1623 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1623: FirstName is Bradly")
	void FirstNameOfRecord1623() {
		assertEquals("Bradly", customers.get(1622).getFirstName());
	}

	@Test
	@DisplayName("Record 1623: LastName is Dimeo")
	void LastNameOfRecord1623() {
		assertEquals("Dimeo", customers.get(1622).getLastName());
	}

	@Test
	@DisplayName("Record 1623: Company is Material Control Systems")
	void CompanyOfRecord1623() {
		assertEquals("Material Control Systems", customers.get(1622).getCompany());
	}

	@Test
	@DisplayName("Record 1623: Address is 844 Centre Ave")
	void AddressOfRecord1623() {
		assertEquals("844 Centre Ave", customers.get(1622).getAddress());
	}

	@Test
	@DisplayName("Record 1623: City is Reading")
	void CityOfRecord1623() {
		assertEquals("Reading", customers.get(1622).getCity());
	}

	@Test
	@DisplayName("Record 1623: County is Berks")
	void CountyOfRecord1623() {
		assertEquals("Berks", customers.get(1622).getCounty());
	}

	@Test
	@DisplayName("Record 1623: State is PA")
	void StateOfRecord1623() {
		assertEquals("PA", customers.get(1622).getState());
	}

	@Test
	@DisplayName("Record 1623: ZIP is 19601")
	void ZIPOfRecord1623() {
		assertEquals("19601", customers.get(1622).getZIP());
	}

	@Test
	@DisplayName("Record 1623: Phone is 610-378-4081")
	void PhoneOfRecord1623() {
		assertEquals("610-378-4081", customers.get(1622).getPhone());
	}

	@Test
	@DisplayName("Record 1623: Fax is 610-378-2651")
	void FaxOfRecord1623() {
		assertEquals("610-378-2651", customers.get(1622).getFax());
	}

	@Test
	@DisplayName("Record 1623: Email is bradly@dimeo.com")
	void EmailOfRecord1623() {
		assertEquals("bradly@dimeo.com", customers.get(1622).getEmail());
	}

	@Test
	@DisplayName("Record 1623: Web is http://www.bradlydimeo.com")
	void WebOfRecord1623() {
		assertEquals("http://www.bradlydimeo.com", customers.get(1622).getWeb());
	}
}
