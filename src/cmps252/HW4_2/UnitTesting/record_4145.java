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

@Tag("20")
class Record_4145 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4145: FirstName is Willa")
	void FirstNameOfRecord4145() {
		assertEquals("Willa", customers.get(4144).getFirstName());
	}

	@Test
	@DisplayName("Record 4145: LastName is Goldwyn")
	void LastNameOfRecord4145() {
		assertEquals("Goldwyn", customers.get(4144).getLastName());
	}

	@Test
	@DisplayName("Record 4145: Company is Feldmyer, John R Esq")
	void CompanyOfRecord4145() {
		assertEquals("Feldmyer, John R Esq", customers.get(4144).getCompany());
	}

	@Test
	@DisplayName("Record 4145: Address is 711 Kains Ave")
	void AddressOfRecord4145() {
		assertEquals("711 Kains Ave", customers.get(4144).getAddress());
	}

	@Test
	@DisplayName("Record 4145: City is San Bruno")
	void CityOfRecord4145() {
		assertEquals("San Bruno", customers.get(4144).getCity());
	}

	@Test
	@DisplayName("Record 4145: County is San Mateo")
	void CountyOfRecord4145() {
		assertEquals("San Mateo", customers.get(4144).getCounty());
	}

	@Test
	@DisplayName("Record 4145: State is CA")
	void StateOfRecord4145() {
		assertEquals("CA", customers.get(4144).getState());
	}

	@Test
	@DisplayName("Record 4145: ZIP is 94066")
	void ZIPOfRecord4145() {
		assertEquals("94066", customers.get(4144).getZIP());
	}

	@Test
	@DisplayName("Record 4145: Phone is 650-583-2283")
	void PhoneOfRecord4145() {
		assertEquals("650-583-2283", customers.get(4144).getPhone());
	}

	@Test
	@DisplayName("Record 4145: Fax is 650-583-7676")
	void FaxOfRecord4145() {
		assertEquals("650-583-7676", customers.get(4144).getFax());
	}

	@Test
	@DisplayName("Record 4145: Email is willa@goldwyn.com")
	void EmailOfRecord4145() {
		assertEquals("willa@goldwyn.com", customers.get(4144).getEmail());
	}

	@Test
	@DisplayName("Record 4145: Web is http://www.willagoldwyn.com")
	void WebOfRecord4145() {
		assertEquals("http://www.willagoldwyn.com", customers.get(4144).getWeb());
	}
}
