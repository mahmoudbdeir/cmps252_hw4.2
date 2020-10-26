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

@Tag("31")
class Record_3664 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3664: FirstName is Debora")
	void FirstNameOfRecord3664() {
		assertEquals("Debora", customers.get(3663).getFirstName());
	}

	@Test
	@DisplayName("Record 3664: LastName is Kusner")
	void LastNameOfRecord3664() {
		assertEquals("Kusner", customers.get(3663).getLastName());
	}

	@Test
	@DisplayName("Record 3664: Company is Ga Fndtn For Indpndnt Colleges")
	void CompanyOfRecord3664() {
		assertEquals("Ga Fndtn For Indpndnt Colleges", customers.get(3663).getCompany());
	}

	@Test
	@DisplayName("Record 3664: Address is 5400 Tall Timber Trl")
	void AddressOfRecord3664() {
		assertEquals("5400 Tall Timber Trl", customers.get(3663).getAddress());
	}

	@Test
	@DisplayName("Record 3664: City is Gaylord")
	void CityOfRecord3664() {
		assertEquals("Gaylord", customers.get(3663).getCity());
	}

	@Test
	@DisplayName("Record 3664: County is Otsego")
	void CountyOfRecord3664() {
		assertEquals("Otsego", customers.get(3663).getCounty());
	}

	@Test
	@DisplayName("Record 3664: State is MI")
	void StateOfRecord3664() {
		assertEquals("MI", customers.get(3663).getState());
	}

	@Test
	@DisplayName("Record 3664: ZIP is 49735")
	void ZIPOfRecord3664() {
		assertEquals("49735", customers.get(3663).getZIP());
	}

	@Test
	@DisplayName("Record 3664: Phone is 989-731-3158")
	void PhoneOfRecord3664() {
		assertEquals("989-731-3158", customers.get(3663).getPhone());
	}

	@Test
	@DisplayName("Record 3664: Fax is 989-731-3583")
	void FaxOfRecord3664() {
		assertEquals("989-731-3583", customers.get(3663).getFax());
	}

	@Test
	@DisplayName("Record 3664: Email is debora@kusner.com")
	void EmailOfRecord3664() {
		assertEquals("debora@kusner.com", customers.get(3663).getEmail());
	}

	@Test
	@DisplayName("Record 3664: Web is http://www.deborakusner.com")
	void WebOfRecord3664() {
		assertEquals("http://www.deborakusner.com", customers.get(3663).getWeb());
	}
}
