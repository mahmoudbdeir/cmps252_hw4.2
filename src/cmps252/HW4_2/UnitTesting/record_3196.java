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
class Record_3196 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3196: FirstName is Dwayne")
	void FirstNameOfRecord3196() {
		assertEquals("Dwayne", customers.get(3195).getFirstName());
	}

	@Test
	@DisplayName("Record 3196: LastName is Estell")
	void LastNameOfRecord3196() {
		assertEquals("Estell", customers.get(3195).getLastName());
	}

	@Test
	@DisplayName("Record 3196: Company is Southern Brick Co")
	void CompanyOfRecord3196() {
		assertEquals("Southern Brick Co", customers.get(3195).getCompany());
	}

	@Test
	@DisplayName("Record 3196: Address is 1414 12th St Nw")
	void AddressOfRecord3196() {
		assertEquals("1414 12th St Nw", customers.get(3195).getAddress());
	}

	@Test
	@DisplayName("Record 3196: City is Albuquerque")
	void CityOfRecord3196() {
		assertEquals("Albuquerque", customers.get(3195).getCity());
	}

	@Test
	@DisplayName("Record 3196: County is Bernalillo")
	void CountyOfRecord3196() {
		assertEquals("Bernalillo", customers.get(3195).getCounty());
	}

	@Test
	@DisplayName("Record 3196: State is NM")
	void StateOfRecord3196() {
		assertEquals("NM", customers.get(3195).getState());
	}

	@Test
	@DisplayName("Record 3196: ZIP is 87104")
	void ZIPOfRecord3196() {
		assertEquals("87104", customers.get(3195).getZIP());
	}

	@Test
	@DisplayName("Record 3196: Phone is 505-243-8756")
	void PhoneOfRecord3196() {
		assertEquals("505-243-8756", customers.get(3195).getPhone());
	}

	@Test
	@DisplayName("Record 3196: Fax is 505-243-7184")
	void FaxOfRecord3196() {
		assertEquals("505-243-7184", customers.get(3195).getFax());
	}

	@Test
	@DisplayName("Record 3196: Email is dwayne@estell.com")
	void EmailOfRecord3196() {
		assertEquals("dwayne@estell.com", customers.get(3195).getEmail());
	}

	@Test
	@DisplayName("Record 3196: Web is http://www.dwayneestell.com")
	void WebOfRecord3196() {
		assertEquals("http://www.dwayneestell.com", customers.get(3195).getWeb());
	}
}
