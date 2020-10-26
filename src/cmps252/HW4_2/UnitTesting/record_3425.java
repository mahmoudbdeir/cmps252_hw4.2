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
class Record_3425 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3425: FirstName is Ike")
	void FirstNameOfRecord3425() {
		assertEquals("Ike", customers.get(3424).getFirstName());
	}

	@Test
	@DisplayName("Record 3425: LastName is Bollozos")
	void LastNameOfRecord3425() {
		assertEquals("Bollozos", customers.get(3424).getLastName());
	}

	@Test
	@DisplayName("Record 3425: Company is Bushman, Rex B Esq")
	void CompanyOfRecord3425() {
		assertEquals("Bushman, Rex B Esq", customers.get(3424).getCompany());
	}

	@Test
	@DisplayName("Record 3425: Address is 1928 Nw 82nd Ave")
	void AddressOfRecord3425() {
		assertEquals("1928 Nw 82nd Ave", customers.get(3424).getAddress());
	}

	@Test
	@DisplayName("Record 3425: City is Miami")
	void CityOfRecord3425() {
		assertEquals("Miami", customers.get(3424).getCity());
	}

	@Test
	@DisplayName("Record 3425: County is Miami-Dade")
	void CountyOfRecord3425() {
		assertEquals("Miami-Dade", customers.get(3424).getCounty());
	}

	@Test
	@DisplayName("Record 3425: State is FL")
	void StateOfRecord3425() {
		assertEquals("FL", customers.get(3424).getState());
	}

	@Test
	@DisplayName("Record 3425: ZIP is 33126")
	void ZIPOfRecord3425() {
		assertEquals("33126", customers.get(3424).getZIP());
	}

	@Test
	@DisplayName("Record 3425: Phone is 305-715-8972")
	void PhoneOfRecord3425() {
		assertEquals("305-715-8972", customers.get(3424).getPhone());
	}

	@Test
	@DisplayName("Record 3425: Fax is 305-715-7405")
	void FaxOfRecord3425() {
		assertEquals("305-715-7405", customers.get(3424).getFax());
	}

	@Test
	@DisplayName("Record 3425: Email is ike@bollozos.com")
	void EmailOfRecord3425() {
		assertEquals("ike@bollozos.com", customers.get(3424).getEmail());
	}

	@Test
	@DisplayName("Record 3425: Web is http://www.ikebollozos.com")
	void WebOfRecord3425() {
		assertEquals("http://www.ikebollozos.com", customers.get(3424).getWeb());
	}
}
