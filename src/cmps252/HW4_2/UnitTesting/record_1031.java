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

@Tag("29")
class Record_1031 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1031: FirstName is Mohammed")
	void FirstNameOfRecord1031() {
		assertEquals("Mohammed", customers.get(1030).getFirstName());
	}

	@Test
	@DisplayName("Record 1031: LastName is Serfass")
	void LastNameOfRecord1031() {
		assertEquals("Serfass", customers.get(1030).getLastName());
	}

	@Test
	@DisplayName("Record 1031: Company is Best Western Dubuque Inn")
	void CompanyOfRecord1031() {
		assertEquals("Best Western Dubuque Inn", customers.get(1030).getCompany());
	}

	@Test
	@DisplayName("Record 1031: Address is 12347 W Sitka Dr")
	void AddressOfRecord1031() {
		assertEquals("12347 W Sitka Dr", customers.get(1030).getAddress());
	}

	@Test
	@DisplayName("Record 1031: City is Boise")
	void CityOfRecord1031() {
		assertEquals("Boise", customers.get(1030).getCity());
	}

	@Test
	@DisplayName("Record 1031: County is Ada")
	void CountyOfRecord1031() {
		assertEquals("Ada", customers.get(1030).getCounty());
	}

	@Test
	@DisplayName("Record 1031: State is ID")
	void StateOfRecord1031() {
		assertEquals("ID", customers.get(1030).getState());
	}

	@Test
	@DisplayName("Record 1031: ZIP is 83713")
	void ZIPOfRecord1031() {
		assertEquals("83713", customers.get(1030).getZIP());
	}

	@Test
	@DisplayName("Record 1031: Phone is 208-323-3890")
	void PhoneOfRecord1031() {
		assertEquals("208-323-3890", customers.get(1030).getPhone());
	}

	@Test
	@DisplayName("Record 1031: Fax is 208-323-7924")
	void FaxOfRecord1031() {
		assertEquals("208-323-7924", customers.get(1030).getFax());
	}

	@Test
	@DisplayName("Record 1031: Email is mohammed@serfass.com")
	void EmailOfRecord1031() {
		assertEquals("mohammed@serfass.com", customers.get(1030).getEmail());
	}

	@Test
	@DisplayName("Record 1031: Web is http://www.mohammedserfass.com")
	void WebOfRecord1031() {
		assertEquals("http://www.mohammedserfass.com", customers.get(1030).getWeb());
	}
}
