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

@Tag("24")
class Record_3102 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3102: FirstName is Jerrell")
	void FirstNameOfRecord3102() {
		assertEquals("Jerrell", customers.get(3101).getFirstName());
	}

	@Test
	@DisplayName("Record 3102: LastName is Denoyer")
	void LastNameOfRecord3102() {
		assertEquals("Denoyer", customers.get(3101).getLastName());
	}

	@Test
	@DisplayName("Record 3102: Company is Long, Jack W Jr")
	void CompanyOfRecord3102() {
		assertEquals("Long, Jack W Jr", customers.get(3101).getCompany());
	}

	@Test
	@DisplayName("Record 3102: Address is 844 Paoli Pike")
	void AddressOfRecord3102() {
		assertEquals("844 Paoli Pike", customers.get(3101).getAddress());
	}

	@Test
	@DisplayName("Record 3102: City is West Chester")
	void CityOfRecord3102() {
		assertEquals("West Chester", customers.get(3101).getCity());
	}

	@Test
	@DisplayName("Record 3102: County is Chester")
	void CountyOfRecord3102() {
		assertEquals("Chester", customers.get(3101).getCountry());
	}

	@Test
	@DisplayName("Record 3102: State is PA")
	void StateOfRecord3102() {
		assertEquals("PA", customers.get(3101).getState());
	}

	@Test
	@DisplayName("Record 3102: ZIP is 19380")
	void ZIPOfRecord3102() {
		assertEquals("19380", customers.get(3101).getZIP());
	}

	@Test
	@DisplayName("Record 3102: Phone is 610-696-1204")
	void PhoneOfRecord3102() {
		assertEquals("610-696-1204", customers.get(3101).getPhone());
	}

	@Test
	@DisplayName("Record 3102: Fax is 610-696-6201")
	void FaxOfRecord3102() {
		assertEquals("610-696-6201", customers.get(3101).getFax());
	}

	@Test
	@DisplayName("Record 3102: Email is jerrell@denoyer.com")
	void EmailOfRecord3102() {
		assertEquals("jerrell@denoyer.com", customers.get(3101).getEmail());
	}

	@Test
	@DisplayName("Record 3102: Web is http://www.jerrelldenoyer.com")
	void WebOfRecord3102() {
		assertEquals("http://www.jerrelldenoyer.com", customers.get(3101).getWeb());
	}
}
