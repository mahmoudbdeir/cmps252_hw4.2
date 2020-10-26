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

@Tag("6")
class Record_2240 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2240: FirstName is Rupert")
	void FirstNameOfRecord2240() {
		assertEquals("Rupert", customers.get(2239).getFirstName());
	}

	@Test
	@DisplayName("Record 2240: LastName is Jerger")
	void LastNameOfRecord2240() {
		assertEquals("Jerger", customers.get(2239).getLastName());
	}

	@Test
	@DisplayName("Record 2240: Company is Wooden Valley Winery")
	void CompanyOfRecord2240() {
		assertEquals("Wooden Valley Winery", customers.get(2239).getCompany());
	}

	@Test
	@DisplayName("Record 2240: Address is 3535 W 5th St")
	void AddressOfRecord2240() {
		assertEquals("3535 W 5th St", customers.get(2239).getAddress());
	}

	@Test
	@DisplayName("Record 2240: City is Oxnard")
	void CityOfRecord2240() {
		assertEquals("Oxnard", customers.get(2239).getCity());
	}

	@Test
	@DisplayName("Record 2240: County is Ventura")
	void CountyOfRecord2240() {
		assertEquals("Ventura", customers.get(2239).getCounty());
	}

	@Test
	@DisplayName("Record 2240: State is CA")
	void StateOfRecord2240() {
		assertEquals("CA", customers.get(2239).getState());
	}

	@Test
	@DisplayName("Record 2240: ZIP is 93030")
	void ZIPOfRecord2240() {
		assertEquals("93030", customers.get(2239).getZIP());
	}

	@Test
	@DisplayName("Record 2240: Phone is 805-984-8185")
	void PhoneOfRecord2240() {
		assertEquals("805-984-8185", customers.get(2239).getPhone());
	}

	@Test
	@DisplayName("Record 2240: Fax is 805-984-4584")
	void FaxOfRecord2240() {
		assertEquals("805-984-4584", customers.get(2239).getFax());
	}

	@Test
	@DisplayName("Record 2240: Email is rupert@jerger.com")
	void EmailOfRecord2240() {
		assertEquals("rupert@jerger.com", customers.get(2239).getEmail());
	}

	@Test
	@DisplayName("Record 2240: Web is http://www.rupertjerger.com")
	void WebOfRecord2240() {
		assertEquals("http://www.rupertjerger.com", customers.get(2239).getWeb());
	}
}
