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

@Tag("42")
class Record_761 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 761: FirstName is Caitlin")
	void FirstNameOfRecord761() {
		assertEquals("Caitlin", customers.get(760).getFirstName());
	}

	@Test
	@DisplayName("Record 761: LastName is Canelo")
	void LastNameOfRecord761() {
		assertEquals("Canelo", customers.get(760).getLastName());
	}

	@Test
	@DisplayName("Record 761: Company is Pace, Patrick D Esq")
	void CompanyOfRecord761() {
		assertEquals("Pace, Patrick D Esq", customers.get(760).getCompany());
	}

	@Test
	@DisplayName("Record 761: Address is 19800 Hawthorne Blvd  #-206")
	void AddressOfRecord761() {
		assertEquals("19800 Hawthorne Blvd  #-206", customers.get(760).getAddress());
	}

	@Test
	@DisplayName("Record 761: City is Torrance")
	void CityOfRecord761() {
		assertEquals("Torrance", customers.get(760).getCity());
	}

	@Test
	@DisplayName("Record 761: County is Los Angeles")
	void CountyOfRecord761() {
		assertEquals("Los Angeles", customers.get(760).getCounty());
	}

	@Test
	@DisplayName("Record 761: State is CA")
	void StateOfRecord761() {
		assertEquals("CA", customers.get(760).getState());
	}

	@Test
	@DisplayName("Record 761: ZIP is 90503")
	void ZIPOfRecord761() {
		assertEquals("90503", customers.get(760).getZIP());
	}

	@Test
	@DisplayName("Record 761: Phone is 310-791-7614")
	void PhoneOfRecord761() {
		assertEquals("310-791-7614", customers.get(760).getPhone());
	}

	@Test
	@DisplayName("Record 761: Fax is 310-791-6637")
	void FaxOfRecord761() {
		assertEquals("310-791-6637", customers.get(760).getFax());
	}

	@Test
	@DisplayName("Record 761: Email is caitlin@canelo.com")
	void EmailOfRecord761() {
		assertEquals("caitlin@canelo.com", customers.get(760).getEmail());
	}

	@Test
	@DisplayName("Record 761: Web is http://www.caitlincanelo.com")
	void WebOfRecord761() {
		assertEquals("http://www.caitlincanelo.com", customers.get(760).getWeb());
	}
}
