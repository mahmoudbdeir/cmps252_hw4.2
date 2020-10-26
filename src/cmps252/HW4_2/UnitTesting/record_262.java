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
class Record_262 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 262: FirstName is Rhett")
	void FirstNameOfRecord262() {
		assertEquals("Rhett", customers.get(261).getFirstName());
	}

	@Test
	@DisplayName("Record 262: LastName is Lenser")
	void LastNameOfRecord262() {
		assertEquals("Lenser", customers.get(261).getLastName());
	}

	@Test
	@DisplayName("Record 262: Company is Pavailler Machinery Sls Co Inc")
	void CompanyOfRecord262() {
		assertEquals("Pavailler Machinery Sls Co Inc", customers.get(261).getCompany());
	}

	@Test
	@DisplayName("Record 262: Address is 5431 Preston Fall City")
	void AddressOfRecord262() {
		assertEquals("5431 Preston Fall City", customers.get(261).getAddress());
	}

	@Test
	@DisplayName("Record 262: City is Fall City")
	void CityOfRecord262() {
		assertEquals("Fall City", customers.get(261).getCity());
	}

	@Test
	@DisplayName("Record 262: County is King")
	void CountyOfRecord262() {
		assertEquals("King", customers.get(261).getCounty());
	}

	@Test
	@DisplayName("Record 262: State is WA")
	void StateOfRecord262() {
		assertEquals("WA", customers.get(261).getState());
	}

	@Test
	@DisplayName("Record 262: ZIP is 98024")
	void ZIPOfRecord262() {
		assertEquals("98024", customers.get(261).getZIP());
	}

	@Test
	@DisplayName("Record 262: Phone is 425-222-2094")
	void PhoneOfRecord262() {
		assertEquals("425-222-2094", customers.get(261).getPhone());
	}

	@Test
	@DisplayName("Record 262: Fax is 425-222-7351")
	void FaxOfRecord262() {
		assertEquals("425-222-7351", customers.get(261).getFax());
	}

	@Test
	@DisplayName("Record 262: Email is rhett@lenser.com")
	void EmailOfRecord262() {
		assertEquals("rhett@lenser.com", customers.get(261).getEmail());
	}

	@Test
	@DisplayName("Record 262: Web is http://www.rhettlenser.com")
	void WebOfRecord262() {
		assertEquals("http://www.rhettlenser.com", customers.get(261).getWeb());
	}
}
