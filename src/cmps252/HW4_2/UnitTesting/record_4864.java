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

@Tag("2")
class Record_4864 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4864: FirstName is Ofelia")
	void FirstNameOfRecord4864() {
		assertEquals("Ofelia", customers.get(4863).getFirstName());
	}

	@Test
	@DisplayName("Record 4864: LastName is Tataris")
	void LastNameOfRecord4864() {
		assertEquals("Tataris", customers.get(4863).getLastName());
	}

	@Test
	@DisplayName("Record 4864: Company is Hukill Chemical Corp")
	void CompanyOfRecord4864() {
		assertEquals("Hukill Chemical Corp", customers.get(4863).getCompany());
	}

	@Test
	@DisplayName("Record 4864: Address is 355 W Grand Ave")
	void AddressOfRecord4864() {
		assertEquals("355 W Grand Ave", customers.get(4863).getAddress());
	}

	@Test
	@DisplayName("Record 4864: City is Escondido")
	void CityOfRecord4864() {
		assertEquals("Escondido", customers.get(4863).getCity());
	}

	@Test
	@DisplayName("Record 4864: County is San Diego")
	void CountyOfRecord4864() {
		assertEquals("San Diego", customers.get(4863).getCounty());
	}

	@Test
	@DisplayName("Record 4864: State is CA")
	void StateOfRecord4864() {
		assertEquals("CA", customers.get(4863).getState());
	}

	@Test
	@DisplayName("Record 4864: ZIP is 92025")
	void ZIPOfRecord4864() {
		assertEquals("92025", customers.get(4863).getZIP());
	}

	@Test
	@DisplayName("Record 4864: Phone is 760-747-5414")
	void PhoneOfRecord4864() {
		assertEquals("760-747-5414", customers.get(4863).getPhone());
	}

	@Test
	@DisplayName("Record 4864: Fax is 760-747-7366")
	void FaxOfRecord4864() {
		assertEquals("760-747-7366", customers.get(4863).getFax());
	}

	@Test
	@DisplayName("Record 4864: Email is ofelia@tataris.com")
	void EmailOfRecord4864() {
		assertEquals("ofelia@tataris.com", customers.get(4863).getEmail());
	}

	@Test
	@DisplayName("Record 4864: Web is http://www.ofeliatataris.com")
	void WebOfRecord4864() {
		assertEquals("http://www.ofeliatataris.com", customers.get(4863).getWeb());
	}
}
