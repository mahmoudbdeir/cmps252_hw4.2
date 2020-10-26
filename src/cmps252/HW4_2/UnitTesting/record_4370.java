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
class Record_4370 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4370: FirstName is Carmella")
	void FirstNameOfRecord4370() {
		assertEquals("Carmella", customers.get(4369).getFirstName());
	}

	@Test
	@DisplayName("Record 4370: LastName is Doster")
	void LastNameOfRecord4370() {
		assertEquals("Doster", customers.get(4369).getLastName());
	}

	@Test
	@DisplayName("Record 4370: Company is Geauga Limousine")
	void CompanyOfRecord4370() {
		assertEquals("Geauga Limousine", customers.get(4369).getCompany());
	}

	@Test
	@DisplayName("Record 4370: Address is 1288 Valley Forge Rd")
	void AddressOfRecord4370() {
		assertEquals("1288 Valley Forge Rd", customers.get(4369).getAddress());
	}

	@Test
	@DisplayName("Record 4370: City is Phoenixville")
	void CityOfRecord4370() {
		assertEquals("Phoenixville", customers.get(4369).getCity());
	}

	@Test
	@DisplayName("Record 4370: County is Chester")
	void CountyOfRecord4370() {
		assertEquals("Chester", customers.get(4369).getCounty());
	}

	@Test
	@DisplayName("Record 4370: State is PA")
	void StateOfRecord4370() {
		assertEquals("PA", customers.get(4369).getState());
	}

	@Test
	@DisplayName("Record 4370: ZIP is 19460")
	void ZIPOfRecord4370() {
		assertEquals("19460", customers.get(4369).getZIP());
	}

	@Test
	@DisplayName("Record 4370: Phone is 610-933-0287")
	void PhoneOfRecord4370() {
		assertEquals("610-933-0287", customers.get(4369).getPhone());
	}

	@Test
	@DisplayName("Record 4370: Fax is 610-933-3943")
	void FaxOfRecord4370() {
		assertEquals("610-933-3943", customers.get(4369).getFax());
	}

	@Test
	@DisplayName("Record 4370: Email is carmella@doster.com")
	void EmailOfRecord4370() {
		assertEquals("carmella@doster.com", customers.get(4369).getEmail());
	}

	@Test
	@DisplayName("Record 4370: Web is http://www.carmelladoster.com")
	void WebOfRecord4370() {
		assertEquals("http://www.carmelladoster.com", customers.get(4369).getWeb());
	}
}
