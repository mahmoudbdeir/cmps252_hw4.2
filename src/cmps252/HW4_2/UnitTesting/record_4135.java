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

@Tag("15")
class Record_4135 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4135: FirstName is Katina")
	void FirstNameOfRecord4135() {
		assertEquals("Katina", customers.get(4134).getFirstName());
	}

	@Test
	@DisplayName("Record 4135: LastName is Selin")
	void LastNameOfRecord4135() {
		assertEquals("Selin", customers.get(4134).getLastName());
	}

	@Test
	@DisplayName("Record 4135: Company is Lett, Marvin H Esq")
	void CompanyOfRecord4135() {
		assertEquals("Lett, Marvin H Esq", customers.get(4134).getCompany());
	}

	@Test
	@DisplayName("Record 4135: Address is 2150 S Kalamath St")
	void AddressOfRecord4135() {
		assertEquals("2150 S Kalamath St", customers.get(4134).getAddress());
	}

	@Test
	@DisplayName("Record 4135: City is Denver")
	void CityOfRecord4135() {
		assertEquals("Denver", customers.get(4134).getCity());
	}

	@Test
	@DisplayName("Record 4135: County is Denver")
	void CountyOfRecord4135() {
		assertEquals("Denver", customers.get(4134).getCounty());
	}

	@Test
	@DisplayName("Record 4135: State is CO")
	void StateOfRecord4135() {
		assertEquals("CO", customers.get(4134).getState());
	}

	@Test
	@DisplayName("Record 4135: ZIP is 80223")
	void ZIPOfRecord4135() {
		assertEquals("80223", customers.get(4134).getZIP());
	}

	@Test
	@DisplayName("Record 4135: Phone is 303-936-5828")
	void PhoneOfRecord4135() {
		assertEquals("303-936-5828", customers.get(4134).getPhone());
	}

	@Test
	@DisplayName("Record 4135: Fax is 303-936-4762")
	void FaxOfRecord4135() {
		assertEquals("303-936-4762", customers.get(4134).getFax());
	}

	@Test
	@DisplayName("Record 4135: Email is katina@selin.com")
	void EmailOfRecord4135() {
		assertEquals("katina@selin.com", customers.get(4134).getEmail());
	}

	@Test
	@DisplayName("Record 4135: Web is http://www.katinaselin.com")
	void WebOfRecord4135() {
		assertEquals("http://www.katinaselin.com", customers.get(4134).getWeb());
	}
}
