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

@Tag("22")
class Record_2517 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2517: FirstName is Beatriz")
	void FirstNameOfRecord2517() {
		assertEquals("Beatriz", customers.get(2516).getFirstName());
	}

	@Test
	@DisplayName("Record 2517: LastName is Vickerman")
	void LastNameOfRecord2517() {
		assertEquals("Vickerman", customers.get(2516).getLastName());
	}

	@Test
	@DisplayName("Record 2517: Company is Mills, William B Esq")
	void CompanyOfRecord2517() {
		assertEquals("Mills, William B Esq", customers.get(2516).getCompany());
	}

	@Test
	@DisplayName("Record 2517: Address is 2600 Neville Rd")
	void AddressOfRecord2517() {
		assertEquals("2600 Neville Rd", customers.get(2516).getAddress());
	}

	@Test
	@DisplayName("Record 2517: City is Pittsburgh")
	void CityOfRecord2517() {
		assertEquals("Pittsburgh", customers.get(2516).getCity());
	}

	@Test
	@DisplayName("Record 2517: County is Allegheny")
	void CountyOfRecord2517() {
		assertEquals("Allegheny", customers.get(2516).getCounty());
	}

	@Test
	@DisplayName("Record 2517: State is PA")
	void StateOfRecord2517() {
		assertEquals("PA", customers.get(2516).getState());
	}

	@Test
	@DisplayName("Record 2517: ZIP is 15225")
	void ZIPOfRecord2517() {
		assertEquals("15225", customers.get(2516).getZIP());
	}

	@Test
	@DisplayName("Record 2517: Phone is 412-771-6948")
	void PhoneOfRecord2517() {
		assertEquals("412-771-6948", customers.get(2516).getPhone());
	}

	@Test
	@DisplayName("Record 2517: Fax is 412-771-3224")
	void FaxOfRecord2517() {
		assertEquals("412-771-3224", customers.get(2516).getFax());
	}

	@Test
	@DisplayName("Record 2517: Email is beatriz@vickerman.com")
	void EmailOfRecord2517() {
		assertEquals("beatriz@vickerman.com", customers.get(2516).getEmail());
	}

	@Test
	@DisplayName("Record 2517: Web is http://www.beatrizvickerman.com")
	void WebOfRecord2517() {
		assertEquals("http://www.beatrizvickerman.com", customers.get(2516).getWeb());
	}
}
