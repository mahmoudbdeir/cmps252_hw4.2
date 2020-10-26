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

@Tag("5")
class Record_1520 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1520: FirstName is Donna")
	void FirstNameOfRecord1520() {
		assertEquals("Donna", customers.get(1519).getFirstName());
	}

	@Test
	@DisplayName("Record 1520: LastName is Leggs")
	void LastNameOfRecord1520() {
		assertEquals("Leggs", customers.get(1519).getLastName());
	}

	@Test
	@DisplayName("Record 1520: Company is Sterling Sportswear")
	void CompanyOfRecord1520() {
		assertEquals("Sterling Sportswear", customers.get(1519).getCompany());
	}

	@Test
	@DisplayName("Record 1520: Address is 300 Sunshine Ln")
	void AddressOfRecord1520() {
		assertEquals("300 Sunshine Ln", customers.get(1519).getAddress());
	}

	@Test
	@DisplayName("Record 1520: City is Reno")
	void CityOfRecord1520() {
		assertEquals("Reno", customers.get(1519).getCity());
	}

	@Test
	@DisplayName("Record 1520: County is Washoe")
	void CountyOfRecord1520() {
		assertEquals("Washoe", customers.get(1519).getCounty());
	}

	@Test
	@DisplayName("Record 1520: State is NV")
	void StateOfRecord1520() {
		assertEquals("NV", customers.get(1519).getState());
	}

	@Test
	@DisplayName("Record 1520: ZIP is 89502")
	void ZIPOfRecord1520() {
		assertEquals("89502", customers.get(1519).getZIP());
	}

	@Test
	@DisplayName("Record 1520: Phone is 775-322-6439")
	void PhoneOfRecord1520() {
		assertEquals("775-322-6439", customers.get(1519).getPhone());
	}

	@Test
	@DisplayName("Record 1520: Fax is 775-322-5767")
	void FaxOfRecord1520() {
		assertEquals("775-322-5767", customers.get(1519).getFax());
	}

	@Test
	@DisplayName("Record 1520: Email is donna@leggs.com")
	void EmailOfRecord1520() {
		assertEquals("donna@leggs.com", customers.get(1519).getEmail());
	}

	@Test
	@DisplayName("Record 1520: Web is http://www.donnaleggs.com")
	void WebOfRecord1520() {
		assertEquals("http://www.donnaleggs.com", customers.get(1519).getWeb());
	}
}
