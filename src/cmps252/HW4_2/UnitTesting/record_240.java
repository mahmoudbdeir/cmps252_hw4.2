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

@Tag("5")
class Record_240 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 240: FirstName is Gilbert")
	void FirstNameOfRecord240() {
		assertEquals("Gilbert", customers.get(239).getFirstName());
	}

	@Test
	@DisplayName("Record 240: LastName is Dorman")
	void LastNameOfRecord240() {
		assertEquals("Dorman", customers.get(239).getLastName());
	}

	@Test
	@DisplayName("Record 240: Company is Sacramento Cable")
	void CompanyOfRecord240() {
		assertEquals("Sacramento Cable", customers.get(239).getCompany());
	}

	@Test
	@DisplayName("Record 240: Address is 822 E Washington St")
	void AddressOfRecord240() {
		assertEquals("822 E Washington St", customers.get(239).getAddress());
	}

	@Test
	@DisplayName("Record 240: City is West Chester")
	void CityOfRecord240() {
		assertEquals("West Chester", customers.get(239).getCity());
	}

	@Test
	@DisplayName("Record 240: County is Chester")
	void CountyOfRecord240() {
		assertEquals("Chester", customers.get(239).getCounty());
	}

	@Test
	@DisplayName("Record 240: State is PA")
	void StateOfRecord240() {
		assertEquals("PA", customers.get(239).getState());
	}

	@Test
	@DisplayName("Record 240: ZIP is 19380")
	void ZIPOfRecord240() {
		assertEquals("19380", customers.get(239).getZIP());
	}

	@Test
	@DisplayName("Record 240: Phone is 610-692-1390")
	void PhoneOfRecord240() {
		assertEquals("610-692-1390", customers.get(239).getPhone());
	}

	@Test
	@DisplayName("Record 240: Fax is 610-692-0336")
	void FaxOfRecord240() {
		assertEquals("610-692-0336", customers.get(239).getFax());
	}

	@Test
	@DisplayName("Record 240: Email is gilbert@dorman.com")
	void EmailOfRecord240() {
		assertEquals("gilbert@dorman.com", customers.get(239).getEmail());
	}

	@Test
	@DisplayName("Record 240: Web is http://www.gilbertdorman.com")
	void WebOfRecord240() {
		assertEquals("http://www.gilbertdorman.com", customers.get(239).getWeb());
	}
}
