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

@Tag("16")
class Record_1991 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1991: FirstName is Irwin")
	void FirstNameOfRecord1991() {
		assertEquals("Irwin", customers.get(1990).getFirstName());
	}

	@Test
	@DisplayName("Record 1991: LastName is Rolff")
	void LastNameOfRecord1991() {
		assertEquals("Rolff", customers.get(1990).getLastName());
	}

	@Test
	@DisplayName("Record 1991: Company is Numac Office Supply")
	void CompanyOfRecord1991() {
		assertEquals("Numac Office Supply", customers.get(1990).getCompany());
	}

	@Test
	@DisplayName("Record 1991: Address is 6200 S Syracuse Way  #-125")
	void AddressOfRecord1991() {
		assertEquals("6200 S Syracuse Way  #-125", customers.get(1990).getAddress());
	}

	@Test
	@DisplayName("Record 1991: City is Englewood")
	void CityOfRecord1991() {
		assertEquals("Englewood", customers.get(1990).getCity());
	}

	@Test
	@DisplayName("Record 1991: County is Arapahoe")
	void CountyOfRecord1991() {
		assertEquals("Arapahoe", customers.get(1990).getCounty());
	}

	@Test
	@DisplayName("Record 1991: State is CO")
	void StateOfRecord1991() {
		assertEquals("CO", customers.get(1990).getState());
	}

	@Test
	@DisplayName("Record 1991: ZIP is 80111")
	void ZIPOfRecord1991() {
		assertEquals("80111", customers.get(1990).getZIP());
	}

	@Test
	@DisplayName("Record 1991: Phone is 303-730-1460")
	void PhoneOfRecord1991() {
		assertEquals("303-730-1460", customers.get(1990).getPhone());
	}

	@Test
	@DisplayName("Record 1991: Fax is 303-730-0891")
	void FaxOfRecord1991() {
		assertEquals("303-730-0891", customers.get(1990).getFax());
	}

	@Test
	@DisplayName("Record 1991: Email is irwin@rolff.com")
	void EmailOfRecord1991() {
		assertEquals("irwin@rolff.com", customers.get(1990).getEmail());
	}

	@Test
	@DisplayName("Record 1991: Web is http://www.irwinrolff.com")
	void WebOfRecord1991() {
		assertEquals("http://www.irwinrolff.com", customers.get(1990).getWeb());
	}
}
