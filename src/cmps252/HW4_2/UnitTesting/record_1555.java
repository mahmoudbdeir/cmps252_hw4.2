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
class Record_1555 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1555: FirstName is Christoper")
	void FirstNameOfRecord1555() {
		assertEquals("Christoper", customers.get(1554).getFirstName());
	}

	@Test
	@DisplayName("Record 1555: LastName is Harkins")
	void LastNameOfRecord1555() {
		assertEquals("Harkins", customers.get(1554).getLastName());
	}

	@Test
	@DisplayName("Record 1555: Company is Cavitch, Matthew P Esq")
	void CompanyOfRecord1555() {
		assertEquals("Cavitch, Matthew P Esq", customers.get(1554).getCompany());
	}

	@Test
	@DisplayName("Record 1555: Address is 6827 Nancy Ridge Dr")
	void AddressOfRecord1555() {
		assertEquals("6827 Nancy Ridge Dr", customers.get(1554).getAddress());
	}

	@Test
	@DisplayName("Record 1555: City is San Diego")
	void CityOfRecord1555() {
		assertEquals("San Diego", customers.get(1554).getCity());
	}

	@Test
	@DisplayName("Record 1555: County is San Diego")
	void CountyOfRecord1555() {
		assertEquals("San Diego", customers.get(1554).getCounty());
	}

	@Test
	@DisplayName("Record 1555: State is CA")
	void StateOfRecord1555() {
		assertEquals("CA", customers.get(1554).getState());
	}

	@Test
	@DisplayName("Record 1555: ZIP is 92121")
	void ZIPOfRecord1555() {
		assertEquals("92121", customers.get(1554).getZIP());
	}

	@Test
	@DisplayName("Record 1555: Phone is 858-455-1101")
	void PhoneOfRecord1555() {
		assertEquals("858-455-1101", customers.get(1554).getPhone());
	}

	@Test
	@DisplayName("Record 1555: Fax is 858-455-9628")
	void FaxOfRecord1555() {
		assertEquals("858-455-9628", customers.get(1554).getFax());
	}

	@Test
	@DisplayName("Record 1555: Email is christoper@harkins.com")
	void EmailOfRecord1555() {
		assertEquals("christoper@harkins.com", customers.get(1554).getEmail());
	}

	@Test
	@DisplayName("Record 1555: Web is http://www.christoperharkins.com")
	void WebOfRecord1555() {
		assertEquals("http://www.christoperharkins.com", customers.get(1554).getWeb());
	}
}
