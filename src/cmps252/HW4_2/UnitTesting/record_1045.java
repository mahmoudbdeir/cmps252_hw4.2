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
class Record_1045 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1045: FirstName is Summer")
	void FirstNameOfRecord1045() {
		assertEquals("Summer", customers.get(1044).getFirstName());
	}

	@Test
	@DisplayName("Record 1045: LastName is Belts")
	void LastNameOfRecord1045() {
		assertEquals("Belts", customers.get(1044).getLastName());
	}

	@Test
	@DisplayName("Record 1045: Company is Smith, Rebecca M Cpa")
	void CompanyOfRecord1045() {
		assertEquals("Smith, Rebecca M Cpa", customers.get(1044).getCompany());
	}

	@Test
	@DisplayName("Record 1045: Address is 3577 S Santa Fe Dr")
	void AddressOfRecord1045() {
		assertEquals("3577 S Santa Fe Dr", customers.get(1044).getAddress());
	}

	@Test
	@DisplayName("Record 1045: City is Englewood")
	void CityOfRecord1045() {
		assertEquals("Englewood", customers.get(1044).getCity());
	}

	@Test
	@DisplayName("Record 1045: County is Arapahoe")
	void CountyOfRecord1045() {
		assertEquals("Arapahoe", customers.get(1044).getCounty());
	}

	@Test
	@DisplayName("Record 1045: State is CO")
	void StateOfRecord1045() {
		assertEquals("CO", customers.get(1044).getState());
	}

	@Test
	@DisplayName("Record 1045: ZIP is 80110")
	void ZIPOfRecord1045() {
		assertEquals("80110", customers.get(1044).getZIP());
	}

	@Test
	@DisplayName("Record 1045: Phone is 303-781-4333")
	void PhoneOfRecord1045() {
		assertEquals("303-781-4333", customers.get(1044).getPhone());
	}

	@Test
	@DisplayName("Record 1045: Fax is 303-781-2771")
	void FaxOfRecord1045() {
		assertEquals("303-781-2771", customers.get(1044).getFax());
	}

	@Test
	@DisplayName("Record 1045: Email is summer@belts.com")
	void EmailOfRecord1045() {
		assertEquals("summer@belts.com", customers.get(1044).getEmail());
	}

	@Test
	@DisplayName("Record 1045: Web is http://www.summerbelts.com")
	void WebOfRecord1045() {
		assertEquals("http://www.summerbelts.com", customers.get(1044).getWeb());
	}
}
