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

@Tag("35")
class Record_4935 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4935: FirstName is Alyce")
	void FirstNameOfRecord4935() {
		assertEquals("Alyce", customers.get(4934).getFirstName());
	}

	@Test
	@DisplayName("Record 4935: LastName is Dilillo")
	void LastNameOfRecord4935() {
		assertEquals("Dilillo", customers.get(4934).getLastName());
	}

	@Test
	@DisplayName("Record 4935: Company is Poly Plus Inc")
	void CompanyOfRecord4935() {
		assertEquals("Poly Plus Inc", customers.get(4934).getCompany());
	}

	@Test
	@DisplayName("Record 4935: Address is 800 W Airport Fwy")
	void AddressOfRecord4935() {
		assertEquals("800 W Airport Fwy", customers.get(4934).getAddress());
	}

	@Test
	@DisplayName("Record 4935: City is Irving")
	void CityOfRecord4935() {
		assertEquals("Irving", customers.get(4934).getCity());
	}

	@Test
	@DisplayName("Record 4935: County is Dallas")
	void CountyOfRecord4935() {
		assertEquals("Dallas", customers.get(4934).getCounty());
	}

	@Test
	@DisplayName("Record 4935: State is TX")
	void StateOfRecord4935() {
		assertEquals("TX", customers.get(4934).getState());
	}

	@Test
	@DisplayName("Record 4935: ZIP is 75062")
	void ZIPOfRecord4935() {
		assertEquals("75062", customers.get(4934).getZIP());
	}

	@Test
	@DisplayName("Record 4935: Phone is 972-554-5610")
	void PhoneOfRecord4935() {
		assertEquals("972-554-5610", customers.get(4934).getPhone());
	}

	@Test
	@DisplayName("Record 4935: Fax is 972-554-0829")
	void FaxOfRecord4935() {
		assertEquals("972-554-0829", customers.get(4934).getFax());
	}

	@Test
	@DisplayName("Record 4935: Email is alyce@dilillo.com")
	void EmailOfRecord4935() {
		assertEquals("alyce@dilillo.com", customers.get(4934).getEmail());
	}

	@Test
	@DisplayName("Record 4935: Web is http://www.alycedilillo.com")
	void WebOfRecord4935() {
		assertEquals("http://www.alycedilillo.com", customers.get(4934).getWeb());
	}
}
