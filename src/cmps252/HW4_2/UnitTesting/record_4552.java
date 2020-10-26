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

@Tag("43")
class Record_4552 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4552: FirstName is Adrienne")
	void FirstNameOfRecord4552() {
		assertEquals("Adrienne", customers.get(4551).getFirstName());
	}

	@Test
	@DisplayName("Record 4552: LastName is Beyea")
	void LastNameOfRecord4552() {
		assertEquals("Beyea", customers.get(4551).getLastName());
	}

	@Test
	@DisplayName("Record 4552: Company is Hameg Instruments Inc")
	void CompanyOfRecord4552() {
		assertEquals("Hameg Instruments Inc", customers.get(4551).getCompany());
	}

	@Test
	@DisplayName("Record 4552: Address is 20 Via Contenta")
	void AddressOfRecord4552() {
		assertEquals("20 Via Contenta", customers.get(4551).getAddress());
	}

	@Test
	@DisplayName("Record 4552: City is Carmel Valley")
	void CityOfRecord4552() {
		assertEquals("Carmel Valley", customers.get(4551).getCity());
	}

	@Test
	@DisplayName("Record 4552: County is Monterey")
	void CountyOfRecord4552() {
		assertEquals("Monterey", customers.get(4551).getCounty());
	}

	@Test
	@DisplayName("Record 4552: State is CA")
	void StateOfRecord4552() {
		assertEquals("CA", customers.get(4551).getState());
	}

	@Test
	@DisplayName("Record 4552: ZIP is 93924")
	void ZIPOfRecord4552() {
		assertEquals("93924", customers.get(4551).getZIP());
	}

	@Test
	@DisplayName("Record 4552: Phone is 831-659-9100")
	void PhoneOfRecord4552() {
		assertEquals("831-659-9100", customers.get(4551).getPhone());
	}

	@Test
	@DisplayName("Record 4552: Fax is 831-659-4187")
	void FaxOfRecord4552() {
		assertEquals("831-659-4187", customers.get(4551).getFax());
	}

	@Test
	@DisplayName("Record 4552: Email is adrienne@beyea.com")
	void EmailOfRecord4552() {
		assertEquals("adrienne@beyea.com", customers.get(4551).getEmail());
	}

	@Test
	@DisplayName("Record 4552: Web is http://www.adriennebeyea.com")
	void WebOfRecord4552() {
		assertEquals("http://www.adriennebeyea.com", customers.get(4551).getWeb());
	}
}
