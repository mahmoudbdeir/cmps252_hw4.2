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

@Tag("44")
class Record_1197 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1197: FirstName is Lawrence")
	void FirstNameOfRecord1197() {
		assertEquals("Lawrence", customers.get(1196).getFirstName());
	}

	@Test
	@DisplayName("Record 1197: LastName is Buccellato")
	void LastNameOfRecord1197() {
		assertEquals("Buccellato", customers.get(1196).getLastName());
	}

	@Test
	@DisplayName("Record 1197: Company is Hilo Macaroni Factory Ltd")
	void CompanyOfRecord1197() {
		assertEquals("Hilo Macaroni Factory Ltd", customers.get(1196).getCompany());
	}

	@Test
	@DisplayName("Record 1197: Address is 1015 Hope St")
	void AddressOfRecord1197() {
		assertEquals("1015 Hope St", customers.get(1196).getAddress());
	}

	@Test
	@DisplayName("Record 1197: City is South Pasadena")
	void CityOfRecord1197() {
		assertEquals("South Pasadena", customers.get(1196).getCity());
	}

	@Test
	@DisplayName("Record 1197: County is Los Angeles")
	void CountyOfRecord1197() {
		assertEquals("Los Angeles", customers.get(1196).getCounty());
	}

	@Test
	@DisplayName("Record 1197: State is CA")
	void StateOfRecord1197() {
		assertEquals("CA", customers.get(1196).getState());
	}

	@Test
	@DisplayName("Record 1197: ZIP is 91030")
	void ZIPOfRecord1197() {
		assertEquals("91030", customers.get(1196).getZIP());
	}

	@Test
	@DisplayName("Record 1197: Phone is 626-799-6194")
	void PhoneOfRecord1197() {
		assertEquals("626-799-6194", customers.get(1196).getPhone());
	}

	@Test
	@DisplayName("Record 1197: Fax is 626-799-0463")
	void FaxOfRecord1197() {
		assertEquals("626-799-0463", customers.get(1196).getFax());
	}

	@Test
	@DisplayName("Record 1197: Email is lawrence@buccellato.com")
	void EmailOfRecord1197() {
		assertEquals("lawrence@buccellato.com", customers.get(1196).getEmail());
	}

	@Test
	@DisplayName("Record 1197: Web is http://www.lawrencebuccellato.com")
	void WebOfRecord1197() {
		assertEquals("http://www.lawrencebuccellato.com", customers.get(1196).getWeb());
	}
}
