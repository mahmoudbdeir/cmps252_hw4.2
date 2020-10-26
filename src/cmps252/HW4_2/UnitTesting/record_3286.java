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

@Tag("48")
class Record_3286 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3286: FirstName is Camilla")
	void FirstNameOfRecord3286() {
		assertEquals("Camilla", customers.get(3285).getFirstName());
	}

	@Test
	@DisplayName("Record 3286: LastName is Emerling")
	void LastNameOfRecord3286() {
		assertEquals("Emerling", customers.get(3285).getLastName());
	}

	@Test
	@DisplayName("Record 3286: Company is Debelius, Anne C Esq")
	void CompanyOfRecord3286() {
		assertEquals("Debelius, Anne C Esq", customers.get(3285).getCompany());
	}

	@Test
	@DisplayName("Record 3286: Address is 80 W Bridge St")
	void AddressOfRecord3286() {
		assertEquals("80 W Bridge St", customers.get(3285).getAddress());
	}

	@Test
	@DisplayName("Record 3286: City is New Hope")
	void CityOfRecord3286() {
		assertEquals("New Hope", customers.get(3285).getCity());
	}

	@Test
	@DisplayName("Record 3286: County is Bucks")
	void CountyOfRecord3286() {
		assertEquals("Bucks", customers.get(3285).getCounty());
	}

	@Test
	@DisplayName("Record 3286: State is PA")
	void StateOfRecord3286() {
		assertEquals("PA", customers.get(3285).getState());
	}

	@Test
	@DisplayName("Record 3286: ZIP is 18938")
	void ZIPOfRecord3286() {
		assertEquals("18938", customers.get(3285).getZIP());
	}

	@Test
	@DisplayName("Record 3286: Phone is 215-862-8789")
	void PhoneOfRecord3286() {
		assertEquals("215-862-8789", customers.get(3285).getPhone());
	}

	@Test
	@DisplayName("Record 3286: Fax is 215-862-8879")
	void FaxOfRecord3286() {
		assertEquals("215-862-8879", customers.get(3285).getFax());
	}

	@Test
	@DisplayName("Record 3286: Email is camilla@emerling.com")
	void EmailOfRecord3286() {
		assertEquals("camilla@emerling.com", customers.get(3285).getEmail());
	}

	@Test
	@DisplayName("Record 3286: Web is http://www.camillaemerling.com")
	void WebOfRecord3286() {
		assertEquals("http://www.camillaemerling.com", customers.get(3285).getWeb());
	}
}
