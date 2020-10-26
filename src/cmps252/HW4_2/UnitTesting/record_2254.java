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

@Tag("29")
class Record_2254 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2254: FirstName is Berta")
	void FirstNameOfRecord2254() {
		assertEquals("Berta", customers.get(2253).getFirstName());
	}

	@Test
	@DisplayName("Record 2254: LastName is Irelan")
	void LastNameOfRecord2254() {
		assertEquals("Irelan", customers.get(2253).getLastName());
	}

	@Test
	@DisplayName("Record 2254: Company is Bernstone And Bernstone Pc")
	void CompanyOfRecord2254() {
		assertEquals("Bernstone And Bernstone Pc", customers.get(2253).getCompany());
	}

	@Test
	@DisplayName("Record 2254: Address is 4029 E University Dr")
	void AddressOfRecord2254() {
		assertEquals("4029 E University Dr", customers.get(2253).getAddress());
	}

	@Test
	@DisplayName("Record 2254: City is Phoenix")
	void CityOfRecord2254() {
		assertEquals("Phoenix", customers.get(2253).getCity());
	}

	@Test
	@DisplayName("Record 2254: County is Maricopa")
	void CountyOfRecord2254() {
		assertEquals("Maricopa", customers.get(2253).getCounty());
	}

	@Test
	@DisplayName("Record 2254: State is AZ")
	void StateOfRecord2254() {
		assertEquals("AZ", customers.get(2253).getState());
	}

	@Test
	@DisplayName("Record 2254: ZIP is 85034")
	void ZIPOfRecord2254() {
		assertEquals("85034", customers.get(2253).getZIP());
	}

	@Test
	@DisplayName("Record 2254: Phone is 602-437-6146")
	void PhoneOfRecord2254() {
		assertEquals("602-437-6146", customers.get(2253).getPhone());
	}

	@Test
	@DisplayName("Record 2254: Fax is 602-437-2905")
	void FaxOfRecord2254() {
		assertEquals("602-437-2905", customers.get(2253).getFax());
	}

	@Test
	@DisplayName("Record 2254: Email is berta@irelan.com")
	void EmailOfRecord2254() {
		assertEquals("berta@irelan.com", customers.get(2253).getEmail());
	}

	@Test
	@DisplayName("Record 2254: Web is http://www.bertairelan.com")
	void WebOfRecord2254() {
		assertEquals("http://www.bertairelan.com", customers.get(2253).getWeb());
	}
}
