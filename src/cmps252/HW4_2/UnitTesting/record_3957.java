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

@Tag("38")
class Record_3957 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3957: FirstName is Jesus")
	void FirstNameOfRecord3957() {
		assertEquals("Jesus", customers.get(3956).getFirstName());
	}

	@Test
	@DisplayName("Record 3957: LastName is Maung")
	void LastNameOfRecord3957() {
		assertEquals("Maung", customers.get(3956).getLastName());
	}

	@Test
	@DisplayName("Record 3957: Company is Martech Usa Inc")
	void CompanyOfRecord3957() {
		assertEquals("Martech Usa Inc", customers.get(3956).getCompany());
	}

	@Test
	@DisplayName("Record 3957: Address is 715 S Barstow St")
	void AddressOfRecord3957() {
		assertEquals("715 S Barstow St", customers.get(3956).getAddress());
	}

	@Test
	@DisplayName("Record 3957: City is Eau Claire")
	void CityOfRecord3957() {
		assertEquals("Eau Claire", customers.get(3956).getCity());
	}

	@Test
	@DisplayName("Record 3957: County is Eau Claire")
	void CountyOfRecord3957() {
		assertEquals("Eau Claire", customers.get(3956).getCounty());
	}

	@Test
	@DisplayName("Record 3957: State is WI")
	void StateOfRecord3957() {
		assertEquals("WI", customers.get(3956).getState());
	}

	@Test
	@DisplayName("Record 3957: ZIP is 54701")
	void ZIPOfRecord3957() {
		assertEquals("54701", customers.get(3956).getZIP());
	}

	@Test
	@DisplayName("Record 3957: Phone is 715-839-9003")
	void PhoneOfRecord3957() {
		assertEquals("715-839-9003", customers.get(3956).getPhone());
	}

	@Test
	@DisplayName("Record 3957: Fax is 715-839-4778")
	void FaxOfRecord3957() {
		assertEquals("715-839-4778", customers.get(3956).getFax());
	}

	@Test
	@DisplayName("Record 3957: Email is jesus@maung.com")
	void EmailOfRecord3957() {
		assertEquals("jesus@maung.com", customers.get(3956).getEmail());
	}

	@Test
	@DisplayName("Record 3957: Web is http://www.jesusmaung.com")
	void WebOfRecord3957() {
		assertEquals("http://www.jesusmaung.com", customers.get(3956).getWeb());
	}
}
