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

@Tag("24")
class Record_2261 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2261: FirstName is Jamar")
	void FirstNameOfRecord2261() {
		assertEquals("Jamar", customers.get(2260).getFirstName());
	}

	@Test
	@DisplayName("Record 2261: LastName is Shelton")
	void LastNameOfRecord2261() {
		assertEquals("Shelton", customers.get(2260).getLastName());
	}

	@Test
	@DisplayName("Record 2261: Company is Killbuck Title Agency Inc")
	void CompanyOfRecord2261() {
		assertEquals("Killbuck Title Agency Inc", customers.get(2260).getCompany());
	}

	@Test
	@DisplayName("Record 2261: Address is 2803 43rd St")
	void AddressOfRecord2261() {
		assertEquals("2803 43rd St", customers.get(2260).getAddress());
	}

	@Test
	@DisplayName("Record 2261: City is Astoria")
	void CityOfRecord2261() {
		assertEquals("Astoria", customers.get(2260).getCity());
	}

	@Test
	@DisplayName("Record 2261: County is Queens")
	void CountyOfRecord2261() {
		assertEquals("Queens", customers.get(2260).getCounty());
	}

	@Test
	@DisplayName("Record 2261: State is NY")
	void StateOfRecord2261() {
		assertEquals("NY", customers.get(2260).getState());
	}

	@Test
	@DisplayName("Record 2261: ZIP is 11103")
	void ZIPOfRecord2261() {
		assertEquals("11103", customers.get(2260).getZIP());
	}

	@Test
	@DisplayName("Record 2261: Phone is 718-777-0638")
	void PhoneOfRecord2261() {
		assertEquals("718-777-0638", customers.get(2260).getPhone());
	}

	@Test
	@DisplayName("Record 2261: Fax is 718-777-8634")
	void FaxOfRecord2261() {
		assertEquals("718-777-8634", customers.get(2260).getFax());
	}

	@Test
	@DisplayName("Record 2261: Email is jamar@shelton.com")
	void EmailOfRecord2261() {
		assertEquals("jamar@shelton.com", customers.get(2260).getEmail());
	}

	@Test
	@DisplayName("Record 2261: Web is http://www.jamarshelton.com")
	void WebOfRecord2261() {
		assertEquals("http://www.jamarshelton.com", customers.get(2260).getWeb());
	}
}
