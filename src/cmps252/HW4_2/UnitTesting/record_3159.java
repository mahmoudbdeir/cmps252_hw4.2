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
class Record_3159 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3159: FirstName is Lenny")
	void FirstNameOfRecord3159() {
		assertEquals("Lenny", customers.get(3158).getFirstName());
	}

	@Test
	@DisplayName("Record 3159: LastName is Averett")
	void LastNameOfRecord3159() {
		assertEquals("Averett", customers.get(3158).getLastName());
	}

	@Test
	@DisplayName("Record 3159: Company is Black Equipment Co Inc")
	void CompanyOfRecord3159() {
		assertEquals("Black Equipment Co Inc", customers.get(3158).getCompany());
	}

	@Test
	@DisplayName("Record 3159: Address is 6700 Nw 77th Ct")
	void AddressOfRecord3159() {
		assertEquals("6700 Nw 77th Ct", customers.get(3158).getAddress());
	}

	@Test
	@DisplayName("Record 3159: City is Miami")
	void CityOfRecord3159() {
		assertEquals("Miami", customers.get(3158).getCity());
	}

	@Test
	@DisplayName("Record 3159: County is Miami-Dade")
	void CountyOfRecord3159() {
		assertEquals("Miami-Dade", customers.get(3158).getCounty());
	}

	@Test
	@DisplayName("Record 3159: State is FL")
	void StateOfRecord3159() {
		assertEquals("FL", customers.get(3158).getState());
	}

	@Test
	@DisplayName("Record 3159: ZIP is 33166")
	void ZIPOfRecord3159() {
		assertEquals("33166", customers.get(3158).getZIP());
	}

	@Test
	@DisplayName("Record 3159: Phone is 305-593-5258")
	void PhoneOfRecord3159() {
		assertEquals("305-593-5258", customers.get(3158).getPhone());
	}

	@Test
	@DisplayName("Record 3159: Fax is 305-593-2255")
	void FaxOfRecord3159() {
		assertEquals("305-593-2255", customers.get(3158).getFax());
	}

	@Test
	@DisplayName("Record 3159: Email is lenny@averett.com")
	void EmailOfRecord3159() {
		assertEquals("lenny@averett.com", customers.get(3158).getEmail());
	}

	@Test
	@DisplayName("Record 3159: Web is http://www.lennyaverett.com")
	void WebOfRecord3159() {
		assertEquals("http://www.lennyaverett.com", customers.get(3158).getWeb());
	}
}
