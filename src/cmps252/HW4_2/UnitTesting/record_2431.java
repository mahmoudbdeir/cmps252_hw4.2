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

@Tag("19")
class Record_2431 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2431: FirstName is Della")
	void FirstNameOfRecord2431() {
		assertEquals("Della", customers.get(2430).getFirstName());
	}

	@Test
	@DisplayName("Record 2431: LastName is Rasbury")
	void LastNameOfRecord2431() {
		assertEquals("Rasbury", customers.get(2430).getLastName());
	}

	@Test
	@DisplayName("Record 2431: Company is Kosieradzki, Mark R Esq")
	void CompanyOfRecord2431() {
		assertEquals("Kosieradzki, Mark R Esq", customers.get(2430).getCompany());
	}

	@Test
	@DisplayName("Record 2431: Address is 2207 E Tudor Rd")
	void AddressOfRecord2431() {
		assertEquals("2207 E Tudor Rd", customers.get(2430).getAddress());
	}

	@Test
	@DisplayName("Record 2431: City is Anchorage")
	void CityOfRecord2431() {
		assertEquals("Anchorage", customers.get(2430).getCity());
	}

	@Test
	@DisplayName("Record 2431: County is Anchorage")
	void CountyOfRecord2431() {
		assertEquals("Anchorage", customers.get(2430).getCounty());
	}

	@Test
	@DisplayName("Record 2431: State is AK")
	void StateOfRecord2431() {
		assertEquals("AK", customers.get(2430).getState());
	}

	@Test
	@DisplayName("Record 2431: ZIP is 99507")
	void ZIPOfRecord2431() {
		assertEquals("99507", customers.get(2430).getZIP());
	}

	@Test
	@DisplayName("Record 2431: Phone is 907-561-6339")
	void PhoneOfRecord2431() {
		assertEquals("907-561-6339", customers.get(2430).getPhone());
	}

	@Test
	@DisplayName("Record 2431: Fax is 907-561-6792")
	void FaxOfRecord2431() {
		assertEquals("907-561-6792", customers.get(2430).getFax());
	}

	@Test
	@DisplayName("Record 2431: Email is della@rasbury.com")
	void EmailOfRecord2431() {
		assertEquals("della@rasbury.com", customers.get(2430).getEmail());
	}

	@Test
	@DisplayName("Record 2431: Web is http://www.dellarasbury.com")
	void WebOfRecord2431() {
		assertEquals("http://www.dellarasbury.com", customers.get(2430).getWeb());
	}
}
