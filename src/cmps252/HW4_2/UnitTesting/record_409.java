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

@Tag("25")
class Record_409 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 409: FirstName is Ethan")
	void FirstNameOfRecord409() {
		assertEquals("Ethan", customers.get(408).getFirstName());
	}

	@Test
	@DisplayName("Record 409: LastName is Levay")
	void LastNameOfRecord409() {
		assertEquals("Levay", customers.get(408).getLastName());
	}

	@Test
	@DisplayName("Record 409: Company is Art Faces")
	void CompanyOfRecord409() {
		assertEquals("Art Faces", customers.get(408).getCompany());
	}

	@Test
	@DisplayName("Record 409: Address is 11845 Brookfield St")
	void AddressOfRecord409() {
		assertEquals("11845 Brookfield St", customers.get(408).getAddress());
	}

	@Test
	@DisplayName("Record 409: City is Livonia")
	void CityOfRecord409() {
		assertEquals("Livonia", customers.get(408).getCity());
	}

	@Test
	@DisplayName("Record 409: County is Wayne")
	void CountyOfRecord409() {
		assertEquals("Wayne", customers.get(408).getCounty());
	}

	@Test
	@DisplayName("Record 409: State is MI")
	void StateOfRecord409() {
		assertEquals("MI", customers.get(408).getState());
	}

	@Test
	@DisplayName("Record 409: ZIP is 48150")
	void ZIPOfRecord409() {
		assertEquals("48150", customers.get(408).getZIP());
	}

	@Test
	@DisplayName("Record 409: Phone is 734-525-5016")
	void PhoneOfRecord409() {
		assertEquals("734-525-5016", customers.get(408).getPhone());
	}

	@Test
	@DisplayName("Record 409: Fax is 734-525-5996")
	void FaxOfRecord409() {
		assertEquals("734-525-5996", customers.get(408).getFax());
	}

	@Test
	@DisplayName("Record 409: Email is ethan@levay.com")
	void EmailOfRecord409() {
		assertEquals("ethan@levay.com", customers.get(408).getEmail());
	}

	@Test
	@DisplayName("Record 409: Web is http://www.ethanlevay.com")
	void WebOfRecord409() {
		assertEquals("http://www.ethanlevay.com", customers.get(408).getWeb());
	}
}
