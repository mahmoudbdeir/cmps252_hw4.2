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

@Tag("43")
class Record_3803 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3803: FirstName is Colby")
	void FirstNameOfRecord3803() {
		assertEquals("Colby", customers.get(3802).getFirstName());
	}

	@Test
	@DisplayName("Record 3803: LastName is Kaupp")
	void LastNameOfRecord3803() {
		assertEquals("Kaupp", customers.get(3802).getLastName());
	}

	@Test
	@DisplayName("Record 3803: Company is Personal Safety Equip Paducah")
	void CompanyOfRecord3803() {
		assertEquals("Personal Safety Equip Paducah", customers.get(3802).getCompany());
	}

	@Test
	@DisplayName("Record 3803: Address is 6860 S Yosemite Ct")
	void AddressOfRecord3803() {
		assertEquals("6860 S Yosemite Ct", customers.get(3802).getAddress());
	}

	@Test
	@DisplayName("Record 3803: City is Englewood")
	void CityOfRecord3803() {
		assertEquals("Englewood", customers.get(3802).getCity());
	}

	@Test
	@DisplayName("Record 3803: County is Arapahoe")
	void CountyOfRecord3803() {
		assertEquals("Arapahoe", customers.get(3802).getCounty());
	}

	@Test
	@DisplayName("Record 3803: State is CO")
	void StateOfRecord3803() {
		assertEquals("CO", customers.get(3802).getState());
	}

	@Test
	@DisplayName("Record 3803: ZIP is 80112")
	void ZIPOfRecord3803() {
		assertEquals("80112", customers.get(3802).getZIP());
	}

	@Test
	@DisplayName("Record 3803: Phone is 303-796-6762")
	void PhoneOfRecord3803() {
		assertEquals("303-796-6762", customers.get(3802).getPhone());
	}

	@Test
	@DisplayName("Record 3803: Fax is 303-796-9405")
	void FaxOfRecord3803() {
		assertEquals("303-796-9405", customers.get(3802).getFax());
	}

	@Test
	@DisplayName("Record 3803: Email is colby@kaupp.com")
	void EmailOfRecord3803() {
		assertEquals("colby@kaupp.com", customers.get(3802).getEmail());
	}

	@Test
	@DisplayName("Record 3803: Web is http://www.colbykaupp.com")
	void WebOfRecord3803() {
		assertEquals("http://www.colbykaupp.com", customers.get(3802).getWeb());
	}
}
