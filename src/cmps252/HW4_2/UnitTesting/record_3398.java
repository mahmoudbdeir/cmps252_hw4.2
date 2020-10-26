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

@Tag("44")
class Record_3398 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3398: FirstName is Zelma")
	void FirstNameOfRecord3398() {
		assertEquals("Zelma", customers.get(3397).getFirstName());
	}

	@Test
	@DisplayName("Record 3398: LastName is Pachar")
	void LastNameOfRecord3398() {
		assertEquals("Pachar", customers.get(3397).getLastName());
	}

	@Test
	@DisplayName("Record 3398: Company is Three W Manufacturing Co")
	void CompanyOfRecord3398() {
		assertEquals("Three W Manufacturing Co", customers.get(3397).getCompany());
	}

	@Test
	@DisplayName("Record 3398: Address is 5640 Timuquana Rd")
	void AddressOfRecord3398() {
		assertEquals("5640 Timuquana Rd", customers.get(3397).getAddress());
	}

	@Test
	@DisplayName("Record 3398: City is Jacksonville")
	void CityOfRecord3398() {
		assertEquals("Jacksonville", customers.get(3397).getCity());
	}

	@Test
	@DisplayName("Record 3398: County is Duval")
	void CountyOfRecord3398() {
		assertEquals("Duval", customers.get(3397).getCounty());
	}

	@Test
	@DisplayName("Record 3398: State is FL")
	void StateOfRecord3398() {
		assertEquals("FL", customers.get(3397).getState());
	}

	@Test
	@DisplayName("Record 3398: ZIP is 32210")
	void ZIPOfRecord3398() {
		assertEquals("32210", customers.get(3397).getZIP());
	}

	@Test
	@DisplayName("Record 3398: Phone is 904-777-0400")
	void PhoneOfRecord3398() {
		assertEquals("904-777-0400", customers.get(3397).getPhone());
	}

	@Test
	@DisplayName("Record 3398: Fax is 904-777-8884")
	void FaxOfRecord3398() {
		assertEquals("904-777-8884", customers.get(3397).getFax());
	}

	@Test
	@DisplayName("Record 3398: Email is zelma@pachar.com")
	void EmailOfRecord3398() {
		assertEquals("zelma@pachar.com", customers.get(3397).getEmail());
	}

	@Test
	@DisplayName("Record 3398: Web is http://www.zelmapachar.com")
	void WebOfRecord3398() {
		assertEquals("http://www.zelmapachar.com", customers.get(3397).getWeb());
	}
}
