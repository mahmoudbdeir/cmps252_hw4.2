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
class Record_2586 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2586: FirstName is Karla")
	void FirstNameOfRecord2586() {
		assertEquals("Karla", customers.get(2585).getFirstName());
	}

	@Test
	@DisplayName("Record 2586: LastName is Pavelich")
	void LastNameOfRecord2586() {
		assertEquals("Pavelich", customers.get(2585).getLastName());
	}

	@Test
	@DisplayName("Record 2586: Company is Robin Ring Corp")
	void CompanyOfRecord2586() {
		assertEquals("Robin Ring Corp", customers.get(2585).getCompany());
	}

	@Test
	@DisplayName("Record 2586: Address is 186 Alewife Brook Pky")
	void AddressOfRecord2586() {
		assertEquals("186 Alewife Brook Pky", customers.get(2585).getAddress());
	}

	@Test
	@DisplayName("Record 2586: City is Cambridge")
	void CityOfRecord2586() {
		assertEquals("Cambridge", customers.get(2585).getCity());
	}

	@Test
	@DisplayName("Record 2586: County is Middlesex")
	void CountyOfRecord2586() {
		assertEquals("Middlesex", customers.get(2585).getCounty());
	}

	@Test
	@DisplayName("Record 2586: State is MA")
	void StateOfRecord2586() {
		assertEquals("MA", customers.get(2585).getState());
	}

	@Test
	@DisplayName("Record 2586: ZIP is 2138")
	void ZIPOfRecord2586() {
		assertEquals("2138", customers.get(2585).getZIP());
	}

	@Test
	@DisplayName("Record 2586: Phone is 617-661-4526")
	void PhoneOfRecord2586() {
		assertEquals("617-661-4526", customers.get(2585).getPhone());
	}

	@Test
	@DisplayName("Record 2586: Fax is 617-661-5446")
	void FaxOfRecord2586() {
		assertEquals("617-661-5446", customers.get(2585).getFax());
	}

	@Test
	@DisplayName("Record 2586: Email is karla@pavelich.com")
	void EmailOfRecord2586() {
		assertEquals("karla@pavelich.com", customers.get(2585).getEmail());
	}

	@Test
	@DisplayName("Record 2586: Web is http://www.karlapavelich.com")
	void WebOfRecord2586() {
		assertEquals("http://www.karlapavelich.com", customers.get(2585).getWeb());
	}
}
