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

@Tag("18")
class Record_223 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 223: FirstName is Eloise")
	void FirstNameOfRecord223() {
		assertEquals("Eloise", customers.get(222).getFirstName());
	}

	@Test
	@DisplayName("Record 223: LastName is Nill")
	void LastNameOfRecord223() {
		assertEquals("Nill", customers.get(222).getLastName());
	}

	@Test
	@DisplayName("Record 223: Company is Bundy, David H Esq")
	void CompanyOfRecord223() {
		assertEquals("Bundy, David H Esq", customers.get(222).getCompany());
	}

	@Test
	@DisplayName("Record 223: Address is 350 Leland Ave")
	void AddressOfRecord223() {
		assertEquals("350 Leland Ave", customers.get(222).getAddress());
	}

	@Test
	@DisplayName("Record 223: City is Plainfield")
	void CityOfRecord223() {
		assertEquals("Plainfield", customers.get(222).getCity());
	}

	@Test
	@DisplayName("Record 223: County is Union")
	void CountyOfRecord223() {
		assertEquals("Union", customers.get(222).getCounty());
	}

	@Test
	@DisplayName("Record 223: State is NJ")
	void StateOfRecord223() {
		assertEquals("NJ", customers.get(222).getState());
	}

	@Test
	@DisplayName("Record 223: ZIP is 7062")
	void ZIPOfRecord223() {
		assertEquals("7062", customers.get(222).getZIP());
	}

	@Test
	@DisplayName("Record 223: Phone is 908-755-5027")
	void PhoneOfRecord223() {
		assertEquals("908-755-5027", customers.get(222).getPhone());
	}

	@Test
	@DisplayName("Record 223: Fax is 908-755-6787")
	void FaxOfRecord223() {
		assertEquals("908-755-6787", customers.get(222).getFax());
	}

	@Test
	@DisplayName("Record 223: Email is eloise@nill.com")
	void EmailOfRecord223() {
		assertEquals("eloise@nill.com", customers.get(222).getEmail());
	}

	@Test
	@DisplayName("Record 223: Web is http://www.eloisenill.com")
	void WebOfRecord223() {
		assertEquals("http://www.eloisenill.com", customers.get(222).getWeb());
	}
}
