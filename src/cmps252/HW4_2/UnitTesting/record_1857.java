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

@Tag("17")
class Record_1857 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1857: FirstName is Cecelia")
	void FirstNameOfRecord1857() {
		assertEquals("Cecelia", customers.get(1856).getFirstName());
	}

	@Test
	@DisplayName("Record 1857: LastName is Tarski")
	void LastNameOfRecord1857() {
		assertEquals("Tarski", customers.get(1856).getLastName());
	}

	@Test
	@DisplayName("Record 1857: Company is Schmits Insurance Agency")
	void CompanyOfRecord1857() {
		assertEquals("Schmits Insurance Agency", customers.get(1856).getCompany());
	}

	@Test
	@DisplayName("Record 1857: Address is 1919 14th St  #-300")
	void AddressOfRecord1857() {
		assertEquals("1919 14th St  #-300", customers.get(1856).getAddress());
	}

	@Test
	@DisplayName("Record 1857: City is Boulder")
	void CityOfRecord1857() {
		assertEquals("Boulder", customers.get(1856).getCity());
	}

	@Test
	@DisplayName("Record 1857: County is Boulder")
	void CountyOfRecord1857() {
		assertEquals("Boulder", customers.get(1856).getCounty());
	}

	@Test
	@DisplayName("Record 1857: State is CO")
	void StateOfRecord1857() {
		assertEquals("CO", customers.get(1856).getState());
	}

	@Test
	@DisplayName("Record 1857: ZIP is 80302")
	void ZIPOfRecord1857() {
		assertEquals("80302", customers.get(1856).getZIP());
	}

	@Test
	@DisplayName("Record 1857: Phone is 303-443-5869")
	void PhoneOfRecord1857() {
		assertEquals("303-443-5869", customers.get(1856).getPhone());
	}

	@Test
	@DisplayName("Record 1857: Fax is 303-443-1851")
	void FaxOfRecord1857() {
		assertEquals("303-443-1851", customers.get(1856).getFax());
	}

	@Test
	@DisplayName("Record 1857: Email is cecelia@tarski.com")
	void EmailOfRecord1857() {
		assertEquals("cecelia@tarski.com", customers.get(1856).getEmail());
	}

	@Test
	@DisplayName("Record 1857: Web is http://www.ceceliatarski.com")
	void WebOfRecord1857() {
		assertEquals("http://www.ceceliatarski.com", customers.get(1856).getWeb());
	}
}
