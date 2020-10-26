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

@Tag("1")
class Record_3193 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3193: FirstName is Burton")
	void FirstNameOfRecord3193() {
		assertEquals("Burton", customers.get(3192).getFirstName());
	}

	@Test
	@DisplayName("Record 3193: LastName is Warman")
	void LastNameOfRecord3193() {
		assertEquals("Warman", customers.get(3192).getLastName());
	}

	@Test
	@DisplayName("Record 3193: Company is Smith Batchelder & Rugg")
	void CompanyOfRecord3193() {
		assertEquals("Smith Batchelder & Rugg", customers.get(3192).getCompany());
	}

	@Test
	@DisplayName("Record 3193: Address is 1120 B Main")
	void AddressOfRecord3193() {
		assertEquals("1120 B Main", customers.get(3192).getAddress());
	}

	@Test
	@DisplayName("Record 3193: City is Williamstown")
	void CityOfRecord3193() {
		assertEquals("Williamstown", customers.get(3192).getCity());
	}

	@Test
	@DisplayName("Record 3193: County is Gloucester")
	void CountyOfRecord3193() {
		assertEquals("Gloucester", customers.get(3192).getCounty());
	}

	@Test
	@DisplayName("Record 3193: State is NJ")
	void StateOfRecord3193() {
		assertEquals("NJ", customers.get(3192).getState());
	}

	@Test
	@DisplayName("Record 3193: ZIP is 8094")
	void ZIPOfRecord3193() {
		assertEquals("8094", customers.get(3192).getZIP());
	}

	@Test
	@DisplayName("Record 3193: Phone is 856-728-7337")
	void PhoneOfRecord3193() {
		assertEquals("856-728-7337", customers.get(3192).getPhone());
	}

	@Test
	@DisplayName("Record 3193: Fax is 856-728-8709")
	void FaxOfRecord3193() {
		assertEquals("856-728-8709", customers.get(3192).getFax());
	}

	@Test
	@DisplayName("Record 3193: Email is burton@warman.com")
	void EmailOfRecord3193() {
		assertEquals("burton@warman.com", customers.get(3192).getEmail());
	}

	@Test
	@DisplayName("Record 3193: Web is http://www.burtonwarman.com")
	void WebOfRecord3193() {
		assertEquals("http://www.burtonwarman.com", customers.get(3192).getWeb());
	}
}
