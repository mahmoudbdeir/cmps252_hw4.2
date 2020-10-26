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

@Tag("33")
class Record_4052 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4052: FirstName is Jason")
	void FirstNameOfRecord4052() {
		assertEquals("Jason", customers.get(4051).getFirstName());
	}

	@Test
	@DisplayName("Record 4052: LastName is Forwood")
	void LastNameOfRecord4052() {
		assertEquals("Forwood", customers.get(4051).getLastName());
	}

	@Test
	@DisplayName("Record 4052: Company is Trad, Jumana E Esq")
	void CompanyOfRecord4052() {
		assertEquals("Trad, Jumana E Esq", customers.get(4051).getCompany());
	}

	@Test
	@DisplayName("Record 4052: Address is 2001 Welsh Rd")
	void AddressOfRecord4052() {
		assertEquals("2001 Welsh Rd", customers.get(4051).getAddress());
	}

	@Test
	@DisplayName("Record 4052: City is Abington")
	void CityOfRecord4052() {
		assertEquals("Abington", customers.get(4051).getCity());
	}

	@Test
	@DisplayName("Record 4052: County is Montgomery")
	void CountyOfRecord4052() {
		assertEquals("Montgomery", customers.get(4051).getCounty());
	}

	@Test
	@DisplayName("Record 4052: State is PA")
	void StateOfRecord4052() {
		assertEquals("PA", customers.get(4051).getState());
	}

	@Test
	@DisplayName("Record 4052: ZIP is 19001")
	void ZIPOfRecord4052() {
		assertEquals("19001", customers.get(4051).getZIP());
	}

	@Test
	@DisplayName("Record 4052: Phone is 215-884-6203")
	void PhoneOfRecord4052() {
		assertEquals("215-884-6203", customers.get(4051).getPhone());
	}

	@Test
	@DisplayName("Record 4052: Fax is 215-884-0121")
	void FaxOfRecord4052() {
		assertEquals("215-884-0121", customers.get(4051).getFax());
	}

	@Test
	@DisplayName("Record 4052: Email is jason@forwood.com")
	void EmailOfRecord4052() {
		assertEquals("jason@forwood.com", customers.get(4051).getEmail());
	}

	@Test
	@DisplayName("Record 4052: Web is http://www.jasonforwood.com")
	void WebOfRecord4052() {
		assertEquals("http://www.jasonforwood.com", customers.get(4051).getWeb());
	}
}
