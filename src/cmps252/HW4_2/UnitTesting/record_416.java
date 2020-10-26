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
class Record_416 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 416: FirstName is Ethel")
	void FirstNameOfRecord416() {
		assertEquals("Ethel", customers.get(415).getFirstName());
	}

	@Test
	@DisplayName("Record 416: LastName is Mccaskell")
	void LastNameOfRecord416() {
		assertEquals("Mccaskell", customers.get(415).getLastName());
	}

	@Test
	@DisplayName("Record 416: Company is Ney & Associates Inc")
	void CompanyOfRecord416() {
		assertEquals("Ney & Associates Inc", customers.get(415).getCompany());
	}

	@Test
	@DisplayName("Record 416: Address is 825 8th St")
	void AddressOfRecord416() {
		assertEquals("825 8th St", customers.get(415).getAddress());
	}

	@Test
	@DisplayName("Record 416: City is Vero Beach")
	void CityOfRecord416() {
		assertEquals("Vero Beach", customers.get(415).getCity());
	}

	@Test
	@DisplayName("Record 416: County is Indian River")
	void CountyOfRecord416() {
		assertEquals("Indian River", customers.get(415).getCounty());
	}

	@Test
	@DisplayName("Record 416: State is FL")
	void StateOfRecord416() {
		assertEquals("FL", customers.get(415).getState());
	}

	@Test
	@DisplayName("Record 416: ZIP is 32962")
	void ZIPOfRecord416() {
		assertEquals("32962", customers.get(415).getZIP());
	}

	@Test
	@DisplayName("Record 416: Phone is 772-569-9847")
	void PhoneOfRecord416() {
		assertEquals("772-569-9847", customers.get(415).getPhone());
	}

	@Test
	@DisplayName("Record 416: Fax is 772-569-4694")
	void FaxOfRecord416() {
		assertEquals("772-569-4694", customers.get(415).getFax());
	}

	@Test
	@DisplayName("Record 416: Email is ethel@mccaskell.com")
	void EmailOfRecord416() {
		assertEquals("ethel@mccaskell.com", customers.get(415).getEmail());
	}

	@Test
	@DisplayName("Record 416: Web is http://www.ethelmccaskell.com")
	void WebOfRecord416() {
		assertEquals("http://www.ethelmccaskell.com", customers.get(415).getWeb());
	}
}
