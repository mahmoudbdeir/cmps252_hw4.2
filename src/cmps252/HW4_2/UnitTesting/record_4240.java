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

@Tag("19")
class Record_4240 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4240: FirstName is Bridgette")
	void FirstNameOfRecord4240() {
		assertEquals("Bridgette", customers.get(4239).getFirstName());
	}

	@Test
	@DisplayName("Record 4240: LastName is Fiorica")
	void LastNameOfRecord4240() {
		assertEquals("Fiorica", customers.get(4239).getLastName());
	}

	@Test
	@DisplayName("Record 4240: Company is Hastings, Edwin H Esq")
	void CompanyOfRecord4240() {
		assertEquals("Hastings, Edwin H Esq", customers.get(4239).getCompany());
	}

	@Test
	@DisplayName("Record 4240: Address is 10365 Highway 116")
	void AddressOfRecord4240() {
		assertEquals("10365 Highway 116", customers.get(4239).getAddress());
	}

	@Test
	@DisplayName("Record 4240: City is Guerneville")
	void CityOfRecord4240() {
		assertEquals("Guerneville", customers.get(4239).getCity());
	}

	@Test
	@DisplayName("Record 4240: County is Sonoma")
	void CountyOfRecord4240() {
		assertEquals("Sonoma", customers.get(4239).getCounty());
	}

	@Test
	@DisplayName("Record 4240: State is CA")
	void StateOfRecord4240() {
		assertEquals("CA", customers.get(4239).getState());
	}

	@Test
	@DisplayName("Record 4240: ZIP is 95446")
	void ZIPOfRecord4240() {
		assertEquals("95446", customers.get(4239).getZIP());
	}

	@Test
	@DisplayName("Record 4240: Phone is 707-869-3945")
	void PhoneOfRecord4240() {
		assertEquals("707-869-3945", customers.get(4239).getPhone());
	}

	@Test
	@DisplayName("Record 4240: Fax is 707-869-3976")
	void FaxOfRecord4240() {
		assertEquals("707-869-3976", customers.get(4239).getFax());
	}

	@Test
	@DisplayName("Record 4240: Email is bridgette@fiorica.com")
	void EmailOfRecord4240() {
		assertEquals("bridgette@fiorica.com", customers.get(4239).getEmail());
	}

	@Test
	@DisplayName("Record 4240: Web is http://www.bridgettefiorica.com")
	void WebOfRecord4240() {
		assertEquals("http://www.bridgettefiorica.com", customers.get(4239).getWeb());
	}
}
