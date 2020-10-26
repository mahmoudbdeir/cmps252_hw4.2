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

@Tag("46")
class Record_3087 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3087: FirstName is Loraine")
	void FirstNameOfRecord3087() {
		assertEquals("Loraine", customers.get(3086).getFirstName());
	}

	@Test
	@DisplayName("Record 3087: LastName is Bockelman")
	void LastNameOfRecord3087() {
		assertEquals("Bockelman", customers.get(3086).getLastName());
	}

	@Test
	@DisplayName("Record 3087: Company is Wells Kitchen Center")
	void CompanyOfRecord3087() {
		assertEquals("Wells Kitchen Center", customers.get(3086).getCompany());
	}

	@Test
	@DisplayName("Record 3087: Address is Valleywide")
	void AddressOfRecord3087() {
		assertEquals("Valleywide", customers.get(3086).getAddress());
	}

	@Test
	@DisplayName("Record 3087: City is Phoenix")
	void CityOfRecord3087() {
		assertEquals("Phoenix", customers.get(3086).getCity());
	}

	@Test
	@DisplayName("Record 3087: County is Maricopa")
	void CountyOfRecord3087() {
		assertEquals("Maricopa", customers.get(3086).getCounty());
	}

	@Test
	@DisplayName("Record 3087: State is AZ")
	void StateOfRecord3087() {
		assertEquals("AZ", customers.get(3086).getState());
	}

	@Test
	@DisplayName("Record 3087: ZIP is 85013")
	void ZIPOfRecord3087() {
		assertEquals("85013", customers.get(3086).getZIP());
	}

	@Test
	@DisplayName("Record 3087: Phone is 602-222-3638")
	void PhoneOfRecord3087() {
		assertEquals("602-222-3638", customers.get(3086).getPhone());
	}

	@Test
	@DisplayName("Record 3087: Fax is 602-222-7497")
	void FaxOfRecord3087() {
		assertEquals("602-222-7497", customers.get(3086).getFax());
	}

	@Test
	@DisplayName("Record 3087: Email is loraine@bockelman.com")
	void EmailOfRecord3087() {
		assertEquals("loraine@bockelman.com", customers.get(3086).getEmail());
	}

	@Test
	@DisplayName("Record 3087: Web is http://www.lorainebockelman.com")
	void WebOfRecord3087() {
		assertEquals("http://www.lorainebockelman.com", customers.get(3086).getWeb());
	}
}
