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

@Tag("28")
class Record_4084 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4084: FirstName is Antione")
	void FirstNameOfRecord4084() {
		assertEquals("Antione", customers.get(4083).getFirstName());
	}

	@Test
	@DisplayName("Record 4084: LastName is Adkerson")
	void LastNameOfRecord4084() {
		assertEquals("Adkerson", customers.get(4083).getLastName());
	}

	@Test
	@DisplayName("Record 4084: Company is Campbell, Richard O Esq")
	void CompanyOfRecord4084() {
		assertEquals("Campbell, Richard O Esq", customers.get(4083).getCompany());
	}

	@Test
	@DisplayName("Record 4084: Address is 991410 Koaha Pl  #-a")
	void AddressOfRecord4084() {
		assertEquals("991410 Koaha Pl  #-a", customers.get(4083).getAddress());
	}

	@Test
	@DisplayName("Record 4084: City is Aiea")
	void CityOfRecord4084() {
		assertEquals("Aiea", customers.get(4083).getCity());
	}

	@Test
	@DisplayName("Record 4084: County is Honolulu")
	void CountyOfRecord4084() {
		assertEquals("Honolulu", customers.get(4083).getCounty());
	}

	@Test
	@DisplayName("Record 4084: State is HI")
	void StateOfRecord4084() {
		assertEquals("HI", customers.get(4083).getState());
	}

	@Test
	@DisplayName("Record 4084: ZIP is 96701")
	void ZIPOfRecord4084() {
		assertEquals("96701", customers.get(4083).getZIP());
	}

	@Test
	@DisplayName("Record 4084: Phone is 808-488-3294")
	void PhoneOfRecord4084() {
		assertEquals("808-488-3294", customers.get(4083).getPhone());
	}

	@Test
	@DisplayName("Record 4084: Fax is 808-488-4777")
	void FaxOfRecord4084() {
		assertEquals("808-488-4777", customers.get(4083).getFax());
	}

	@Test
	@DisplayName("Record 4084: Email is antione@adkerson.com")
	void EmailOfRecord4084() {
		assertEquals("antione@adkerson.com", customers.get(4083).getEmail());
	}

	@Test
	@DisplayName("Record 4084: Web is http://www.antioneadkerson.com")
	void WebOfRecord4084() {
		assertEquals("http://www.antioneadkerson.com", customers.get(4083).getWeb());
	}
}
