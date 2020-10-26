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

@Tag("23")
class Record_412 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 412: FirstName is Michel")
	void FirstNameOfRecord412() {
		assertEquals("Michel", customers.get(411).getFirstName());
	}

	@Test
	@DisplayName("Record 412: LastName is Bodenhagen")
	void LastNameOfRecord412() {
		assertEquals("Bodenhagen", customers.get(411).getLastName());
	}

	@Test
	@DisplayName("Record 412: Company is Regency Inn")
	void CompanyOfRecord412() {
		assertEquals("Regency Inn", customers.get(411).getCompany());
	}

	@Test
	@DisplayName("Record 412: Address is 71906 Us Highway 111")
	void AddressOfRecord412() {
		assertEquals("71906 Us Highway 111", customers.get(411).getAddress());
	}

	@Test
	@DisplayName("Record 412: City is Rancho Mirage")
	void CityOfRecord412() {
		assertEquals("Rancho Mirage", customers.get(411).getCity());
	}

	@Test
	@DisplayName("Record 412: County is Riverside")
	void CountyOfRecord412() {
		assertEquals("Riverside", customers.get(411).getCounty());
	}

	@Test
	@DisplayName("Record 412: State is CA")
	void StateOfRecord412() {
		assertEquals("CA", customers.get(411).getState());
	}

	@Test
	@DisplayName("Record 412: ZIP is 92270")
	void ZIPOfRecord412() {
		assertEquals("92270", customers.get(411).getZIP());
	}

	@Test
	@DisplayName("Record 412: Phone is 760-346-0633")
	void PhoneOfRecord412() {
		assertEquals("760-346-0633", customers.get(411).getPhone());
	}

	@Test
	@DisplayName("Record 412: Fax is 760-346-3967")
	void FaxOfRecord412() {
		assertEquals("760-346-3967", customers.get(411).getFax());
	}

	@Test
	@DisplayName("Record 412: Email is michel@bodenhagen.com")
	void EmailOfRecord412() {
		assertEquals("michel@bodenhagen.com", customers.get(411).getEmail());
	}

	@Test
	@DisplayName("Record 412: Web is http://www.michelbodenhagen.com")
	void WebOfRecord412() {
		assertEquals("http://www.michelbodenhagen.com", customers.get(411).getWeb());
	}
}
