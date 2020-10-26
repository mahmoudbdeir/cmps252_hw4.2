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

@Tag("12")
class Record_1156 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1156: FirstName is Gene")
	void FirstNameOfRecord1156() {
		assertEquals("Gene", customers.get(1155).getFirstName());
	}

	@Test
	@DisplayName("Record 1156: LastName is Rueda")
	void LastNameOfRecord1156() {
		assertEquals("Rueda", customers.get(1155).getLastName());
	}

	@Test
	@DisplayName("Record 1156: Company is Lyles De Grazier Co")
	void CompanyOfRecord1156() {
		assertEquals("Lyles De Grazier Co", customers.get(1155).getCompany());
	}

	@Test
	@DisplayName("Record 1156: Address is 220 Commerce Way")
	void AddressOfRecord1156() {
		assertEquals("220 Commerce Way", customers.get(1155).getAddress());
	}

	@Test
	@DisplayName("Record 1156: City is Clovis")
	void CityOfRecord1156() {
		assertEquals("Clovis", customers.get(1155).getCity());
	}

	@Test
	@DisplayName("Record 1156: County is Curry")
	void CountyOfRecord1156() {
		assertEquals("Curry", customers.get(1155).getCounty());
	}

	@Test
	@DisplayName("Record 1156: State is NM")
	void StateOfRecord1156() {
		assertEquals("NM", customers.get(1155).getState());
	}

	@Test
	@DisplayName("Record 1156: ZIP is 88101")
	void ZIPOfRecord1156() {
		assertEquals("88101", customers.get(1155).getZIP());
	}

	@Test
	@DisplayName("Record 1156: Phone is 505-762-6178")
	void PhoneOfRecord1156() {
		assertEquals("505-762-6178", customers.get(1155).getPhone());
	}

	@Test
	@DisplayName("Record 1156: Fax is 505-762-4148")
	void FaxOfRecord1156() {
		assertEquals("505-762-4148", customers.get(1155).getFax());
	}

	@Test
	@DisplayName("Record 1156: Email is gene@rueda.com")
	void EmailOfRecord1156() {
		assertEquals("gene@rueda.com", customers.get(1155).getEmail());
	}

	@Test
	@DisplayName("Record 1156: Web is http://www.generueda.com")
	void WebOfRecord1156() {
		assertEquals("http://www.generueda.com", customers.get(1155).getWeb());
	}
}
