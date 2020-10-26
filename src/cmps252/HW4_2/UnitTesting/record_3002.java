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
class Record_3002 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3002: FirstName is Dianna")
	void FirstNameOfRecord3002() {
		assertEquals("Dianna", customers.get(3001).getFirstName());
	}

	@Test
	@DisplayName("Record 3002: LastName is Maise")
	void LastNameOfRecord3002() {
		assertEquals("Maise", customers.get(3001).getLastName());
	}

	@Test
	@DisplayName("Record 3002: Company is Photronics Inc")
	void CompanyOfRecord3002() {
		assertEquals("Photronics Inc", customers.get(3001).getCompany());
	}

	@Test
	@DisplayName("Record 3002: Address is 1324 N Hollywood St")
	void AddressOfRecord3002() {
		assertEquals("1324 N Hollywood St", customers.get(3001).getAddress());
	}

	@Test
	@DisplayName("Record 3002: City is Memphis")
	void CityOfRecord3002() {
		assertEquals("Memphis", customers.get(3001).getCity());
	}

	@Test
	@DisplayName("Record 3002: County is Shelby")
	void CountyOfRecord3002() {
		assertEquals("Shelby", customers.get(3001).getCounty());
	}

	@Test
	@DisplayName("Record 3002: State is TN")
	void StateOfRecord3002() {
		assertEquals("TN", customers.get(3001).getState());
	}

	@Test
	@DisplayName("Record 3002: ZIP is 38108")
	void ZIPOfRecord3002() {
		assertEquals("38108", customers.get(3001).getZIP());
	}

	@Test
	@DisplayName("Record 3002: Phone is 901-452-7064")
	void PhoneOfRecord3002() {
		assertEquals("901-452-7064", customers.get(3001).getPhone());
	}

	@Test
	@DisplayName("Record 3002: Fax is 901-452-5694")
	void FaxOfRecord3002() {
		assertEquals("901-452-5694", customers.get(3001).getFax());
	}

	@Test
	@DisplayName("Record 3002: Email is dianna@maise.com")
	void EmailOfRecord3002() {
		assertEquals("dianna@maise.com", customers.get(3001).getEmail());
	}

	@Test
	@DisplayName("Record 3002: Web is http://www.diannamaise.com")
	void WebOfRecord3002() {
		assertEquals("http://www.diannamaise.com", customers.get(3001).getWeb());
	}
}
