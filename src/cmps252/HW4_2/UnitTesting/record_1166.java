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

@Tag("20")
class Record_1166 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1166: FirstName is Lorie")
	void FirstNameOfRecord1166() {
		assertEquals("Lorie", customers.get(1165).getFirstName());
	}

	@Test
	@DisplayName("Record 1166: LastName is Willims")
	void LastNameOfRecord1166() {
		assertEquals("Willims", customers.get(1165).getLastName());
	}

	@Test
	@DisplayName("Record 1166: Company is Mirror Tech Mfg Co Inc")
	void CompanyOfRecord1166() {
		assertEquals("Mirror Tech Mfg Co Inc", customers.get(1165).getCompany());
	}

	@Test
	@DisplayName("Record 1166: Address is 17 Baxter St")
	void AddressOfRecord1166() {
		assertEquals("17 Baxter St", customers.get(1165).getAddress());
	}

	@Test
	@DisplayName("Record 1166: City is New York")
	void CityOfRecord1166() {
		assertEquals("New York", customers.get(1165).getCity());
	}

	@Test
	@DisplayName("Record 1166: County is New York")
	void CountyOfRecord1166() {
		assertEquals("New York", customers.get(1165).getCounty());
	}

	@Test
	@DisplayName("Record 1166: State is NY")
	void StateOfRecord1166() {
		assertEquals("NY", customers.get(1165).getState());
	}

	@Test
	@DisplayName("Record 1166: ZIP is 10013")
	void ZIPOfRecord1166() {
		assertEquals("10013", customers.get(1165).getZIP());
	}

	@Test
	@DisplayName("Record 1166: Phone is 212-742-8454")
	void PhoneOfRecord1166() {
		assertEquals("212-742-8454", customers.get(1165).getPhone());
	}

	@Test
	@DisplayName("Record 1166: Fax is 212-742-0862")
	void FaxOfRecord1166() {
		assertEquals("212-742-0862", customers.get(1165).getFax());
	}

	@Test
	@DisplayName("Record 1166: Email is lorie@willims.com")
	void EmailOfRecord1166() {
		assertEquals("lorie@willims.com", customers.get(1165).getEmail());
	}

	@Test
	@DisplayName("Record 1166: Web is http://www.loriewillims.com")
	void WebOfRecord1166() {
		assertEquals("http://www.loriewillims.com", customers.get(1165).getWeb());
	}
}
