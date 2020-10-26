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

@Tag("39")
class Record_315 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 315: FirstName is Twila")
	void FirstNameOfRecord315() {
		assertEquals("Twila", customers.get(314).getFirstName());
	}

	@Test
	@DisplayName("Record 315: LastName is Carfrey")
	void LastNameOfRecord315() {
		assertEquals("Carfrey", customers.get(314).getLastName());
	}

	@Test
	@DisplayName("Record 315: Company is Safe Way Tank Service")
	void CompanyOfRecord315() {
		assertEquals("Safe Way Tank Service", customers.get(314).getCompany());
	}

	@Test
	@DisplayName("Record 315: Address is 964 Borra Pl")
	void AddressOfRecord315() {
		assertEquals("964 Borra Pl", customers.get(314).getAddress());
	}

	@Test
	@DisplayName("Record 315: City is Escondido")
	void CityOfRecord315() {
		assertEquals("Escondido", customers.get(314).getCity());
	}

	@Test
	@DisplayName("Record 315: County is San Diego")
	void CountyOfRecord315() {
		assertEquals("San Diego", customers.get(314).getCounty());
	}

	@Test
	@DisplayName("Record 315: State is CA")
	void StateOfRecord315() {
		assertEquals("CA", customers.get(314).getState());
	}

	@Test
	@DisplayName("Record 315: ZIP is 92029")
	void ZIPOfRecord315() {
		assertEquals("92029", customers.get(314).getZIP());
	}

	@Test
	@DisplayName("Record 315: Phone is 760-743-2807")
	void PhoneOfRecord315() {
		assertEquals("760-743-2807", customers.get(314).getPhone());
	}

	@Test
	@DisplayName("Record 315: Fax is 760-743-2231")
	void FaxOfRecord315() {
		assertEquals("760-743-2231", customers.get(314).getFax());
	}

	@Test
	@DisplayName("Record 315: Email is twila@carfrey.com")
	void EmailOfRecord315() {
		assertEquals("twila@carfrey.com", customers.get(314).getEmail());
	}

	@Test
	@DisplayName("Record 315: Web is http://www.twilacarfrey.com")
	void WebOfRecord315() {
		assertEquals("http://www.twilacarfrey.com", customers.get(314).getWeb());
	}
}
