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

@Tag("12")
class Record_458 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 458: FirstName is Lilian")
	void FirstNameOfRecord458() {
		assertEquals("Lilian", customers.get(457).getFirstName());
	}

	@Test
	@DisplayName("Record 458: LastName is Bruchey")
	void LastNameOfRecord458() {
		assertEquals("Bruchey", customers.get(457).getLastName());
	}

	@Test
	@DisplayName("Record 458: Company is Wenner, Scott J Esq")
	void CompanyOfRecord458() {
		assertEquals("Wenner, Scott J Esq", customers.get(457).getCompany());
	}

	@Test
	@DisplayName("Record 458: Address is 520 E Jackson St")
	void AddressOfRecord458() {
		assertEquals("520 E Jackson St", customers.get(457).getAddress());
	}

	@Test
	@DisplayName("Record 458: City is Willard")
	void CityOfRecord458() {
		assertEquals("Willard", customers.get(457).getCity());
	}

	@Test
	@DisplayName("Record 458: County is Greene")
	void CountyOfRecord458() {
		assertEquals("Greene", customers.get(457).getCounty());
	}

	@Test
	@DisplayName("Record 458: State is MO")
	void StateOfRecord458() {
		assertEquals("MO", customers.get(457).getState());
	}

	@Test
	@DisplayName("Record 458: ZIP is 65781")
	void ZIPOfRecord458() {
		assertEquals("65781", customers.get(457).getZIP());
	}

	@Test
	@DisplayName("Record 458: Phone is 417-742-8921")
	void PhoneOfRecord458() {
		assertEquals("417-742-8921", customers.get(457).getPhone());
	}

	@Test
	@DisplayName("Record 458: Fax is 417-742-5012")
	void FaxOfRecord458() {
		assertEquals("417-742-5012", customers.get(457).getFax());
	}

	@Test
	@DisplayName("Record 458: Email is lilian@bruchey.com")
	void EmailOfRecord458() {
		assertEquals("lilian@bruchey.com", customers.get(457).getEmail());
	}

	@Test
	@DisplayName("Record 458: Web is http://www.lilianbruchey.com")
	void WebOfRecord458() {
		assertEquals("http://www.lilianbruchey.com", customers.get(457).getWeb());
	}
}
