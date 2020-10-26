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
class Record_2299 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2299: FirstName is Mac")
	void FirstNameOfRecord2299() {
		assertEquals("Mac", customers.get(2298).getFirstName());
	}

	@Test
	@DisplayName("Record 2299: LastName is Defino")
	void LastNameOfRecord2299() {
		assertEquals("Defino", customers.get(2298).getLastName());
	}

	@Test
	@DisplayName("Record 2299: Company is Rooke Harmer Numismatists Ltd")
	void CompanyOfRecord2299() {
		assertEquals("Rooke Harmer Numismatists Ltd", customers.get(2298).getCompany());
	}

	@Test
	@DisplayName("Record 2299: Address is 45110 Oasis St")
	void AddressOfRecord2299() {
		assertEquals("45110 Oasis St", customers.get(2298).getAddress());
	}

	@Test
	@DisplayName("Record 2299: City is Indio")
	void CityOfRecord2299() {
		assertEquals("Indio", customers.get(2298).getCity());
	}

	@Test
	@DisplayName("Record 2299: County is Riverside")
	void CountyOfRecord2299() {
		assertEquals("Riverside", customers.get(2298).getCounty());
	}

	@Test
	@DisplayName("Record 2299: State is CA")
	void StateOfRecord2299() {
		assertEquals("CA", customers.get(2298).getState());
	}

	@Test
	@DisplayName("Record 2299: ZIP is 92201")
	void ZIPOfRecord2299() {
		assertEquals("92201", customers.get(2298).getZIP());
	}

	@Test
	@DisplayName("Record 2299: Phone is 760-342-7778")
	void PhoneOfRecord2299() {
		assertEquals("760-342-7778", customers.get(2298).getPhone());
	}

	@Test
	@DisplayName("Record 2299: Fax is 760-342-4753")
	void FaxOfRecord2299() {
		assertEquals("760-342-4753", customers.get(2298).getFax());
	}

	@Test
	@DisplayName("Record 2299: Email is mac@defino.com")
	void EmailOfRecord2299() {
		assertEquals("mac@defino.com", customers.get(2298).getEmail());
	}

	@Test
	@DisplayName("Record 2299: Web is http://www.macdefino.com")
	void WebOfRecord2299() {
		assertEquals("http://www.macdefino.com", customers.get(2298).getWeb());
	}
}
