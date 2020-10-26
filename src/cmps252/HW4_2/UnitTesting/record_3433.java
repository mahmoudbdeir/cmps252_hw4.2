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

@Tag("2")
class Record_3433 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3433: FirstName is Stacey")
	void FirstNameOfRecord3433() {
		assertEquals("Stacey", customers.get(3432).getFirstName());
	}

	@Test
	@DisplayName("Record 3433: LastName is Nunlee")
	void LastNameOfRecord3433() {
		assertEquals("Nunlee", customers.get(3432).getLastName());
	}

	@Test
	@DisplayName("Record 3433: Company is Anasazi Stone Inc")
	void CompanyOfRecord3433() {
		assertEquals("Anasazi Stone Inc", customers.get(3432).getCompany());
	}

	@Test
	@DisplayName("Record 3433: Address is 1121 L St")
	void AddressOfRecord3433() {
		assertEquals("1121 L St", customers.get(3432).getAddress());
	}

	@Test
	@DisplayName("Record 3433: City is Sacramento")
	void CityOfRecord3433() {
		assertEquals("Sacramento", customers.get(3432).getCity());
	}

	@Test
	@DisplayName("Record 3433: County is Sacramento")
	void CountyOfRecord3433() {
		assertEquals("Sacramento", customers.get(3432).getCounty());
	}

	@Test
	@DisplayName("Record 3433: State is CA")
	void StateOfRecord3433() {
		assertEquals("CA", customers.get(3432).getState());
	}

	@Test
	@DisplayName("Record 3433: ZIP is 95814")
	void ZIPOfRecord3433() {
		assertEquals("95814", customers.get(3432).getZIP());
	}

	@Test
	@DisplayName("Record 3433: Phone is 916-442-8099")
	void PhoneOfRecord3433() {
		assertEquals("916-442-8099", customers.get(3432).getPhone());
	}

	@Test
	@DisplayName("Record 3433: Fax is 916-442-8091")
	void FaxOfRecord3433() {
		assertEquals("916-442-8091", customers.get(3432).getFax());
	}

	@Test
	@DisplayName("Record 3433: Email is stacey@nunlee.com")
	void EmailOfRecord3433() {
		assertEquals("stacey@nunlee.com", customers.get(3432).getEmail());
	}

	@Test
	@DisplayName("Record 3433: Web is http://www.staceynunlee.com")
	void WebOfRecord3433() {
		assertEquals("http://www.staceynunlee.com", customers.get(3432).getWeb());
	}
}
