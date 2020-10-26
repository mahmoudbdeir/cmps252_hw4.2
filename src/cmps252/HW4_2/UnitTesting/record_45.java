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

@Tag("28")
class Record_45 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 45: FirstName is Les")
	void FirstNameOfRecord45() {
		assertEquals("Les", customers.get(44).getFirstName());
	}

	@Test
	@DisplayName("Record 45: LastName is Cortina")
	void LastNameOfRecord45() {
		assertEquals("Cortina", customers.get(44).getLastName());
	}

	@Test
	@DisplayName("Record 45: Company is Spokane Community College")
	void CompanyOfRecord45() {
		assertEquals("Spokane Community College", customers.get(44).getCompany());
	}

	@Test
	@DisplayName("Record 45: Address is 435 Raritan Center Pky")
	void AddressOfRecord45() {
		assertEquals("435 Raritan Center Pky", customers.get(44).getAddress());
	}

	@Test
	@DisplayName("Record 45: City is Edison")
	void CityOfRecord45() {
		assertEquals("Edison", customers.get(44).getCity());
	}

	@Test
	@DisplayName("Record 45: County is Middlesex")
	void CountyOfRecord45() {
		assertEquals("Middlesex", customers.get(44).getCounty());
	}

	@Test
	@DisplayName("Record 45: State is NJ")
	void StateOfRecord45() {
		assertEquals("NJ", customers.get(44).getState());
	}

	@Test
	@DisplayName("Record 45: ZIP is 8837")
	void ZIPOfRecord45() {
		assertEquals("8837", customers.get(44).getZIP());
	}

	@Test
	@DisplayName("Record 45: Phone is 732-225-5032")
	void PhoneOfRecord45() {
		assertEquals("732-225-5032", customers.get(44).getPhone());
	}

	@Test
	@DisplayName("Record 45: Fax is 732-225-6089")
	void FaxOfRecord45() {
		assertEquals("732-225-6089", customers.get(44).getFax());
	}

	@Test
	@DisplayName("Record 45: Email is les@cortina.com")
	void EmailOfRecord45() {
		assertEquals("les@cortina.com", customers.get(44).getEmail());
	}

	@Test
	@DisplayName("Record 45: Web is http://www.lescortina.com")
	void WebOfRecord45() {
		assertEquals("http://www.lescortina.com", customers.get(44).getWeb());
	}
}
