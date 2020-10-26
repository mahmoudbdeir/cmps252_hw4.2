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

@Tag("27")
class Record_857 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 857: FirstName is Tiffani")
	void FirstNameOfRecord857() {
		assertEquals("Tiffani", customers.get(856).getFirstName());
	}

	@Test
	@DisplayName("Record 857: LastName is Sisneros")
	void LastNameOfRecord857() {
		assertEquals("Sisneros", customers.get(856).getLastName());
	}

	@Test
	@DisplayName("Record 857: Company is Vogel Carton Corp Inc")
	void CompanyOfRecord857() {
		assertEquals("Vogel Carton Corp Inc", customers.get(856).getCompany());
	}

	@Test
	@DisplayName("Record 857: Address is 41 Sutton Ln")
	void AddressOfRecord857() {
		assertEquals("41 Sutton Ln", customers.get(856).getAddress());
	}

	@Test
	@DisplayName("Record 857: City is Worcester")
	void CityOfRecord857() {
		assertEquals("Worcester", customers.get(856).getCity());
	}

	@Test
	@DisplayName("Record 857: County is Worcester")
	void CountyOfRecord857() {
		assertEquals("Worcester", customers.get(856).getCounty());
	}

	@Test
	@DisplayName("Record 857: State is MA")
	void StateOfRecord857() {
		assertEquals("MA", customers.get(856).getState());
	}

	@Test
	@DisplayName("Record 857: ZIP is 1603")
	void ZIPOfRecord857() {
		assertEquals("1603", customers.get(856).getZIP());
	}

	@Test
	@DisplayName("Record 857: Phone is 508-752-7387")
	void PhoneOfRecord857() {
		assertEquals("508-752-7387", customers.get(856).getPhone());
	}

	@Test
	@DisplayName("Record 857: Fax is 508-752-9035")
	void FaxOfRecord857() {
		assertEquals("508-752-9035", customers.get(856).getFax());
	}

	@Test
	@DisplayName("Record 857: Email is tiffani@sisneros.com")
	void EmailOfRecord857() {
		assertEquals("tiffani@sisneros.com", customers.get(856).getEmail());
	}

	@Test
	@DisplayName("Record 857: Web is http://www.tiffanisisneros.com")
	void WebOfRecord857() {
		assertEquals("http://www.tiffanisisneros.com", customers.get(856).getWeb());
	}
}
