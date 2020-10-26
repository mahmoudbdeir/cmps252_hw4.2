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

@Tag("0")
class Record_3241 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3241: FirstName is Major")
	void FirstNameOfRecord3241() {
		assertEquals("Major", customers.get(3240).getFirstName());
	}

	@Test
	@DisplayName("Record 3241: LastName is Zeleznik")
	void LastNameOfRecord3241() {
		assertEquals("Zeleznik", customers.get(3240).getLastName());
	}

	@Test
	@DisplayName("Record 3241: Company is Anderson Wormley Real Estate")
	void CompanyOfRecord3241() {
		assertEquals("Anderson Wormley Real Estate", customers.get(3240).getCompany());
	}

	@Test
	@DisplayName("Record 3241: Address is 15 Brooks St")
	void AddressOfRecord3241() {
		assertEquals("15 Brooks St", customers.get(3240).getAddress());
	}

	@Test
	@DisplayName("Record 3241: City is Jersey City")
	void CityOfRecord3241() {
		assertEquals("Jersey City", customers.get(3240).getCity());
	}

	@Test
	@DisplayName("Record 3241: County is Hudson")
	void CountyOfRecord3241() {
		assertEquals("Hudson", customers.get(3240).getCounty());
	}

	@Test
	@DisplayName("Record 3241: State is NJ")
	void StateOfRecord3241() {
		assertEquals("NJ", customers.get(3240).getState());
	}

	@Test
	@DisplayName("Record 3241: ZIP is 7302")
	void ZIPOfRecord3241() {
		assertEquals("7302", customers.get(3240).getZIP());
	}

	@Test
	@DisplayName("Record 3241: Phone is 201-434-0338")
	void PhoneOfRecord3241() {
		assertEquals("201-434-0338", customers.get(3240).getPhone());
	}

	@Test
	@DisplayName("Record 3241: Fax is 201-434-3326")
	void FaxOfRecord3241() {
		assertEquals("201-434-3326", customers.get(3240).getFax());
	}

	@Test
	@DisplayName("Record 3241: Email is major@zeleznik.com")
	void EmailOfRecord3241() {
		assertEquals("major@zeleznik.com", customers.get(3240).getEmail());
	}

	@Test
	@DisplayName("Record 3241: Web is http://www.majorzeleznik.com")
	void WebOfRecord3241() {
		assertEquals("http://www.majorzeleznik.com", customers.get(3240).getWeb());
	}
}
