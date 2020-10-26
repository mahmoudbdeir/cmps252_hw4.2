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

@Tag("37")
class Record_228 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 228: FirstName is Isabell")
	void FirstNameOfRecord228() {
		assertEquals("Isabell", customers.get(227).getFirstName());
	}

	@Test
	@DisplayName("Record 228: LastName is Guevara")
	void LastNameOfRecord228() {
		assertEquals("Guevara", customers.get(227).getLastName());
	}

	@Test
	@DisplayName("Record 228: Company is Adx Candle Metro Bus Systems")
	void CompanyOfRecord228() {
		assertEquals("Adx Candle Metro Bus Systems", customers.get(227).getCompany());
	}

	@Test
	@DisplayName("Record 228: Address is 2401 S Tulipana Ave")
	void AddressOfRecord228() {
		assertEquals("2401 S Tulipana Ave", customers.get(227).getAddress());
	}

	@Test
	@DisplayName("Record 228: City is Weslaco")
	void CityOfRecord228() {
		assertEquals("Weslaco", customers.get(227).getCity());
	}

	@Test
	@DisplayName("Record 228: County is Hidalgo")
	void CountyOfRecord228() {
		assertEquals("Hidalgo", customers.get(227).getCounty());
	}

	@Test
	@DisplayName("Record 228: State is TX")
	void StateOfRecord228() {
		assertEquals("TX", customers.get(227).getState());
	}

	@Test
	@DisplayName("Record 228: ZIP is 78596")
	void ZIPOfRecord228() {
		assertEquals("78596", customers.get(227).getZIP());
	}

	@Test
	@DisplayName("Record 228: Phone is 956-968-8847")
	void PhoneOfRecord228() {
		assertEquals("956-968-8847", customers.get(227).getPhone());
	}

	@Test
	@DisplayName("Record 228: Fax is 956-968-3306")
	void FaxOfRecord228() {
		assertEquals("956-968-3306", customers.get(227).getFax());
	}

	@Test
	@DisplayName("Record 228: Email is isabell@guevara.com")
	void EmailOfRecord228() {
		assertEquals("isabell@guevara.com", customers.get(227).getEmail());
	}

	@Test
	@DisplayName("Record 228: Web is http://www.isabellguevara.com")
	void WebOfRecord228() {
		assertEquals("http://www.isabellguevara.com", customers.get(227).getWeb());
	}
}
