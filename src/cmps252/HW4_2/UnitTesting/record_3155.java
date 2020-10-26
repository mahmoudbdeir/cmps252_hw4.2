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

@Tag("20")
class Record_3155 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3155: FirstName is Wilber")
	void FirstNameOfRecord3155() {
		assertEquals("Wilber", customers.get(3154).getFirstName());
	}

	@Test
	@DisplayName("Record 3155: LastName is Schlobohm")
	void LastNameOfRecord3155() {
		assertEquals("Schlobohm", customers.get(3154).getLastName());
	}

	@Test
	@DisplayName("Record 3155: Company is Flyschaker, Marc L Esq")
	void CompanyOfRecord3155() {
		assertEquals("Flyschaker, Marc L Esq", customers.get(3154).getCompany());
	}

	@Test
	@DisplayName("Record 3155: Address is 2 John St")
	void AddressOfRecord3155() {
		assertEquals("2 John St", customers.get(3154).getAddress());
	}

	@Test
	@DisplayName("Record 3155: City is New York")
	void CityOfRecord3155() {
		assertEquals("New York", customers.get(3154).getCity());
	}

	@Test
	@DisplayName("Record 3155: County is New York")
	void CountyOfRecord3155() {
		assertEquals("New York", customers.get(3154).getCounty());
	}

	@Test
	@DisplayName("Record 3155: State is NY")
	void StateOfRecord3155() {
		assertEquals("NY", customers.get(3154).getState());
	}

	@Test
	@DisplayName("Record 3155: ZIP is 10038")
	void ZIPOfRecord3155() {
		assertEquals("10038", customers.get(3154).getZIP());
	}

	@Test
	@DisplayName("Record 3155: Phone is 212-619-1821")
	void PhoneOfRecord3155() {
		assertEquals("212-619-1821", customers.get(3154).getPhone());
	}

	@Test
	@DisplayName("Record 3155: Fax is 212-619-8842")
	void FaxOfRecord3155() {
		assertEquals("212-619-8842", customers.get(3154).getFax());
	}

	@Test
	@DisplayName("Record 3155: Email is wilber@schlobohm.com")
	void EmailOfRecord3155() {
		assertEquals("wilber@schlobohm.com", customers.get(3154).getEmail());
	}

	@Test
	@DisplayName("Record 3155: Web is http://www.wilberschlobohm.com")
	void WebOfRecord3155() {
		assertEquals("http://www.wilberschlobohm.com", customers.get(3154).getWeb());
	}
}
