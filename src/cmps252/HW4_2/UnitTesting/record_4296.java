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

@Tag("8")
class Record_4296 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4296: FirstName is Justine")
	void FirstNameOfRecord4296() {
		assertEquals("Justine", customers.get(4295).getFirstName());
	}

	@Test
	@DisplayName("Record 4296: LastName is Hirschfield")
	void LastNameOfRecord4296() {
		assertEquals("Hirschfield", customers.get(4295).getLastName());
	}

	@Test
	@DisplayName("Record 4296: Company is Labelwright Inc")
	void CompanyOfRecord4296() {
		assertEquals("Labelwright Inc", customers.get(4295).getCompany());
	}

	@Test
	@DisplayName("Record 4296: Address is 1650 W 82nd St  #-1100")
	void AddressOfRecord4296() {
		assertEquals("1650 W 82nd St  #-1100", customers.get(4295).getAddress());
	}

	@Test
	@DisplayName("Record 4296: City is Minneapolis")
	void CityOfRecord4296() {
		assertEquals("Minneapolis", customers.get(4295).getCity());
	}

	@Test
	@DisplayName("Record 4296: County is Hennepin")
	void CountyOfRecord4296() {
		assertEquals("Hennepin", customers.get(4295).getCounty());
	}

	@Test
	@DisplayName("Record 4296: State is MN")
	void StateOfRecord4296() {
		assertEquals("MN", customers.get(4295).getState());
	}

	@Test
	@DisplayName("Record 4296: ZIP is 55431")
	void ZIPOfRecord4296() {
		assertEquals("55431", customers.get(4295).getZIP());
	}

	@Test
	@DisplayName("Record 4296: Phone is 952-885-0030")
	void PhoneOfRecord4296() {
		assertEquals("952-885-0030", customers.get(4295).getPhone());
	}

	@Test
	@DisplayName("Record 4296: Fax is 952-885-6187")
	void FaxOfRecord4296() {
		assertEquals("952-885-6187", customers.get(4295).getFax());
	}

	@Test
	@DisplayName("Record 4296: Email is justine@hirschfield.com")
	void EmailOfRecord4296() {
		assertEquals("justine@hirschfield.com", customers.get(4295).getEmail());
	}

	@Test
	@DisplayName("Record 4296: Web is http://www.justinehirschfield.com")
	void WebOfRecord4296() {
		assertEquals("http://www.justinehirschfield.com", customers.get(4295).getWeb());
	}
}
