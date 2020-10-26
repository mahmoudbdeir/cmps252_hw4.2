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

@Tag("17")
class Record_4190 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4190: FirstName is Curt")
	void FirstNameOfRecord4190() {
		assertEquals("Curt", customers.get(4189).getFirstName());
	}

	@Test
	@DisplayName("Record 4190: LastName is Wickemeyer")
	void LastNameOfRecord4190() {
		assertEquals("Wickemeyer", customers.get(4189).getLastName());
	}

	@Test
	@DisplayName("Record 4190: Company is Geller, Sidney H Esq")
	void CompanyOfRecord4190() {
		assertEquals("Geller, Sidney H Esq", customers.get(4189).getCompany());
	}

	@Test
	@DisplayName("Record 4190: Address is 28 Mechanic St")
	void AddressOfRecord4190() {
		assertEquals("28 Mechanic St", customers.get(4189).getAddress());
	}

	@Test
	@DisplayName("Record 4190: City is Worcester")
	void CityOfRecord4190() {
		assertEquals("Worcester", customers.get(4189).getCity());
	}

	@Test
	@DisplayName("Record 4190: County is Worcester")
	void CountyOfRecord4190() {
		assertEquals("Worcester", customers.get(4189).getCounty());
	}

	@Test
	@DisplayName("Record 4190: State is MA")
	void StateOfRecord4190() {
		assertEquals("MA", customers.get(4189).getState());
	}

	@Test
	@DisplayName("Record 4190: ZIP is 1608")
	void ZIPOfRecord4190() {
		assertEquals("1608", customers.get(4189).getZIP());
	}

	@Test
	@DisplayName("Record 4190: Phone is 508-755-9011")
	void PhoneOfRecord4190() {
		assertEquals("508-755-9011", customers.get(4189).getPhone());
	}

	@Test
	@DisplayName("Record 4190: Fax is 508-755-2591")
	void FaxOfRecord4190() {
		assertEquals("508-755-2591", customers.get(4189).getFax());
	}

	@Test
	@DisplayName("Record 4190: Email is curt@wickemeyer.com")
	void EmailOfRecord4190() {
		assertEquals("curt@wickemeyer.com", customers.get(4189).getEmail());
	}

	@Test
	@DisplayName("Record 4190: Web is http://www.curtwickemeyer.com")
	void WebOfRecord4190() {
		assertEquals("http://www.curtwickemeyer.com", customers.get(4189).getWeb());
	}
}
