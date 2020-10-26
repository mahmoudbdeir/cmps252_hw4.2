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

@Tag("37")
class Record_3393 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3393: FirstName is Werner")
	void FirstNameOfRecord3393() {
		assertEquals("Werner", customers.get(3392).getFirstName());
	}

	@Test
	@DisplayName("Record 3393: LastName is Poinelli")
	void LastNameOfRecord3393() {
		assertEquals("Poinelli", customers.get(3392).getLastName());
	}

	@Test
	@DisplayName("Record 3393: Company is Decagon Devices Inc")
	void CompanyOfRecord3393() {
		assertEquals("Decagon Devices Inc", customers.get(3392).getCompany());
	}

	@Test
	@DisplayName("Record 3393: Address is 2075 Pioneer Ct")
	void AddressOfRecord3393() {
		assertEquals("2075 Pioneer Ct", customers.get(3392).getAddress());
	}

	@Test
	@DisplayName("Record 3393: City is San Mateo")
	void CityOfRecord3393() {
		assertEquals("San Mateo", customers.get(3392).getCity());
	}

	@Test
	@DisplayName("Record 3393: County is San Mateo")
	void CountyOfRecord3393() {
		assertEquals("San Mateo", customers.get(3392).getCounty());
	}

	@Test
	@DisplayName("Record 3393: State is CA")
	void StateOfRecord3393() {
		assertEquals("CA", customers.get(3392).getState());
	}

	@Test
	@DisplayName("Record 3393: ZIP is 94403")
	void ZIPOfRecord3393() {
		assertEquals("94403", customers.get(3392).getZIP());
	}

	@Test
	@DisplayName("Record 3393: Phone is 650-286-5942")
	void PhoneOfRecord3393() {
		assertEquals("650-286-5942", customers.get(3392).getPhone());
	}

	@Test
	@DisplayName("Record 3393: Fax is 650-286-4081")
	void FaxOfRecord3393() {
		assertEquals("650-286-4081", customers.get(3392).getFax());
	}

	@Test
	@DisplayName("Record 3393: Email is werner@poinelli.com")
	void EmailOfRecord3393() {
		assertEquals("werner@poinelli.com", customers.get(3392).getEmail());
	}

	@Test
	@DisplayName("Record 3393: Web is http://www.wernerpoinelli.com")
	void WebOfRecord3393() {
		assertEquals("http://www.wernerpoinelli.com", customers.get(3392).getWeb());
	}
}
