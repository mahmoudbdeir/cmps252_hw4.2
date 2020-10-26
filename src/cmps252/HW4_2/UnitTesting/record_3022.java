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

@Tag("36")
class Record_3022 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3022: FirstName is Sandra")
	void FirstNameOfRecord3022() {
		assertEquals("Sandra", customers.get(3021).getFirstName());
	}

	@Test
	@DisplayName("Record 3022: LastName is Sylvestre")
	void LastNameOfRecord3022() {
		assertEquals("Sylvestre", customers.get(3021).getLastName());
	}

	@Test
	@DisplayName("Record 3022: Company is Post Mate Usa")
	void CompanyOfRecord3022() {
		assertEquals("Post Mate Usa", customers.get(3021).getCompany());
	}

	@Test
	@DisplayName("Record 3022: Address is 705 E Oak St")
	void AddressOfRecord3022() {
		assertEquals("705 E Oak St", customers.get(3021).getAddress());
	}

	@Test
	@DisplayName("Record 3022: City is Kissimmee")
	void CityOfRecord3022() {
		assertEquals("Kissimmee", customers.get(3021).getCity());
	}

	@Test
	@DisplayName("Record 3022: County is Osceola")
	void CountyOfRecord3022() {
		assertEquals("Osceola", customers.get(3021).getCounty());
	}

	@Test
	@DisplayName("Record 3022: State is FL")
	void StateOfRecord3022() {
		assertEquals("FL", customers.get(3021).getState());
	}

	@Test
	@DisplayName("Record 3022: ZIP is 34744")
	void ZIPOfRecord3022() {
		assertEquals("34744", customers.get(3021).getZIP());
	}

	@Test
	@DisplayName("Record 3022: Phone is 407-870-6755")
	void PhoneOfRecord3022() {
		assertEquals("407-870-6755", customers.get(3021).getPhone());
	}

	@Test
	@DisplayName("Record 3022: Fax is 407-870-7449")
	void FaxOfRecord3022() {
		assertEquals("407-870-7449", customers.get(3021).getFax());
	}

	@Test
	@DisplayName("Record 3022: Email is sandra@sylvestre.com")
	void EmailOfRecord3022() {
		assertEquals("sandra@sylvestre.com", customers.get(3021).getEmail());
	}

	@Test
	@DisplayName("Record 3022: Web is http://www.sandrasylvestre.com")
	void WebOfRecord3022() {
		assertEquals("http://www.sandrasylvestre.com", customers.get(3021).getWeb());
	}
}
