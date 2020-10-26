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

@Tag("19")
class Record_3735 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3735: FirstName is Michele")
	void FirstNameOfRecord3735() {
		assertEquals("Michele", customers.get(3734).getFirstName());
	}

	@Test
	@DisplayName("Record 3735: LastName is Crissey")
	void LastNameOfRecord3735() {
		assertEquals("Crissey", customers.get(3734).getLastName());
	}

	@Test
	@DisplayName("Record 3735: Company is J V Averitt Lumber Co Inc")
	void CompanyOfRecord3735() {
		assertEquals("J V Averitt Lumber Co Inc", customers.get(3734).getCompany());
	}

	@Test
	@DisplayName("Record 3735: Address is 7751 Alabama Ave  #-11")
	void AddressOfRecord3735() {
		assertEquals("7751 Alabama Ave  #-11", customers.get(3734).getAddress());
	}

	@Test
	@DisplayName("Record 3735: City is Canoga Park")
	void CityOfRecord3735() {
		assertEquals("Canoga Park", customers.get(3734).getCity());
	}

	@Test
	@DisplayName("Record 3735: County is Los Angeles")
	void CountyOfRecord3735() {
		assertEquals("Los Angeles", customers.get(3734).getCounty());
	}

	@Test
	@DisplayName("Record 3735: State is CA")
	void StateOfRecord3735() {
		assertEquals("CA", customers.get(3734).getState());
	}

	@Test
	@DisplayName("Record 3735: ZIP is 91304")
	void ZIPOfRecord3735() {
		assertEquals("91304", customers.get(3734).getZIP());
	}

	@Test
	@DisplayName("Record 3735: Phone is 818-710-5391")
	void PhoneOfRecord3735() {
		assertEquals("818-710-5391", customers.get(3734).getPhone());
	}

	@Test
	@DisplayName("Record 3735: Fax is 818-710-4469")
	void FaxOfRecord3735() {
		assertEquals("818-710-4469", customers.get(3734).getFax());
	}

	@Test
	@DisplayName("Record 3735: Email is michele@crissey.com")
	void EmailOfRecord3735() {
		assertEquals("michele@crissey.com", customers.get(3734).getEmail());
	}

	@Test
	@DisplayName("Record 3735: Web is http://www.michelecrissey.com")
	void WebOfRecord3735() {
		assertEquals("http://www.michelecrissey.com", customers.get(3734).getWeb());
	}
}
