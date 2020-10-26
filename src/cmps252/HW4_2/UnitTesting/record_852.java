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
class Record_852 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 852: FirstName is Ricky")
	void FirstNameOfRecord852() {
		assertEquals("Ricky", customers.get(851).getFirstName());
	}

	@Test
	@DisplayName("Record 852: LastName is Yielding")
	void LastNameOfRecord852() {
		assertEquals("Yielding", customers.get(851).getLastName());
	}

	@Test
	@DisplayName("Record 852: Company is Shea, James Patrick Esq")
	void CompanyOfRecord852() {
		assertEquals("Shea, James Patrick Esq", customers.get(851).getCompany());
	}

	@Test
	@DisplayName("Record 852: Address is 3575 S Sherman St  #-2")
	void AddressOfRecord852() {
		assertEquals("3575 S Sherman St  #-2", customers.get(851).getAddress());
	}

	@Test
	@DisplayName("Record 852: City is Englewood")
	void CityOfRecord852() {
		assertEquals("Englewood", customers.get(851).getCity());
	}

	@Test
	@DisplayName("Record 852: County is Arapahoe")
	void CountyOfRecord852() {
		assertEquals("Arapahoe", customers.get(851).getCounty());
	}

	@Test
	@DisplayName("Record 852: State is CO")
	void StateOfRecord852() {
		assertEquals("CO", customers.get(851).getState());
	}

	@Test
	@DisplayName("Record 852: ZIP is 80110")
	void ZIPOfRecord852() {
		assertEquals("80110", customers.get(851).getZIP());
	}

	@Test
	@DisplayName("Record 852: Phone is 303-697-9816")
	void PhoneOfRecord852() {
		assertEquals("303-697-9816", customers.get(851).getPhone());
	}

	@Test
	@DisplayName("Record 852: Fax is 303-697-7478")
	void FaxOfRecord852() {
		assertEquals("303-697-7478", customers.get(851).getFax());
	}

	@Test
	@DisplayName("Record 852: Email is ricky@yielding.com")
	void EmailOfRecord852() {
		assertEquals("ricky@yielding.com", customers.get(851).getEmail());
	}

	@Test
	@DisplayName("Record 852: Web is http://www.rickyyielding.com")
	void WebOfRecord852() {
		assertEquals("http://www.rickyyielding.com", customers.get(851).getWeb());
	}
}
