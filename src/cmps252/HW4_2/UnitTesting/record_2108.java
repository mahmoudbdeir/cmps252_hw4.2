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

@Tag("11")
class Record_2108 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2108: FirstName is Gregory")
	void FirstNameOfRecord2108() {
		assertEquals("Gregory", customers.get(2107).getFirstName());
	}

	@Test
	@DisplayName("Record 2108: LastName is Roderiquez")
	void LastNameOfRecord2108() {
		assertEquals("Roderiquez", customers.get(2107).getLastName());
	}

	@Test
	@DisplayName("Record 2108: Company is Indiana Fan Co")
	void CompanyOfRecord2108() {
		assertEquals("Indiana Fan Co", customers.get(2107).getCompany());
	}

	@Test
	@DisplayName("Record 2108: Address is 12210 Michigan St")
	void AddressOfRecord2108() {
		assertEquals("12210 Michigan St", customers.get(2107).getAddress());
	}

	@Test
	@DisplayName("Record 2108: City is Grand Terrace")
	void CityOfRecord2108() {
		assertEquals("Grand Terrace", customers.get(2107).getCity());
	}

	@Test
	@DisplayName("Record 2108: County is San Bernardino")
	void CountyOfRecord2108() {
		assertEquals("San Bernardino", customers.get(2107).getCounty());
	}

	@Test
	@DisplayName("Record 2108: State is CA")
	void StateOfRecord2108() {
		assertEquals("CA", customers.get(2107).getState());
	}

	@Test
	@DisplayName("Record 2108: ZIP is 92313")
	void ZIPOfRecord2108() {
		assertEquals("92313", customers.get(2107).getZIP());
	}

	@Test
	@DisplayName("Record 2108: Phone is 760-825-7241")
	void PhoneOfRecord2108() {
		assertEquals("760-825-7241", customers.get(2107).getPhone());
	}

	@Test
	@DisplayName("Record 2108: Fax is 760-825-4865")
	void FaxOfRecord2108() {
		assertEquals("760-825-4865", customers.get(2107).getFax());
	}

	@Test
	@DisplayName("Record 2108: Email is gregory@roderiquez.com")
	void EmailOfRecord2108() {
		assertEquals("gregory@roderiquez.com", customers.get(2107).getEmail());
	}

	@Test
	@DisplayName("Record 2108: Web is http://www.gregoryroderiquez.com")
	void WebOfRecord2108() {
		assertEquals("http://www.gregoryroderiquez.com", customers.get(2107).getWeb());
	}
}
