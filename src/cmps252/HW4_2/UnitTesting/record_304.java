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
class Record_304 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 304: FirstName is Magdalena")
	void FirstNameOfRecord304() {
		assertEquals("Magdalena", customers.get(303).getFirstName());
	}

	@Test
	@DisplayName("Record 304: LastName is Cantor")
	void LastNameOfRecord304() {
		assertEquals("Cantor", customers.get(303).getLastName());
	}

	@Test
	@DisplayName("Record 304: Company is Nii, Carl I Aia")
	void CompanyOfRecord304() {
		assertEquals("Nii, Carl I Aia", customers.get(303).getCompany());
	}

	@Test
	@DisplayName("Record 304: Address is 15556 Hidden Ln")
	void AddressOfRecord304() {
		assertEquals("15556 Hidden Ln", customers.get(303).getAddress());
	}

	@Test
	@DisplayName("Record 304: City is Livonia")
	void CityOfRecord304() {
		assertEquals("Livonia", customers.get(303).getCity());
	}

	@Test
	@DisplayName("Record 304: County is Wayne")
	void CountyOfRecord304() {
		assertEquals("Wayne", customers.get(303).getCounty());
	}

	@Test
	@DisplayName("Record 304: State is MI")
	void StateOfRecord304() {
		assertEquals("MI", customers.get(303).getState());
	}

	@Test
	@DisplayName("Record 304: ZIP is 48154")
	void ZIPOfRecord304() {
		assertEquals("48154", customers.get(303).getZIP());
	}

	@Test
	@DisplayName("Record 304: Phone is 734-522-0561")
	void PhoneOfRecord304() {
		assertEquals("734-522-0561", customers.get(303).getPhone());
	}

	@Test
	@DisplayName("Record 304: Fax is 734-522-8634")
	void FaxOfRecord304() {
		assertEquals("734-522-8634", customers.get(303).getFax());
	}

	@Test
	@DisplayName("Record 304: Email is magdalena@cantor.com")
	void EmailOfRecord304() {
		assertEquals("magdalena@cantor.com", customers.get(303).getEmail());
	}

	@Test
	@DisplayName("Record 304: Web is http://www.magdalenacantor.com")
	void WebOfRecord304() {
		assertEquals("http://www.magdalenacantor.com", customers.get(303).getWeb());
	}
}
