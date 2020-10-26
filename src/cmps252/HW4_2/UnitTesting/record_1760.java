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

@Tag("49")
class Record_1760 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1760: FirstName is Bess")
	void FirstNameOfRecord1760() {
		assertEquals("Bess", customers.get(1759).getFirstName());
	}

	@Test
	@DisplayName("Record 1760: LastName is Clutts")
	void LastNameOfRecord1760() {
		assertEquals("Clutts", customers.get(1759).getLastName());
	}

	@Test
	@DisplayName("Record 1760: Company is Health & Hospital Services")
	void CompanyOfRecord1760() {
		assertEquals("Health & Hospital Services", customers.get(1759).getCompany());
	}

	@Test
	@DisplayName("Record 1760: Address is 2412 Maple Ave")
	void AddressOfRecord1760() {
		assertEquals("2412 Maple Ave", customers.get(1759).getAddress());
	}

	@Test
	@DisplayName("Record 1760: City is Fair Lawn")
	void CityOfRecord1760() {
		assertEquals("Fair Lawn", customers.get(1759).getCity());
	}

	@Test
	@DisplayName("Record 1760: County is Bergen")
	void CountyOfRecord1760() {
		assertEquals("Bergen", customers.get(1759).getCounty());
	}

	@Test
	@DisplayName("Record 1760: State is NJ")
	void StateOfRecord1760() {
		assertEquals("NJ", customers.get(1759).getState());
	}

	@Test
	@DisplayName("Record 1760: ZIP is 7410")
	void ZIPOfRecord1760() {
		assertEquals("7410", customers.get(1759).getZIP());
	}

	@Test
	@DisplayName("Record 1760: Phone is 201-447-5941")
	void PhoneOfRecord1760() {
		assertEquals("201-447-5941", customers.get(1759).getPhone());
	}

	@Test
	@DisplayName("Record 1760: Fax is 201-447-8374")
	void FaxOfRecord1760() {
		assertEquals("201-447-8374", customers.get(1759).getFax());
	}

	@Test
	@DisplayName("Record 1760: Email is bess@clutts.com")
	void EmailOfRecord1760() {
		assertEquals("bess@clutts.com", customers.get(1759).getEmail());
	}

	@Test
	@DisplayName("Record 1760: Web is http://www.bessclutts.com")
	void WebOfRecord1760() {
		assertEquals("http://www.bessclutts.com", customers.get(1759).getWeb());
	}
}
