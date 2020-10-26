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

@Tag("4")
class Record_1582 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1582: FirstName is Bette")
	void FirstNameOfRecord1582() {
		assertEquals("Bette", customers.get(1581).getFirstName());
	}

	@Test
	@DisplayName("Record 1582: LastName is Tegtmyer")
	void LastNameOfRecord1582() {
		assertEquals("Tegtmyer", customers.get(1581).getLastName());
	}

	@Test
	@DisplayName("Record 1582: Company is Force Machy Co Ind Rtl Divsn")
	void CompanyOfRecord1582() {
		assertEquals("Force Machy Co Ind Rtl Divsn", customers.get(1581).getCompany());
	}

	@Test
	@DisplayName("Record 1582: Address is 1702 S 7th St")
	void AddressOfRecord1582() {
		assertEquals("1702 S 7th St", customers.get(1581).getAddress());
	}

	@Test
	@DisplayName("Record 1582: City is San Jose")
	void CityOfRecord1582() {
		assertEquals("San Jose", customers.get(1581).getCity());
	}

	@Test
	@DisplayName("Record 1582: County is Santa Clara")
	void CountyOfRecord1582() {
		assertEquals("Santa Clara", customers.get(1581).getCounty());
	}

	@Test
	@DisplayName("Record 1582: State is CA")
	void StateOfRecord1582() {
		assertEquals("CA", customers.get(1581).getState());
	}

	@Test
	@DisplayName("Record 1582: ZIP is 95112")
	void ZIPOfRecord1582() {
		assertEquals("95112", customers.get(1581).getZIP());
	}

	@Test
	@DisplayName("Record 1582: Phone is 408-294-2206")
	void PhoneOfRecord1582() {
		assertEquals("408-294-2206", customers.get(1581).getPhone());
	}

	@Test
	@DisplayName("Record 1582: Fax is 408-294-0155")
	void FaxOfRecord1582() {
		assertEquals("408-294-0155", customers.get(1581).getFax());
	}

	@Test
	@DisplayName("Record 1582: Email is bette@tegtmyer.com")
	void EmailOfRecord1582() {
		assertEquals("bette@tegtmyer.com", customers.get(1581).getEmail());
	}

	@Test
	@DisplayName("Record 1582: Web is http://www.bettetegtmyer.com")
	void WebOfRecord1582() {
		assertEquals("http://www.bettetegtmyer.com", customers.get(1581).getWeb());
	}
}
