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

@Tag("24")
class Record_3429 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3429: FirstName is Teddy")
	void FirstNameOfRecord3429() {
		assertEquals("Teddy", customers.get(3428).getFirstName());
	}

	@Test
	@DisplayName("Record 3429: LastName is Winkey")
	void LastNameOfRecord3429() {
		assertEquals("Winkey", customers.get(3428).getLastName());
	}

	@Test
	@DisplayName("Record 3429: Company is Vlock, Stephen Esq")
	void CompanyOfRecord3429() {
		assertEquals("Vlock, Stephen Esq", customers.get(3428).getCompany());
	}

	@Test
	@DisplayName("Record 3429: Address is 1063 S Clinton Ave")
	void AddressOfRecord3429() {
		assertEquals("1063 S Clinton Ave", customers.get(3428).getAddress());
	}

	@Test
	@DisplayName("Record 3429: City is Trenton")
	void CityOfRecord3429() {
		assertEquals("Trenton", customers.get(3428).getCity());
	}

	@Test
	@DisplayName("Record 3429: County is Mercer")
	void CountyOfRecord3429() {
		assertEquals("Mercer", customers.get(3428).getCounty());
	}

	@Test
	@DisplayName("Record 3429: State is NJ")
	void StateOfRecord3429() {
		assertEquals("NJ", customers.get(3428).getState());
	}

	@Test
	@DisplayName("Record 3429: ZIP is 08611")
	void ZIPOfRecord3429() {
		assertEquals("08611", customers.get(3428).getZIP());
	}

	@Test
	@DisplayName("Record 3429: Phone is 609-989-6938")
	void PhoneOfRecord3429() {
		assertEquals("609-989-6938", customers.get(3428).getPhone());
	}

	@Test
	@DisplayName("Record 3429: Fax is 609-989-2472")
	void FaxOfRecord3429() {
		assertEquals("609-989-2472", customers.get(3428).getFax());
	}

	@Test
	@DisplayName("Record 3429: Email is teddy@winkey.com")
	void EmailOfRecord3429() {
		assertEquals("teddy@winkey.com", customers.get(3428).getEmail());
	}

	@Test
	@DisplayName("Record 3429: Web is http://www.teddywinkey.com")
	void WebOfRecord3429() {
		assertEquals("http://www.teddywinkey.com", customers.get(3428).getWeb());
	}
}
