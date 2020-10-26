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

@Tag("38")
class Record_989 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 989: FirstName is Sondra")
	void FirstNameOfRecord989() {
		assertEquals("Sondra", customers.get(988).getFirstName());
	}

	@Test
	@DisplayName("Record 989: LastName is Tapp")
	void LastNameOfRecord989() {
		assertEquals("Tapp", customers.get(988).getLastName());
	}

	@Test
	@DisplayName("Record 989: Company is Pischel, Kenneth Phd")
	void CompanyOfRecord989() {
		assertEquals("Pischel, Kenneth Phd", customers.get(988).getCompany());
	}

	@Test
	@DisplayName("Record 989: Address is 22607 S Dixie Hwy")
	void AddressOfRecord989() {
		assertEquals("22607 S Dixie Hwy", customers.get(988).getAddress());
	}

	@Test
	@DisplayName("Record 989: City is Miami")
	void CityOfRecord989() {
		assertEquals("Miami", customers.get(988).getCity());
	}

	@Test
	@DisplayName("Record 989: County is Miami-Dade")
	void CountyOfRecord989() {
		assertEquals("Miami-Dade", customers.get(988).getCounty());
	}

	@Test
	@DisplayName("Record 989: State is FL")
	void StateOfRecord989() {
		assertEquals("FL", customers.get(988).getState());
	}

	@Test
	@DisplayName("Record 989: ZIP is 33170")
	void ZIPOfRecord989() {
		assertEquals("33170", customers.get(988).getZIP());
	}

	@Test
	@DisplayName("Record 989: Phone is 305-258-2271")
	void PhoneOfRecord989() {
		assertEquals("305-258-2271", customers.get(988).getPhone());
	}

	@Test
	@DisplayName("Record 989: Fax is 305-258-2587")
	void FaxOfRecord989() {
		assertEquals("305-258-2587", customers.get(988).getFax());
	}

	@Test
	@DisplayName("Record 989: Email is sondra@tapp.com")
	void EmailOfRecord989() {
		assertEquals("sondra@tapp.com", customers.get(988).getEmail());
	}

	@Test
	@DisplayName("Record 989: Web is http://www.sondratapp.com")
	void WebOfRecord989() {
		assertEquals("http://www.sondratapp.com", customers.get(988).getWeb());
	}
}
