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

@Tag("9")
class Record_517 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 517: FirstName is Bud")
	void FirstNameOfRecord517() {
		assertEquals("Bud", customers.get(516).getFirstName());
	}

	@Test
	@DisplayName("Record 517: LastName is Acken")
	void LastNameOfRecord517() {
		assertEquals("Acken", customers.get(516).getLastName());
	}

	@Test
	@DisplayName("Record 517: Company is Luby, Kevin W Esq")
	void CompanyOfRecord517() {
		assertEquals("Luby, Kevin W Esq", customers.get(516).getCompany());
	}

	@Test
	@DisplayName("Record 517: Address is 120 S Piedras St")
	void AddressOfRecord517() {
		assertEquals("120 S Piedras St", customers.get(516).getAddress());
	}

	@Test
	@DisplayName("Record 517: City is El Paso")
	void CityOfRecord517() {
		assertEquals("El Paso", customers.get(516).getCity());
	}

	@Test
	@DisplayName("Record 517: County is El Paso")
	void CountyOfRecord517() {
		assertEquals("El Paso", customers.get(516).getCounty());
	}

	@Test
	@DisplayName("Record 517: State is TX")
	void StateOfRecord517() {
		assertEquals("TX", customers.get(516).getState());
	}

	@Test
	@DisplayName("Record 517: ZIP is 79905")
	void ZIPOfRecord517() {
		assertEquals("79905", customers.get(516).getZIP());
	}

	@Test
	@DisplayName("Record 517: Phone is 915-532-3560")
	void PhoneOfRecord517() {
		assertEquals("915-532-3560", customers.get(516).getPhone());
	}

	@Test
	@DisplayName("Record 517: Fax is 915-532-7254")
	void FaxOfRecord517() {
		assertEquals("915-532-7254", customers.get(516).getFax());
	}

	@Test
	@DisplayName("Record 517: Email is bud@acken.com")
	void EmailOfRecord517() {
		assertEquals("bud@acken.com", customers.get(516).getEmail());
	}

	@Test
	@DisplayName("Record 517: Web is http://www.budacken.com")
	void WebOfRecord517() {
		assertEquals("http://www.budacken.com", customers.get(516).getWeb());
	}
}
