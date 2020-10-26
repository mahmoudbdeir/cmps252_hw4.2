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

@Tag("32")
class Record_2096 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2096: FirstName is Kysha")
	void FirstNameOfRecord2096() {
		assertEquals("Kysha", customers.get(2095).getFirstName());
	}

	@Test
	@DisplayName("Record 2096: LastName is Casanas")
	void LastNameOfRecord2096() {
		assertEquals("Casanas", customers.get(2095).getLastName());
	}

	@Test
	@DisplayName("Record 2096: Company is Mmr Technologies Inc")
	void CompanyOfRecord2096() {
		assertEquals("Mmr Technologies Inc", customers.get(2095).getCompany());
	}

	@Test
	@DisplayName("Record 2096: Address is 211 Parr Blvd")
	void AddressOfRecord2096() {
		assertEquals("211 Parr Blvd", customers.get(2095).getAddress());
	}

	@Test
	@DisplayName("Record 2096: City is Richmond")
	void CityOfRecord2096() {
		assertEquals("Richmond", customers.get(2095).getCity());
	}

	@Test
	@DisplayName("Record 2096: County is Contra Costa")
	void CountyOfRecord2096() {
		assertEquals("Contra Costa", customers.get(2095).getCounty());
	}

	@Test
	@DisplayName("Record 2096: State is CA")
	void StateOfRecord2096() {
		assertEquals("CA", customers.get(2095).getState());
	}

	@Test
	@DisplayName("Record 2096: ZIP is 94801")
	void ZIPOfRecord2096() {
		assertEquals("94801", customers.get(2095).getZIP());
	}

	@Test
	@DisplayName("Record 2096: Phone is 510-236-5405")
	void PhoneOfRecord2096() {
		assertEquals("510-236-5405", customers.get(2095).getPhone());
	}

	@Test
	@DisplayName("Record 2096: Fax is 510-236-1498")
	void FaxOfRecord2096() {
		assertEquals("510-236-1498", customers.get(2095).getFax());
	}

	@Test
	@DisplayName("Record 2096: Email is kysha@casanas.com")
	void EmailOfRecord2096() {
		assertEquals("kysha@casanas.com", customers.get(2095).getEmail());
	}

	@Test
	@DisplayName("Record 2096: Web is http://www.kyshacasanas.com")
	void WebOfRecord2096() {
		assertEquals("http://www.kyshacasanas.com", customers.get(2095).getWeb());
	}
}
