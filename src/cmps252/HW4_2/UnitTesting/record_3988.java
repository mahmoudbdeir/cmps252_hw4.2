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

@Tag("43")
class Record_3988 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3988: FirstName is Tod")
	void FirstNameOfRecord3988() {
		assertEquals("Tod", customers.get(3987).getFirstName());
	}

	@Test
	@DisplayName("Record 3988: LastName is Cobey")
	void LastNameOfRecord3988() {
		assertEquals("Cobey", customers.get(3987).getLastName());
	}

	@Test
	@DisplayName("Record 3988: Company is James Peters & Son Inc")
	void CompanyOfRecord3988() {
		assertEquals("James Peters & Son Inc", customers.get(3987).getCompany());
	}

	@Test
	@DisplayName("Record 3988: Address is 301 S 11th St")
	void AddressOfRecord3988() {
		assertEquals("301 S 11th St", customers.get(3987).getAddress());
	}

	@Test
	@DisplayName("Record 3988: City is Fort Smith")
	void CityOfRecord3988() {
		assertEquals("Fort Smith", customers.get(3987).getCity());
	}

	@Test
	@DisplayName("Record 3988: County is Sebastian")
	void CountyOfRecord3988() {
		assertEquals("Sebastian", customers.get(3987).getCounty());
	}

	@Test
	@DisplayName("Record 3988: State is AR")
	void StateOfRecord3988() {
		assertEquals("AR", customers.get(3987).getState());
	}

	@Test
	@DisplayName("Record 3988: ZIP is 72901")
	void ZIPOfRecord3988() {
		assertEquals("72901", customers.get(3987).getZIP());
	}

	@Test
	@DisplayName("Record 3988: Phone is 479-785-0685")
	void PhoneOfRecord3988() {
		assertEquals("479-785-0685", customers.get(3987).getPhone());
	}

	@Test
	@DisplayName("Record 3988: Fax is 479-785-2789")
	void FaxOfRecord3988() {
		assertEquals("479-785-2789", customers.get(3987).getFax());
	}

	@Test
	@DisplayName("Record 3988: Email is tod@cobey.com")
	void EmailOfRecord3988() {
		assertEquals("tod@cobey.com", customers.get(3987).getEmail());
	}

	@Test
	@DisplayName("Record 3988: Web is http://www.todcobey.com")
	void WebOfRecord3988() {
		assertEquals("http://www.todcobey.com", customers.get(3987).getWeb());
	}
}
