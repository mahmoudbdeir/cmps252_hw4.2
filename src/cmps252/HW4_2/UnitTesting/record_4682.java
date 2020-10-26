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

@Tag("42")
class Record_4682 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4682: FirstName is Ted")
	void FirstNameOfRecord4682() {
		assertEquals("Ted", customers.get(4681).getFirstName());
	}

	@Test
	@DisplayName("Record 4682: LastName is Bertagna")
	void LastNameOfRecord4682() {
		assertEquals("Bertagna", customers.get(4681).getLastName());
	}

	@Test
	@DisplayName("Record 4682: Company is Laufman, Harold Md")
	void CompanyOfRecord4682() {
		assertEquals("Laufman, Harold Md", customers.get(4681).getCompany());
	}

	@Test
	@DisplayName("Record 4682: Address is 115 Cross Keys Rd")
	void AddressOfRecord4682() {
		assertEquals("115 Cross Keys Rd", customers.get(4681).getAddress());
	}

	@Test
	@DisplayName("Record 4682: City is Berlin")
	void CityOfRecord4682() {
		assertEquals("Berlin", customers.get(4681).getCity());
	}

	@Test
	@DisplayName("Record 4682: County is Camden")
	void CountyOfRecord4682() {
		assertEquals("Camden", customers.get(4681).getCounty());
	}

	@Test
	@DisplayName("Record 4682: State is NJ")
	void StateOfRecord4682() {
		assertEquals("NJ", customers.get(4681).getState());
	}

	@Test
	@DisplayName("Record 4682: ZIP is 8009")
	void ZIPOfRecord4682() {
		assertEquals("8009", customers.get(4681).getZIP());
	}

	@Test
	@DisplayName("Record 4682: Phone is 856-768-8758")
	void PhoneOfRecord4682() {
		assertEquals("856-768-8758", customers.get(4681).getPhone());
	}

	@Test
	@DisplayName("Record 4682: Fax is 856-768-7085")
	void FaxOfRecord4682() {
		assertEquals("856-768-7085", customers.get(4681).getFax());
	}

	@Test
	@DisplayName("Record 4682: Email is ted@bertagna.com")
	void EmailOfRecord4682() {
		assertEquals("ted@bertagna.com", customers.get(4681).getEmail());
	}

	@Test
	@DisplayName("Record 4682: Web is http://www.tedbertagna.com")
	void WebOfRecord4682() {
		assertEquals("http://www.tedbertagna.com", customers.get(4681).getWeb());
	}
}
