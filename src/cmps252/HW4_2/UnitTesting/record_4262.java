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
class Record_4262 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4262: FirstName is Johnathon")
	void FirstNameOfRecord4262() {
		assertEquals("Johnathon", customers.get(4261).getFirstName());
	}

	@Test
	@DisplayName("Record 4262: LastName is Genna")
	void LastNameOfRecord4262() {
		assertEquals("Genna", customers.get(4261).getLastName());
	}

	@Test
	@DisplayName("Record 4262: Company is F N T Industries Inc")
	void CompanyOfRecord4262() {
		assertEquals("F N T Industries Inc", customers.get(4261).getCompany());
	}

	@Test
	@DisplayName("Record 4262: Address is 4192 W Maple Ave")
	void AddressOfRecord4262() {
		assertEquals("4192 W Maple Ave", customers.get(4261).getAddress());
	}

	@Test
	@DisplayName("Record 4262: City is Adrian")
	void CityOfRecord4262() {
		assertEquals("Adrian", customers.get(4261).getCity());
	}

	@Test
	@DisplayName("Record 4262: County is Lenawee")
	void CountyOfRecord4262() {
		assertEquals("Lenawee", customers.get(4261).getCounty());
	}

	@Test
	@DisplayName("Record 4262: State is MI")
	void StateOfRecord4262() {
		assertEquals("MI", customers.get(4261).getState());
	}

	@Test
	@DisplayName("Record 4262: ZIP is 49221")
	void ZIPOfRecord4262() {
		assertEquals("49221", customers.get(4261).getZIP());
	}

	@Test
	@DisplayName("Record 4262: Phone is 517-265-3697")
	void PhoneOfRecord4262() {
		assertEquals("517-265-3697", customers.get(4261).getPhone());
	}

	@Test
	@DisplayName("Record 4262: Fax is 517-265-5157")
	void FaxOfRecord4262() {
		assertEquals("517-265-5157", customers.get(4261).getFax());
	}

	@Test
	@DisplayName("Record 4262: Email is johnathon@genna.com")
	void EmailOfRecord4262() {
		assertEquals("johnathon@genna.com", customers.get(4261).getEmail());
	}

	@Test
	@DisplayName("Record 4262: Web is http://www.johnathongenna.com")
	void WebOfRecord4262() {
		assertEquals("http://www.johnathongenna.com", customers.get(4261).getWeb());
	}
}
