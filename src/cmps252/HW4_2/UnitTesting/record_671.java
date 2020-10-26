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

@Tag("34")
class Record_671 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 671: FirstName is Kellie")
	void FirstNameOfRecord671() {
		assertEquals("Kellie", customers.get(670).getFirstName());
	}

	@Test
	@DisplayName("Record 671: LastName is Sowinski")
	void LastNameOfRecord671() {
		assertEquals("Sowinski", customers.get(670).getLastName());
	}

	@Test
	@DisplayName("Record 671: Company is H & H Qwik Mail Copy Center")
	void CompanyOfRecord671() {
		assertEquals("H & H Qwik Mail Copy Center", customers.get(670).getCompany());
	}

	@Test
	@DisplayName("Record 671: Address is 961197 Waihona St")
	void AddressOfRecord671() {
		assertEquals("961197 Waihona St", customers.get(670).getAddress());
	}

	@Test
	@DisplayName("Record 671: City is Pearl City")
	void CityOfRecord671() {
		assertEquals("Pearl City", customers.get(670).getCity());
	}

	@Test
	@DisplayName("Record 671: County is Honolulu")
	void CountyOfRecord671() {
		assertEquals("Honolulu", customers.get(670).getCounty());
	}

	@Test
	@DisplayName("Record 671: State is HI")
	void StateOfRecord671() {
		assertEquals("HI", customers.get(670).getState());
	}

	@Test
	@DisplayName("Record 671: ZIP is 96782")
	void ZIPOfRecord671() {
		assertEquals("96782", customers.get(670).getZIP());
	}

	@Test
	@DisplayName("Record 671: Phone is 808-456-2020")
	void PhoneOfRecord671() {
		assertEquals("808-456-2020", customers.get(670).getPhone());
	}

	@Test
	@DisplayName("Record 671: Fax is 808-456-7534")
	void FaxOfRecord671() {
		assertEquals("808-456-7534", customers.get(670).getFax());
	}

	@Test
	@DisplayName("Record 671: Email is kellie@sowinski.com")
	void EmailOfRecord671() {
		assertEquals("kellie@sowinski.com", customers.get(670).getEmail());
	}

	@Test
	@DisplayName("Record 671: Web is http://www.kelliesowinski.com")
	void WebOfRecord671() {
		assertEquals("http://www.kelliesowinski.com", customers.get(670).getWeb());
	}
}
