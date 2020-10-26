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

@Tag("14")
class Record_4741 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4741: FirstName is Alecia")
	void FirstNameOfRecord4741() {
		assertEquals("Alecia", customers.get(4740).getFirstName());
	}

	@Test
	@DisplayName("Record 4741: LastName is Haws")
	void LastNameOfRecord4741() {
		assertEquals("Haws", customers.get(4740).getLastName());
	}

	@Test
	@DisplayName("Record 4741: Company is Gallup, Nancy L Esq")
	void CompanyOfRecord4741() {
		assertEquals("Gallup, Nancy L Esq", customers.get(4740).getCompany());
	}

	@Test
	@DisplayName("Record 4741: Address is 9398 Sw Tigard St")
	void AddressOfRecord4741() {
		assertEquals("9398 Sw Tigard St", customers.get(4740).getAddress());
	}

	@Test
	@DisplayName("Record 4741: City is Portland")
	void CityOfRecord4741() {
		assertEquals("Portland", customers.get(4740).getCity());
	}

	@Test
	@DisplayName("Record 4741: County is Washington")
	void CountyOfRecord4741() {
		assertEquals("Washington", customers.get(4740).getCounty());
	}

	@Test
	@DisplayName("Record 4741: State is OR")
	void StateOfRecord4741() {
		assertEquals("OR", customers.get(4740).getState());
	}

	@Test
	@DisplayName("Record 4741: ZIP is 97223")
	void ZIPOfRecord4741() {
		assertEquals("97223", customers.get(4740).getZIP());
	}

	@Test
	@DisplayName("Record 4741: Phone is 503-598-5344")
	void PhoneOfRecord4741() {
		assertEquals("503-598-5344", customers.get(4740).getPhone());
	}

	@Test
	@DisplayName("Record 4741: Fax is 503-598-7751")
	void FaxOfRecord4741() {
		assertEquals("503-598-7751", customers.get(4740).getFax());
	}

	@Test
	@DisplayName("Record 4741: Email is alecia@haws.com")
	void EmailOfRecord4741() {
		assertEquals("alecia@haws.com", customers.get(4740).getEmail());
	}

	@Test
	@DisplayName("Record 4741: Web is http://www.aleciahaws.com")
	void WebOfRecord4741() {
		assertEquals("http://www.aleciahaws.com", customers.get(4740).getWeb());
	}
}
