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

@Tag("22")
class Record_3108 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3108: FirstName is Rolf")
	void FirstNameOfRecord3108() {
		assertEquals("Rolf", customers.get(3107).getFirstName());
	}

	@Test
	@DisplayName("Record 3108: LastName is Pinks")
	void LastNameOfRecord3108() {
		assertEquals("Pinks", customers.get(3107).getLastName());
	}

	@Test
	@DisplayName("Record 3108: Company is A S G Forwarding Inc")
	void CompanyOfRecord3108() {
		assertEquals("A S G Forwarding Inc", customers.get(3107).getCompany());
	}

	@Test
	@DisplayName("Record 3108: Address is 720 E Morehead St")
	void AddressOfRecord3108() {
		assertEquals("720 E Morehead St", customers.get(3107).getAddress());
	}

	@Test
	@DisplayName("Record 3108: City is Charlotte")
	void CityOfRecord3108() {
		assertEquals("Charlotte", customers.get(3107).getCity());
	}

	@Test
	@DisplayName("Record 3108: County is Mecklenburg")
	void CountyOfRecord3108() {
		assertEquals("Mecklenburg", customers.get(3107).getCounty());
	}

	@Test
	@DisplayName("Record 3108: State is NC")
	void StateOfRecord3108() {
		assertEquals("NC", customers.get(3107).getState());
	}

	@Test
	@DisplayName("Record 3108: ZIP is 28202")
	void ZIPOfRecord3108() {
		assertEquals("28202", customers.get(3107).getZIP());
	}

	@Test
	@DisplayName("Record 3108: Phone is 704-358-9727")
	void PhoneOfRecord3108() {
		assertEquals("704-358-9727", customers.get(3107).getPhone());
	}

	@Test
	@DisplayName("Record 3108: Fax is 704-358-6759")
	void FaxOfRecord3108() {
		assertEquals("704-358-6759", customers.get(3107).getFax());
	}

	@Test
	@DisplayName("Record 3108: Email is rolf@pinks.com")
	void EmailOfRecord3108() {
		assertEquals("rolf@pinks.com", customers.get(3107).getEmail());
	}

	@Test
	@DisplayName("Record 3108: Web is http://www.rolfpinks.com")
	void WebOfRecord3108() {
		assertEquals("http://www.rolfpinks.com", customers.get(3107).getWeb());
	}
}
