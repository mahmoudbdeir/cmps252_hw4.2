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
class Record_2645 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2645: FirstName is Les")
	void FirstNameOfRecord2645() {
		assertEquals("Les", customers.get(2644).getFirstName());
	}

	@Test
	@DisplayName("Record 2645: LastName is Marungo")
	void LastNameOfRecord2645() {
		assertEquals("Marungo", customers.get(2644).getLastName());
	}

	@Test
	@DisplayName("Record 2645: Company is Ken M Healy & Associates Inc")
	void CompanyOfRecord2645() {
		assertEquals("Ken M Healy & Associates Inc", customers.get(2644).getCompany());
	}

	@Test
	@DisplayName("Record 2645: Address is 907 S Broad St")
	void AddressOfRecord2645() {
		assertEquals("907 S Broad St", customers.get(2644).getAddress());
	}

	@Test
	@DisplayName("Record 2645: City is New Orleans")
	void CityOfRecord2645() {
		assertEquals("New Orleans", customers.get(2644).getCity());
	}

	@Test
	@DisplayName("Record 2645: County is Orleans")
	void CountyOfRecord2645() {
		assertEquals("Orleans", customers.get(2644).getCounty());
	}

	@Test
	@DisplayName("Record 2645: State is LA")
	void StateOfRecord2645() {
		assertEquals("LA", customers.get(2644).getState());
	}

	@Test
	@DisplayName("Record 2645: ZIP is 70125")
	void ZIPOfRecord2645() {
		assertEquals("70125", customers.get(2644).getZIP());
	}

	@Test
	@DisplayName("Record 2645: Phone is 504-822-0353")
	void PhoneOfRecord2645() {
		assertEquals("504-822-0353", customers.get(2644).getPhone());
	}

	@Test
	@DisplayName("Record 2645: Fax is 504-822-1667")
	void FaxOfRecord2645() {
		assertEquals("504-822-1667", customers.get(2644).getFax());
	}

	@Test
	@DisplayName("Record 2645: Email is les@marungo.com")
	void EmailOfRecord2645() {
		assertEquals("les@marungo.com", customers.get(2644).getEmail());
	}

	@Test
	@DisplayName("Record 2645: Web is http://www.lesmarungo.com")
	void WebOfRecord2645() {
		assertEquals("http://www.lesmarungo.com", customers.get(2644).getWeb());
	}
}
